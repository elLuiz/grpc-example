package KeyValue;

import com.example.grpc.KeyValueGrpc;
import com.example.grpc.KeyValueOuterClass.NullableValue;
import com.example.grpc.KeyValueOuterClass.Status;
import com.example.grpc.KeyValueOuterClass.Value;
import com.google.protobuf.ByteString;
import com.example.grpc.KeyValueOuterClass.SetKeyValueRequest;
import com.example.grpc.KeyValueOuterClass.GetValueRequest;
import com.google.protobuf.BytesValue;
import com.google.protobuf.StringValue;
import io.grpc.stub.StreamObserver;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.UUID;

public class KeyValueService extends KeyValueGrpc.KeyValueImplBase {
    private HashMap<ByteString, ValueHandler> hashMap = new HashMap<ByteString, ValueHandler>();

    @Override
    public void setKV(SetKeyValueRequest request, StreamObserver<Status> responseObserver) {
        ValueHandler value = new ValueHandler();
        Status APIResponse;

        ByteString key = setKey();

        if(hashMap.putIfAbsent(key, value.setValueHandler(request)) == null){
            APIResponse = setResponse(false, key, "SUCCESS");
        }else{
            APIResponse = setResponse(true, key, "ERROR");
        }

        responseObserver.onNext(APIResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getKV(GetValueRequest request, StreamObserver<Status> responseObserver) {
        ByteString key = request.getKey();
        System.out.println(key);
        ValueHandler value = hashMap.get(key);
        Status APIResponse;

        if(value == null)
            APIResponse = setResponse(false, key, "ERROR");
        else
            APIResponse = setResponse(true, key, "SUCCESS");


        responseObserver.onNext(APIResponse);
        responseObserver.onCompleted();
    }

    private Status setResponse(boolean isKeyInserted, ByteString key, String status){
        Status.Builder response = Status.newBuilder();
        ValueHandler valueHandler = hashMap.get(key);

        if(isKeyInserted){
            Value.Builder valueBuilder = Value.newBuilder();
            valueBuilder.setVersion(valueHandler.getVersion());
            valueBuilder.setTimestamp(valueHandler.getTimestamp());
            valueBuilder.setData(valueHandler.getData());

            response.setStatus(status);
            response.setValue(valueBuilder.build());
        }else{
//            TODO: Send a null value back
//            NullableValue.Builder nullValueBuilder = NullableValue.newBuilder();
//            nullValueBuilder.setNullableString((StringValue.Builder) null);

            response.setStatus(status);
//            response.setNullValue(nullValueBuilder.build());
        }

        return response.build();
    }

    private ByteString setKey(){
        ByteString key =  ByteString.copyFrom(UUID.randomUUID().toString(), Charset.defaultCharset());
        return key;
    }
}

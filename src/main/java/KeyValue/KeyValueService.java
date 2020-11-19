package KeyValue;

import com.example.grpc.KeyValueGrpc;
import com.example.grpc.KeyValueOuterClass;
import com.example.grpc.KeyValueOuterClass.Status;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;

public class KeyValueService extends KeyValueGrpc.KeyValueImplBase {
    private HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
    @Override
    public void setKV(KeyValueOuterClass.SetKeyValueRequest request, StreamObserver<Status> responseObserver) {
        System.out.println("User entered the set area");
        int key = request.getKey();
        String value = request.getValue();
        hashMap.put(key, value);
        Status APIResponse;
        if(hashMap.putIfAbsent(key, value) == null){
            APIResponse = setResponse(true, "The key already exists.");
        }else{
            APIResponse = setResponse(false, "Key inserted.");
        }

        responseObserver.onNext(APIResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getKV(KeyValueOuterClass.GetValueRequest request, StreamObserver<Status> responseObserver) {
        System.out.println("Entered the get service");
        int key = request.getKey();
        String value = hashMap.get(key);
        Status APIResponse;

        if(value == null){
            APIResponse = setResponse(true, "Key does not exist.");
        }else{
            APIResponse = setResponse(false, value);
        }

        responseObserver.onNext(APIResponse);
        responseObserver.onCompleted();
    }

    private Status setResponse(boolean isErrorResponse, String message){
        Status.Builder response = Status.newBuilder();

        if(isErrorResponse){
            response.setCode(401);
            response.setValue(message);
        }else{
            response.setCode(200);
            response.setValue(message);
        }

        return response.build();
    }
}

package KeyValue;

import com.example.grpc.KeyValueGrpc;
import com.example.grpc.KeyValueGrpc.KeyValueBlockingStub;

import com.example.grpc.KeyValueOuterClass.GetValueRequest;
import com.example.grpc.KeyValueOuterClass.Value;
import com.example.grpc.KeyValueOuterClass.SetKeyValueRequest;
import com.example.grpc.KeyValueOuterClass.Status;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import utils.ByteStringHandler;

public class KeyValueClient {
    private static ManagedChannelBuilder channelBuilder;
    private static ManagedChannel channel;
    private static KeyValueBlockingStub clientKeyValueStub;

    public static void main(String []args){
        connectToServer();
        System.out.println("SET REQUEST: ");
        setKeyValue();
        System.out.println("GET REQUEST: ");
        getValue();
    }

    public static void connectToServer(){
        channelBuilder = ManagedChannelBuilder.forAddress("localhost",8080).usePlaintext();
        channel = channelBuilder.build();
        clientKeyValueStub = KeyValueGrpc.newBlockingStub(channel);
    }

    public static void setKeyValue(){
        SetKeyValueRequest setKeyValueRequest = SetKeyValueRequest.newBuilder().setValue(buildValueTuple()).build();
        Status response = clientKeyValueStub.setKV(setKeyValueRequest);
        displayResponse(response);
    }

    public static void getValue(){
        GetValueRequest getValueRequest = GetValueRequest.newBuilder().setKey(ByteStringHandler.convertFromStringToBytes("1010")).build();
        Status response = clientKeyValueStub.getKV(getValueRequest);
        displayResponse(response);
    }

    private static Value buildValueTuple(){
        Value.Builder valueBuilder = Value.newBuilder();
        valueBuilder.setData(ByteStringHandler.convertFromStringToBytes("GRPC"));

        return valueBuilder.build();
    }

    private static void displayResponse(Status response){
        if(response.getStatus().equals("SUCCESS")){
            System.out.println("Status: " + response.getStatus());
        }else{
            System.out.println("Status: " + response.getStatus());
            System.out.println("Timestamp: " + response.getValue().getTimestamp());
            System.out.println("Data: " +  ByteStringHandler.convertFromBytesToString(response.getValue().getData()));
        }
    }
}
package KeyValue;

import com.example.grpc.KeyValueGrpc;
import com.example.grpc.KeyValueGrpc.KeyValueBlockingStub;

import com.example.grpc.KeyValueOuterClass;
import com.example.grpc.KeyValueOuterClass.SetKeyValueRequest;
import com.example.grpc.KeyValueOuterClass.GetValueRequest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class KeyValueClient {
    private static ManagedChannelBuilder channelBuilder;
    private static ManagedChannel channel;
    private static KeyValueBlockingStub clientKeyValueStub;

    public static void main(String []args){
        connectToServer();
        setKeyValue();
        getValue();
    }

    public static void connectToServer(){
        channelBuilder = ManagedChannelBuilder.forAddress("localhost",8080).usePlaintext();
        channel = channelBuilder.build();
        clientKeyValueStub = KeyValueGrpc.newBlockingStub(channel);
    }
    public static void setKeyValue(){
        SetKeyValueRequest setKeyValueRequest = SetKeyValueRequest.newBuilder().setKey(10).setValue("GRPC Example").build();
        KeyValueOuterClass.Status response = clientKeyValueStub.setKV(setKeyValueRequest);
        System.out.println("Response: " + response.getValue());
        System.out.println("Code: " + response.getCode());
    }

    public static void getValue(){
        GetValueRequest getValueRequest = GetValueRequest.newBuilder().setKey(10).build();
        KeyValueOuterClass.Status response = clientKeyValueStub.getKV(getValueRequest);
        System.out.println("Response: " + response.getValue());
        System.out.println("Code: " + response.getCode());
    }
}

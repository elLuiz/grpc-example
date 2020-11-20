package KeyValue;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class KeyValueServer {
    public static void main(String []args){
        try {
            startServer();
        }catch (IOException exception){
            System.out.println("Could not start the server. ");
            System.out.println("Cause: " + exception.getCause());
        }catch (InterruptedException interruptedException){
            System.out.println("Oops, interrupted.");
            System.out.println("Cause: " + interruptedException.getCause());
        }
    }

    public static void startServer() throws IOException, InterruptedException{
        KeyValueService keyValueService = new KeyValueService();
        ServerBuilder serverBuilder = ServerBuilder.forPort(8080);
        serverBuilder.addService(keyValueService);
        Server server = serverBuilder.build();
        server.start();
        System.out.println("Server started at port:" + server.getPort());
        server.awaitTermination();
    }
}

package KeyValue;

import com.example.grpc.KeyValueOuterClass;
import com.google.protobuf.ByteString;
import java.sql.Timestamp;


public class ValueHandler {
    private long timestamp;
    private ByteString data;
    private long version;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        this.timestamp = timestamp.getTime();
    }

    public void setData(ByteString data) {
        this.data = data;
    }

    public ByteString getData() {
        return data;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public ValueHandler setValueHandler(KeyValueOuterClass.SetKeyValueRequest request){
        ValueHandler value = new ValueHandler();
        value.setData(request.getValue().getData());
        value.setTimestamp();
        value.setVersion(1);

        return value;
    }

}

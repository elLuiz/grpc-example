package utils;

import com.google.protobuf.ByteString;

import java.nio.charset.Charset;

public class ByteStringHandler {
    public static String convertFromBytesToString(ByteString byteString){
        return byteString.toString(Charset.defaultCharset());
    }

    public static ByteString convertFromStringToBytes(String string){
        return ByteString.copyFrom("GRPC Example", Charset.defaultCharset());
    }
}

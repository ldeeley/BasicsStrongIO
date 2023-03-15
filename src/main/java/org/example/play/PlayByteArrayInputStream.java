package org.example.play;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class PlayByteArrayInputStream {

    public static void testStreams() throws IOException {

        String message = "This is a test message";
        byte[] testByteArray = message.getBytes();
//        this implementation of InputStream is for reading from an in-memory ByteArray

// can reset
//        can mark
//        can limit
//        can set size

//        to control what is read
        
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(testByteArray);
        byte[] buffer = new byte[3];
        int number = 0;
        int count =0;

        while ((number = byteArrayInputStream.read(buffer))!=-1){
            for (byte b : buffer){
                System.out.println(((char) b));
            }
//            if (count ==2){
//                byteArrayInputStream.reset();
//            }
            count++;
        }
        byteArrayInputStream.close();

    }

}

package org.example.play;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PlayFileInputStream {

    public static void testStreams() throws IOException {
        File f1 = new File("/users/leste/basicsstrong/documents/mytestdir/lifeonmars.txt");

//        for reading bytes from a file
//        get a file object and use the read method
//        writing to a file is just as easy

        FileInputStream fileInputStream = new FileInputStream(f1);
        FileOutputStream fileOutputStream = new FileOutputStream("/users/leste/basicsstrong/documents/mytestdir/lifeonmarsbak.txt");

            int byteRead = 0;

            while ((byteRead = fileInputStream.read()) !=-1){
                System.out.println(byteRead);
                fileOutputStream.write(byteRead);
            }

            fileInputStream.close();
            fileOutputStream.close();




    }
}

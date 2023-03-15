package org.example.play;

import java.io.*;
import java.nio.charset.Charset;

public class PlayBufferedInputStream {

    public static void testBufferedFileInputStream() throws IOException {
        File f1 = new File("/users/leste/basicsstrong/documents/mytestdir/lifeonmars.txt");

        System.out.println("you are currently in : " + System.getProperty("user.dir"));
        System.out.println("my charset is "+System.getProperty("file.encoding"));
        System.out.println(Charset.defaultCharset());


        try (FileInputStream fileInputStream = new FileInputStream(f1);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);){

            int byteRead = 0;

            while ((byteRead = bufferedInputStream.read()) != -1) {
                System.out.print((char) byteRead);

                fileInputStream.close();
            }
        } catch (Exception e){
                System.out.println("Exception : " + e.getMessage());
        }

    }

}

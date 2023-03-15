package org.example.play;

import java.io.*;

public class PlayReadWriteBuffer {

    public static void testReadWriteBuffer(){

        File file = new File("/users/leste/basicsstrong/documents/mytestdir/lifeonmars.txt");



        try (Reader reader = new FileReader(file);){
            BufferedReader bufferedReader = new BufferedReader(reader);

            char[] cbuf = new char[1024];

            while (bufferedReader.read(cbuf) != -1){
                for (int i=0; i < cbuf.length; i++){
                    System.out.println((char) i);
                }


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}

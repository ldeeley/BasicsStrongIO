package org.example.play;

import java.io.*;

public class PlayFileReaderWriter {

    public static void testFileReaderWriter(){

        File file = new File("/users/leste/basicsstrong/documents/mytestdir/lifeonmars.txt");
        File outputFile = new File("/users/leste/basicsstrong/documents/mytestdir/lifeonmarsOutput.txt");
        try (FileReader fileReader = new FileReader(file);
             Writer writer = new FileWriter(outputFile)) {

            int c;
            while ((c = fileReader.read())!= -1){
                outputFile.createNewFile();
                System.out.print((char) c);
                writer.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}


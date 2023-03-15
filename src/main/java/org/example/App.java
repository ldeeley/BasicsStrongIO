package org.example;

import org.example.play.PlayBufferedInputStream;
import org.example.play.PlayByteArrayInputStream;
import org.example.play.PlayFileInputStream;
import org.example.play.PlayFileReaderWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Properties;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws URISyntaxException, IOException {
//        PlayFileInputStream.testStreams();
//        PlayByteArrayInputStream.testStreams();
//        PlayBufferedInputStream.testBufferedFileInputStream();
        PlayFileReaderWriter.testFileReaderWriter();
    }



}

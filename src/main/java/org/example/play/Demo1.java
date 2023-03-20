package org.example.play;


import java.io.File;

interface A
{
    void show();
}

interface B
{
    void show();
}

class Z implements A,B {

    public void show() {

    }
}
public class Demo1 {



    public static void main(String[] args) {

        try {
            File f1 = new File("/users/leste/basicsstrong/documents/mytestdir/lifeonmars.txt");
            Boolean readableFile = f1.canRead();
        } finally {
            System.out.println("finally");
            int j=0;
            int k=18;
            int result = k/j;
            System.out.println(result);
        }


    }

}

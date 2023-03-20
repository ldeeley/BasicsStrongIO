package org.example.play;


class AA extends Thread{
    public void run(){
        for (int x=0;x<1000;x++){
            System.out.println("hi");
        }
    }
}

class BB extends Thread{
    public void run(){
        for (int x=0;x<1000;x++){
            System.out.println("hello");
        }

    }
}



public class PlayThreads {

    public static void main(String[] args) {

        AA threadA = new AA();
        BB threadB = new BB();

        threadA.setPriority(Thread.MIN_PRIORITY);
        threadA.start();
        threadB.start();

    }

}

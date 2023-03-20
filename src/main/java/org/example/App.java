package org.example;


/**
 * Hello world!
 *
 */

class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    public void tell(){
        System.out.println("in tell");
    }
}
public class App {


    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(){
          public void show(){
              System.out.println("in the anonymous class");
          }
          public void tell(){
              System.out.println("in here for tell now");
          }
        };
        obj2.show();
        obj2.tell();
    }

}
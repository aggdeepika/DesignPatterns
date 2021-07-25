package Singleton;

public class Main {

    public static void main(String args[]){

        Singleton singleton=Singleton.getInstance();
        System.out.println("reference of singleton is "+singleton);

        Singleton singleton1=Singleton.getInstance();
        System.out.println("reference of singleton is "+singleton1);


       /* Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {

                Singleton singleton=Singleton.getInstance();
                System.out.println("reference of singleton is "+singleton);
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {

                Singleton singleton=Singleton.getInstance();
                System.out.println("reference of singleton is "+singleton);
            }
        });

        t1.start();
        t2.start();*/

    }
}

class Counter {
    int i;

    public void loop() {

        try{
            for (i = 10; i >= 1; i--) {
                System.out.println(Thread.currentThread().getName() + " : i is : " + i);
                wait();
            }
        }   catch(InterruptedException ie)
        {
        }
        notifyAll();
    }

}

class AnotherThrad extends Thread{
    private Counter cobj;

    AnotherThrad(Counter counterobj) {
        cobj = counterobj;
    }

    @Override
    public void run(){
        cobj.loop();
    }

}

public class ThreadTest {


    public static void main(String[] args) {
        Counter counter = new Counter();

        AnotherThrad anotherthread = new AnotherThrad(counter);
        anotherthread.setName("Another Thread");

        AnotherThrad tt = new AnotherThrad(counter);
        tt.setName("Main Thread");

        anotherthread.start();
        tt.start();


    }

}




package maven_package;

public class Experiment1 {
    public static void main (String[] args) {
        new Thread(new Runnable() {
            public void run(){
                System.err.println("Thread id:" + Thread.currentThread().getId());
            }
        }).start();
        
        new Thread(new Runnable() {
            public void run(){
                System.err.println("Thread id:" + Thread.currentThread().getId());
            }
        }).start();

        new Thread(new Runnable() {
            public void run(){
                System.err.println("Thread id:" + Thread.currentThread().getId());
            }
        }).start();
    }    
    
}

//Thread blocking or sleeping
package maven_package;

public class Experiment3 {
    public static void main (String[] args) {
       

        new Thread(new Runnable() {
            public void run(){
                try{
                    Thread.sleep(5000);// for 5s this thread is blocked or sleeped
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.err.println("Thread id1:" + Thread.currentThread().getId());
            }
        }).start();

        new Thread(new Runnable() {
            public void run(){
                System.err.println("Thread id2:" + Thread.currentThread().getId());
            }
        }).start();
    }   
    
}

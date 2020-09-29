//In here Thread num 13,20,14 are blocked and after given seconds they are get executed
package maven_package;

public class Experiment4 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                public void run(){
                    if (Thread.currentThread().getId()== 13) {
                        System.out.println("\nThread 13 will execute after 2s");
                        try{
                            Thread.sleep(2000);
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                        System.err.println("\nThread id13:" + Thread.currentThread().getId());
                      } 
                      else if (Thread.currentThread().getId()== 20) {
                        System.out.println("\nThread 20 will execute after 10s");
                        try{
                            Thread.sleep(10000);
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                        System.err.println("Thread id20:" + Thread.currentThread().getId());
                      } 

                      else if (Thread.currentThread().getId()== 14) {
                        System.out.println("\nThread 14 will execute after 5s");
                        try{
                            Thread.sleep(5000);
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                        System.err.println("Thread id14:" + Thread.currentThread().getId());
                      } 


                      else {
                        System.err.println("\nThread id:" + Thread.currentThread().getId());
                      }
                }
            }).start();
        } 
    }    
    
}

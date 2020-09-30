//from minimun blocking ms to maximum ms one
package maven_package;

public class Assignment_ANS1{
    public static void main(String[] args){
        for(int i = 0; i<10;i++)
        {
            new Thread(new Runnable()
            {
                public void run()
                {
                    try {
                        int max=5000;
                        int min = 0;
                        int random = (int)(max * Math.random() + min);
                        long start = System.currentTimeMillis();
                        Thread.sleep(random);
                        System.out.println(Thread.currentThread().getId()+" Sleep for "+(System.currentTimeMillis()-start)+" Mili Seconds");
                    } 
                    catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException(e);
                        }    
                    System.out.println(" Thread id :"+ Thread.currentThread().getId()+"\n");
                }    
            }).start();   
        }
    }
    
}

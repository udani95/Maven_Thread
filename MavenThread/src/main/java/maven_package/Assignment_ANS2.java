//min blocking one to maximum one
package maven_package;

public class Assignment_ANS2 {

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
                        Thread.sleep(random);
                        System.out.println("\n Thread "+Thread.currentThread().getId()+ " sleep for "+random+" mili seconds");
                        } 
                        catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException(e);
                        }    
                    System.err.println(" Thread id :"+ Thread.currentThread().getId());
                } 
            }).start();     
        }
    }
}

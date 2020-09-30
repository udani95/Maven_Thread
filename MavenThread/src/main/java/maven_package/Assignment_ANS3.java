package maven_package;

public class Assignment_ANS3 {
    public static void main(String[] args){
        for(int i = 0; i<10;i++)
        {
            new Thread(new Runnable()
            {
                public void run()
                {
                    
                    System.out.println(" Thread id :"+ Thread.currentThread().getId()+"\n");
                }    
            }).start();   

            try {
                int max=5000;
                int min = 0;
                int random = (int)(max * Math.random() + min);
                Thread.sleep(random);
                System.out.println("Thread Sleep for "+random+" mili Seconds");
            } 
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
                }    
        }
    }
    
}

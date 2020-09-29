//Thread executing using for loop
package maven_package;

public class Experiment2 {
    public static void main(String[] args){
        for(int i = 0; i<10;i++)
        {
            new Thread(new Runnable()
            {
                public void run()
                {
                    System.err.println("Thrread id :"+ Thread.currentThread().getId());
                }
            }).start();
        }
    }
}

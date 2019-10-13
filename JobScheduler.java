public class JobScheduler
{
    public static void main(String [] args){
         long time = System.currentTimeMillis();
         long n = 5000;
         for(long i = 0; i < time + n; i++){
             System.out.println("Waiting " + i % 1000);
         }
    }
}
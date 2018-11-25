//Objective is to print Timeout Message periodically
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
public class MyTimer extends TimerTask //TimerTask is a Java Class for scheduling or running a particular task  
{

    @Override
    public void run() 
    {
        System.out.println("Timer task started at:"+new Date());
        completeTask();
        System.out.println("Timeout at:"+new Date());
    }
    private void completeTask() 
    {
        try 
        {
            Thread.sleep(10000); // for every 10 seconds, we need to print timeout message
            // this may throw InterruptedException if any thread interrupts the timmer.
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        MyTimer timerTask = new MyTimer();
        //running timer task as daemon thread
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
        System.out.println("*** TimerTask started for 1 Minute ***");
        //cancel after sometime
        try {
            Thread.sleep(60000); //this is used to stop the Timer after 1min - 60000 millisecs
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("*** TimerTask completed after 1 Minute ***");
        
    }
}
    
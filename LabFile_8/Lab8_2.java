
import java.util.TimerTask;
import java.util.Date;
import java.util.Timer;

public class Lab8_2 extends TimerTask {

    @Override
    public void run() {
        System.out.println("Timer task started at:\n"+ new Date());
        completeTask();
    }

    private void completeTask() {
        try {
        
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]){
        TimerTask tk = new Lab8_2();
        Timer t = new Timer(true);
        t.scheduleAtFixedRate(tk, 0, 10*1000);
        System.out.println("Starting the timertask");
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.cancel();
        
        System.out.println("cancelling the timertask");
    }
}
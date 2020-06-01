package spring__J2EE.ScheduledTimerService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.TimerTask;

public class Task2 extends TimerTask {
    @Override
    public void run() {

        {
            try{
                FileWriter fw = new FileWriter("/Users/machd/Desktop/spring__J2EE.txt");
//                FileWriter fw = new FileWriter("spring__J2EE.txt");
                fw.write(new Date()+"\n");
                System.out.println("date in Task2 run method");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

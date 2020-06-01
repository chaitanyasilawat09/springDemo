package spring__J2EE.ScheduledTimerService;

import java.util.TimerTask;

public class Task1 extends TimerTask {

    @Override
    public void run() {

        {
            System.out.println("welcome to task1 runMethod");
        }
    }
}

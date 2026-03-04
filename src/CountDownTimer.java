import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {
    public static void main(String[] args) {
        // countdown timer for rocket liftoff
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit of countdown (in seconds): ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = response;
            @Override
            public void run() {
                System.out.println(count--);
                if(count==0){
                    System.out.println("Lift Off");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0 ,1000);
    }
}

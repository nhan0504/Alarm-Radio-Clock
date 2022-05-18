import java.util.Scanner;

public class AlarmRadioClockMain {
    public static void main(String[] args) {
        System.out.println("New alarm radio clock");
        AlarmRadioClock clock = new AlarmRadioClock();
        System.out.println("Do you want to set an alarm? Type yes or no: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        if (answer.equals("yes")) {
            clock.turnAlarmOn();
            while (true) {
                clock.checkAlarm();

            }
        }
    }
}

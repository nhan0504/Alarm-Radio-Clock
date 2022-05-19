import java.util.Scanner;

public class AlarmRadioClockMain {
    public static void main(String[] args) {
        System.out.println("New alarm radio clock");

        AlarmClock alarmClock = new AlarmClock(8,0,0, "AM");
        alarmClock.setAlarmTime(8, 5, 0, "AM");
        alarmClock.turnOn();
        for (int i = 0; i < 5; i++) {
            alarmClock.tick();
            alarmClock.showTime();
            if (alarmClock.isAlarmOn()) {
                if (alarmClock.checkAlarm()) {
                    alarmClock.snooze();
                }
            }
        }
        alarmClock.snooze();
        alarmClock.getAlarmTime().showTime();
        alarmClock.turnOff();
        System.out.println("Alarm was shut off");
    }
}

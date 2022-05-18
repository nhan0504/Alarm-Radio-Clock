public class AlarmClock extends Clock {
    Time alarmTime;
    boolean turnOn;

    public AlarmClock() {
        alarmTime = new Time(8,5);
        turnOn = false;
    }

    public void setAlarmTime(Time t) {
        alarmTime.hour = t.hour;
        alarmTime.min = t.min;
    }

    public void turnOn() {
        turnOn = true;
    }

    public void turnOff() {
        turnOn = false;
    }

    public Time getAlarmTime() {
        return alarmTime;
    }

    public boolean isAlarmOn() {
        return turnOn;
    }

    private void alarmSound() {
        System.out.println("buzzlightyear");
    }

    public void snooze(int min) {
        for (int i = 0; i < min; i++) {
            time.tick();
            checkAlarm();
        }
    }

    public void checkAlarm() {
        if (time.equals(alarmTime)) {
            alarmSound();
        }
    }
}

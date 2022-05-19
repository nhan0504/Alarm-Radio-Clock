public class AlarmClock extends Clock {
    Time alarmTime;
    boolean turnOn;

    public AlarmClock(int hour, int min, int sec) {
        super(hour, min, sec);
        alarmTime = new Time(hour, min, sec);
        turnOn = false;
    }

    public void setAlarmTime(Time t) {
        alarmTime.hour = t.hour;
        alarmTime.min = t.min;
        alarmTime.sec = t.sec;
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

    public void checkAlarm() {
        if (time.equals(alarmTime)) {
            alarmSound();
        }
    }

    public void snooze(int min) {
        for (int i = 0; i < min; i++) {
            time.tick();
            checkAlarm();
        }
    }

}

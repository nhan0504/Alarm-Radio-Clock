public class AlarmClock extends Clock {
    private Time alarmTime;
    private boolean turnOn;

    public AlarmClock(int hour, int min, int sec, String amPm) {
        super(hour, min, sec, amPm);
        if (amPm.equals("AM")) {
            alarmTime = new Time(hour, min, sec);
        } else {
            alarmTime = new Time(hour + 12, min, sec);
        }
        turnOn = false;
    }

    public void setAlarmTime(int hour, int min, int sec, String amPm) {
        alarmTime.setHour(hour);
        alarmTime.setMin(min);
        alarmTime.setSec(sec);
        if (amPm.equals("PM")) {
            alarmTime.setHour(alarmTime.getHour() + 12);
        }
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

    public boolean checkAlarm() {
        if (time.equals(alarmTime)) {
            alarmSound();
            return true;
        }
        return false;
    }

    public void snooze() {
        System.out.println("Snooze was pressed");
        for (int i = 0; i < 9; i++) {
            time.tick();
            showTime();
        }
        alarmSound();
    }

}

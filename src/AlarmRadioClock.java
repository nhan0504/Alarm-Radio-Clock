public class AlarmRadioClock {
    AlarmClock alarmClock;
    Radio radio;

    public AlarmRadioClock(int hour, int min, int sec, String amPm, String radioStation) {
        alarmClock = new AlarmClock(hour, min, sec, amPm);
        radio = new Radio(radioStation);
    }

    public void showTime() {
        alarmClock.showTime();
    }

    public Time getTime() {
        return alarmClock.getTime();
    }

    public void setTime(Time t) {
        alarmClock.setTime(t);
    }

    public String getStation() {
        return radio.getStation();
    }

    public void setStation(String str) {
        radio.setStation(str);
    }

    public Time getAlarmTime() {
        return alarmClock.getAlarmTime();
    }

    public void setAlarm(int hour, int min, int sec, String amPm) {
        alarmClock.setAlarmTime(hour, min, sec, amPm);
    }

    public void turnAlarmOn() {
        alarmClock.turnOn();
    }

    public void turnAlarmOff() {
        alarmClock.turnOff();
    }

    public boolean isAlarmOn() {
        return alarmClock.isAlarmOn();
    }

    public void snooze() {
        alarmClock.snooze();
    }

    public boolean checkAlarm() {
        return alarmClock.checkAlarm();
    }
}

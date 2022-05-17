public class AlarmRadioClock {
    AlarmClock alarmClock;
    Radio radio;

    public AlarmRadioClock() {
        alarmClock = new AlarmClock();
        radio = new Radio();
    }

    public void getTime() {
        alarmClock.showTime();
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

    public void setAlarm(Time t) {
        alarmClock.setAlarmTime(t);
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
        alarmClock.snooze(2);
    }
}

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

    public void turnOn() {
        alarmClock.turnOn();
    }

    public void turnOff() {
        alarmClock.turnOff();
    }

    public boolean isAlarmOn() {
        return alarmClock.isAlarmOn();
    }

    public void snooze() {
        alarmClock.snooze();
    }

    public void alarmSound() {
        System.out.println("The radio is playing " + getStation());
    }

    public boolean checkAlarm() {
        if (alarmClock.getTime().equals(alarmClock.getAlarmTime())) {
            alarmSound();
            return true;
        }
        return false;
    }

    public void tick() {
        alarmClock.getTime().tick();
    }
}

public class Clock {
    Time time;

    public Clock(int hour, int min, int sec, String amPm) {
        if (amPm.equals("AM")) {
            time = new Time(hour, min, sec);
        } else {
            time = new Time(hour + 12, min, sec);
        }
    }

    public void showTime() {
        time.showTime();
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time t) {
        time.setTime(t);
    }

    public void tick() { time.tick(); }
}

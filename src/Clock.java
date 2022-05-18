public class Clock {
    Time time;

    public Clock(int hour, int min, int sec) {
        time = new Time(hour, min, sec);
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
}

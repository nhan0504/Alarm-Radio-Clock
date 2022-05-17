public class Clock {
    Time time;

    public Clock() {
        time = new Time(8,0);
    }

    public Clock(int hour, int min) {
        time = new Time(hour, min);
    }

    public void showTime() {
        time.showTime();
    }

    public void setTime(Time t) {
        time.setTime(t);
    }
}

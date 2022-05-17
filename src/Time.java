public class Time {
    int hour;
    int min;

    public Time() {
        this.hour = 8;
        this.min = 0;
    }

    public Time(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }

    public void showTime() {
        if (min < 10) {
            System.out.println(hour + ":0" + min);
        } else {
            System.out.println(hour + ":" + min);
        }
    }

    public int getHour(Time t) {
        return t.hour;
    }

    public void setTime(Time t) {
        this.hour = t.hour;
        this.min = t.min;
    }

    public boolean equals(Time t) {
        if (t.hour == this.hour && t.min == this.min) {
            return true;
        }
        return false;
    }

    public void tick() {
        for(int i = 0; i < 60; i++) {
            if (min < 59) {
                this.min++;
            } else {
                this.hour++;
                this.min = 0;
            }
        }
    }
}

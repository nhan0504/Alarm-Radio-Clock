public class Time {
    int hour;
    int min;
    int sec;

    public Time() {
        this.hour = 8;
        this.min = 0;
        this.sec = 0;
    }

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void showTime() {
        if (min < 10) {
            System.out.println(hour + ":0" + min);
        } else {
            System.out.println(hour + ":" + min);
        }
    }

    public void setTime(Time t) {
        this.hour = t.hour;
        this.min = t.min;
        this.sec = t.sec;
    }

    public boolean equals(Time t) {
        if (t.hour == this.hour && t.min == this.min && t.sec == this.sec) {
            return true;
        }
        return false;
    }

    public void tick() {
        for(int i = 0; i < 60; i++) {
            if (sec < 59) {
                this.sec++;
            } else {
                this.sec = 0;
                if (hour == 24) {
                    this.hour = 0;
                    this.min = 0;
                    this.sec = 1;
                }
                if (min < 59) {
                    this.min++;
                } else {
                    this.hour++;
                    this.min = 0;
                }
            }
        }
    }
}

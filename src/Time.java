public class Time {
    private int hour;
    private int min;
    private int sec;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public Time(int hour, int min, int sec) {
        setHour(hour);
        setMin(min);
        setSec(sec);
    }

    public void showTime() {
        if (hour < 12) {
            System.out.print(hour);
            if (min < 10) {
                System.out.print(":0" + min + " ");
            } else {
                System.out.print(":" + min + " ");
            }
            System.out.println("AM");
        } else if (hour > 12) {
            System.out.print(hour - 12);
            if (min < 10) {
                System.out.print(":0" + min + " ");
            } else {
                System.out.print(":" + min + " ");
            }
            if (hour == 24) {
                System.out.println("AM");
            } else {
                System.out.println("PM");
            }
        } else {
            System.out.print(hour);
            if (min < 10) {
                System.out.print(":0" + min + " ");
            } else {
                System.out.print(":" + min + " ");
            }
            System.out.println("AM");
        }
    }

    public void setTime(Time t) {
        this.hour = t.getHour();
        this.min = t.getMin();
        this.sec = t.getSec();
    }

    public boolean equals(Time t) {
        if (t.getHour() == this.hour && t.getMin() == this.min && t.getSec() == this.sec) {
            return true;
        }
        return false;
    }

    public void tick() {
        for(int i = 0; i < 60; i++) {
            if (sec < 59) {
                setSec(sec + 1);
            } else {
                setSec(0);
                if (min < 59) {
                    setMin(min + 1);
                } else {
                    setHour(hour + 1);
                    setMin(0);
                    if (hour > 24) {
                        setHour(1);
                        setMin(0);
                        setSec(0);
                    }
                }
            }
        }
    }
}

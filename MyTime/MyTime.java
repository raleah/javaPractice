public class MyTime {
    public long hour;
    public long minute;
    public long second;

    //constructor for current time
    public MyTime(){
        long millis = System.currentTimeMillis();
        long totalSecond = millis / 1000;
        long totalMinute = totalSecond / 60;
        long totalHour = totalMinute / 60;
        this.hour = totalHour % 24;
        this.minute = totalMinute % 60;
        this.second = totalSecond % 60;

    }
    //constructor with specified elapsed time since midnight, 1/1/1970
    public MyTime(long elapseTime){
        long totalSecond = elapseTime / 1000;
        long totalMinute = totalSecond / 60;
        long totalHour = totalMinute / 60;
        this.hour = totalHour % 24;
        this.minute = totalMinute % 60;
        this.second = totalSecond % 60;
    }

    //constructor with specified hour, minute, and second
    public MyTime(long hour, long minute, long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
    //getters for hour, minutes, and seconds
    public long getHour(){
        return hour;
    }

    public long getMinutes(){
        return minute;
    }

    public long getSeconds(){
        return second;
    }

    //setter named setTime(long elapseTime)
    public void setTime (long elapseTime){
        long totalSecond = elapseTime / 1000;
        long totalMinute = totalSecond / 60;
        long totalHour = totalMinute / 60;
        this.hour = totalHour % 24;
        this.minute = totalMinute % 60;
        this.second = totalSecond % 60;

    }

}



package tr.edu.sehir.oop;

public class DayAndWeek {
    private int day;
    private int week;

    DayAndWeek (){
        day = 1;
        week =1;
    }
    public int getDay(){ return day;}
    public int getWeek(){ return week;}
    public void setDay(int dd){ day = dd;}
    public void setWeek(int ww){ week =  ww;}

    public void setDaywithErrorChecking(int dd){
        if (dd >= 1 && dd <= 5)
            day = dd;
    }

    public void setWeekwithErrorChecking(int ww){
        if (ww >= 1 && ww <= 12)
            week = ww;
    }



}



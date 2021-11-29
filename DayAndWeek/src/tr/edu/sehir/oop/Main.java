package tr.edu.sehir.oop;

public class Main {

    public static void main(String[] args) {

	 DayAndWeek d = new DayAndWeek();
	 d.setDaywithErrorChecking(15);
	 d.setWeekwithErrorChecking(20);
	 System.out.println("day:"+d.getDay()+" week: "+ d.getWeek());
    }
}

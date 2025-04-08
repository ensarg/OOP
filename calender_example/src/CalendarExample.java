import java.util.Calendar;
import java.util.Scanner;



public class CalendarExample {

    public static void main(String[] args) {

        String days [] = {"","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        Scanner in = new Scanner(System.in);

        System.out.println("Enter date in format MM DD YYYY");
        // 08 05 2015
        String month = in.next();
        String day = in.next();
        String year = in.next();

        Calendar cal = Calendar.getInstance();

        //08 05 2015
        // cal.set(2016,10,20);
        cal.set(Calendar.YEAR, Integer.parseInt(year));
        cal.set(Calendar.MONTH, Integer.parseInt(month) - 1); // Month is zero-based
        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));

        System.out.println("y m d " + year + " " + month + " " + day);
        System.out.println("y m d " + cal.get(Calendar.YEAR) + " " + (cal.get(Calendar.MONTH) + 1) + " " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK) + ": " + days[cal.get(Calendar.DAY_OF_WEEK)]);

        System.out.println("hello. I am here\n");


        //String month = cal.next();
        // String month = in.next();
        // String day = in.next();
        // String year = in.next();

        // Calendar cal = Calendar.getInstance();
        // //08 05 2015
        // // cal.set(2016,10,20);
        // cal.set(Calendar.YEAR,Integer.parseInt(year));
        // cal.set(Calendar.MONTH,Integer.parseInt(month));
        // cal.set(Calendar.DAY_OF_MONTH,Integer.parseInt(day));
        // System.out.println ("y m d"+  year +month +day );
        // System.out.println ("y m d  "+  cal.YEAR+" "+ cal.MONTH+" " + cal.DAY_OF_WEEK );
        // System.out.println(cal.DAY_OF_WEEK +  days[cal.DAY_OF_WEEK]);

        // System.out.println("hello. i am here\n");

        //String day = in.next();
        //String year = in.next();

        //Calendar cal = Calendar.getInstance();
       //08 05 2015
        // cal.set(2016,10,20);
        cal.set(Calendar.YEAR,Integer.parseInt(year));
        cal.set(Calendar.MONTH,Integer.parseInt(month));
        cal.set(Calendar.DAY_OF_MONTH,Integer.parseInt(day));
        System.out.println ("y m d"+  year +month +day );
        System.out.println ("y m d  "+  cal.YEAR+" "+ cal.MONTH+" " + cal.DAY_OF_WEEK );
        System.out.println(cal.DAY_OF_WEEK +  days[cal.DAY_OF_WEEK]);

        System.out.println("hello. i am here\n");

    }
}

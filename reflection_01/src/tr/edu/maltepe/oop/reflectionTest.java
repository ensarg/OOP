package tr.edu.maltepe.oop;

public class reflectionTest {
    private int x=0;
    private int y=0;
     reflectionTest(){
         x=5;
         y=6;
         System.out.println("Reflection test constructor");
     }

    public void addintegers(){
        int z;
        z=x+y;
        System.out.println("x+y="+z);
    }

    public void multiplyintegers(){
        int z;
        z=x*y;
        System.out.println("x*y="+z);
    }

     /*
    public void addintegers2(int n, int m){

          int z;
          z=n+m;
         System.out.println("x+y="+z);
     }

*/



}

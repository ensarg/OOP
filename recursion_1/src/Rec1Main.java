public class Rec1Main {
  public static int n = 0;

  public static void main(String[] args) {

    int x = Rec1Main.recurse(1, 1);
    System.out.println("----------------n=" + n + "   the value of x=" + x);
  }

  public static int recurse(int a, int b) {
    n++;
    System.out.println("n=" + n);
    if (a % b == 2) return a;
    else return recurse(a + b, a - b);
  }
}
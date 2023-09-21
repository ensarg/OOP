import java.util.*;

public class SortIntegers{

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] sayilar = new int[10];

      // Kullanıcıdan 10 adet sayı girmesini isteyin
      for (int i = 0; i < 10; i++) {
         System.out.print((i+1) + ". sayıyı girin: ");
         sayilar[i] = input.nextInt();
      }

      // Sayıları küçükten büyüğe sıralayın
      Arrays.sort(sayilar);

      // Sıralanmış sayıları ekrana yazdırın
      System.out.println("Sıralanmış sayılar: " + Arrays.toString(sayilar));
   }
}

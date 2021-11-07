public class Main {

    public static void main(String[] args) {

        int [] anarray = {20,15,30,45,50};

        int x,y;

        try {


            y=0;
            x =anarray[0];
            System.out.println("\n x =" + x);

            x=x/y;

            System.out.println(" array \n");
            for (int i = 0; i < 5; i++)
                System.out.println("%d\n" + anarray[i]);

        }catch (Exception e){
            System.out.println(" there is an  exception");

        }

        System.out.println("my prg is executing");

    }
}

import java.util.Scanner;

public class int12 {

    public static void main(String[] args) {

        int n, r1, r10, r100;
        Scanner kirit = new Scanner(System.in);
        System.out.print(" Enter n = ");
        n = kirit.nextInt();


        r1 = n % 10;
        r10 = n / 10 % 10;
        r100 = n / 100;

        ///1 2 3

        System.out.println( "Out >> " + r1 + "" +r10+ "" + r100);



    }
}

import java.util.Scanner;

public class int2 {

    public static void main(String[] args) {

        int n, r1, r10, r100, r1000;
        Scanner kirit = new Scanner(System.in);
        System.out.print(" Enter n = ");
        n = kirit.nextInt();

        ///465
        r1 = n % 10;
        r10 = n / 10 % 10;
        r100 = n / 1000 % 10000;


        System.out.println( " Result >>> " +r100);



    }



}

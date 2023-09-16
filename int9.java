import java.util.Scanner;

public class int9 {

    public static void main(String[] args) {

        int n, r1, r10, r100, r1000;
        Scanner kirit = new Scanner(System.in);
        System.out.print(" Enter n = ");
        n = kirit.nextInt();


        r1 = n % 10 ;  /// 123
        r10 = n / 10 % 10;
        r100 = n / 100;

        System.out.println( "Out >> "  +r100);



    }
}


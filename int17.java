import java.util.Scanner;

public class int17 {

    public static void main(String[] args) {

        int n, r1, r10, r100, r1000;
        Scanner kirit = new Scanner(System.in);
        System.out.print(" Enter n = ");
        n = kirit.nextInt();

        //  [1]    [2]  [3] [4]
        // r1000  r100  r10  r1

        r1 = n % 10;
        r10 = n / 10 % 10;
        r100 = n / 100 % 10;
        r1000 = n / 1000;


        ///1 2 3

        System.out.println( "Out >> "  +r100);


    }
}

import java.util.Scanner;

public class int3 {

    public static void main(String[] args) {

        int n, r1, r10, r100, r1000;
        Scanner kirit = new Scanner(System.in);
        System.out.print(" Enter n = ");
        n = kirit.nextInt();


        r1 = n % 10;
        r10 = n / 10 % 10;
        r100 = n / 100 % 1000;
        r1000 = n / 1000;

        System.out.println(" Result >> " + r1000);



    }
}
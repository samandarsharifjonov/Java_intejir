import java.util.Scanner;

public class int13 {

    public static void main(String[] args) {

        int n, r1, r10, r100;
        Scanner kirit = new Scanner(System.in);
        System.out.print(" Enter n = ");
        n = kirit.nextInt();

        //  [1]  [2]  [3]
        // r100  r10  r1


        r1 = n % 10;
        r10 = n / 10 % 10;
        r100 = n / 100;



        System.out.println( "Out >> " + r10 + "" +r1+ "" + r100);



    }
}

import java.util.Scanner;

public class int23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int  soat = n / 3600;
        int minut = n % 3600 / 60;
        int sekunt =n%60;

        System.out.println(soat);
        System.out.println(minut);
        System.out.println(sekunt);

    }
}

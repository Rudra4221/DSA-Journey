import java.util.*;

public class Calculater {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calculater(a, b));

    }

    public static int calculater(int c, int d) {

        int sum = c + d;

        return sum;
    }
}

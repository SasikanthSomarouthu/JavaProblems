import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        sc.close();

        try {

            StringBuilder sb = new StringBuilder(String.valueOf(a)).reverse().insert(0, "+");

            int reverse = Integer.parseInt(sb.toString());
            System.out.printf("This is the reverse of the number of %d is %d", a, reverse);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}

import java.util.Scanner;

public class TimeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (x): ");
        int x = sc.nextInt();
        System.out.print("Enter speed (v): ");
        int v = sc.nextInt();
        double time = calculateTime(x, v);
        System.out.printf("Time taken to cover %d units at speed %d is: %.2f units of time%n", x, v, time);
    }

    public static double calculateTime(int x, int v) {
        return (double) x / v;
    }
}

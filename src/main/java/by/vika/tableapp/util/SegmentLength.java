package by.vika.tableapp.util;
import java.util.Scanner;

public class SegmentLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entering the coordinates of the first point A (x1, y1)
        System.out.print("Введите x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите y1: ");
        double y1 = scanner.nextDouble();

        // Entering coordinates of the second point B (x2, y2)
        System.out.print("Введите x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите y2: ");
        double y2 = scanner.nextDouble();

        // Calculating the length of the segment AB
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Output of the length of the segment AB
        System.out.printf("Длина отрезка AB: %.2f%n", length);
    }
}



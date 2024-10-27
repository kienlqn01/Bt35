import java.util.Scanner;

@FunctionalInterface
interface SumCalculator {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        // Tạo biểu thức lambda cho SumCalculator
        SumCalculator sumCalculator = (a, b) -> a + b;

        // Tạo đối tượng Scanner để nhập vào 2 số nguyên
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        // Tính và in ra tổng của a và b
        int result = sumCalculator.calculate(a, b);
        System.out.println("Tổng của " + a + " và " + b + " là: " + result);

        scanner.close();
    }
}

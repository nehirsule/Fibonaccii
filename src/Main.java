import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //eleman sayısını belirle ve kaydet
        System.out.print("Fibonacci serisi eleman sayısını girin: ");
        int n = scanner.nextInt();

        //i sayısından n sayısına kadar belirle ve sisteme dahil et
        System.out.println("Fibonacci Serisi:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    //döngüyü ve fibonacci formülünü uyugla
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

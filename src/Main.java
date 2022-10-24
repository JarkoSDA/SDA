import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("podaj pierwsza wartosc");
        int number1 = sc.nextInt();
        System.out.print("podaj druga wartosc");
        int number2 = sc.nextInt();
        System.out.println("Wynik to:" + (number1 + number2 ));
    }
}
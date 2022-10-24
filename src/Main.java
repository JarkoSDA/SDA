import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("wpisz swoje imie");
        String name=sc.nextLine();
        int age= 100;
        System.out.println("Hello " + name +" mam lat " + age);
    }
}
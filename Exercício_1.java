package _Java_1º_Lista;

import java.util.Scanner;

public class Exercício_1 {
    public static void main(String[] args) {
        int sl;
        System.out.println("coloque seu salario");
        Scanner sc = new Scanner(System.in);
        sl= sc.nextInt();
        if (sl>2000) {
            System.out.println("salario alto");
        }
        else {
            System.out.println("salario normal");
        }
        sc.close();

    }
}

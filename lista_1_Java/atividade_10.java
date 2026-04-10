package lista_1_Java;

import java.util.Scanner;

public class atividade_10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor coloque dois numeros para ver se os mesmo sao iguais");
        int num;
        num = sc.nextInt();
        int num1;
        num1 = sc.nextInt();
        if (num == num1) {
            System.out.println("os numeros sao iguais");
        } else {
            System.out.println("os numeros sao diferentes");
        }
        sc.close();
    }
}

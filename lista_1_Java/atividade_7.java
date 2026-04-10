package lista_1_Java;

import java.util.Scanner;

public class atividade_7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva tres numeros");
        int num1;
        num1 = sc.nextInt();
        int num2;
        num2 = sc.nextInt();
        int num3;
        num3 = sc.nextInt();
        if (num1 > num2 && num2 > num3) {
            System.out.println(num1 + " e o maior");
        } else if (num2>num1&&num2>num3) {
            System.out.println(num2+"e o maior");
        } else if (num3>num1&&num3>num2) {
            System.out.println(num3+"e o maior");
        } else if (num1==num2&&num1==num3&&num2==num3) {
            System.out.println("os tres numeros sao iguais");
        }else {
            System.out.println("nois numeros sao guais");
        }

        sc.close();
    }
}

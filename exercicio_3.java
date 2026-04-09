package _Java_1º_Lista;

import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int temp;
        System.out.println("Qual a temperatura");

        temp = sc.nextInt();

        if (temp > 40) {
            System.out.println("Temperatura extremamente alta");
        } else {
            System.out.println("Temperatura dentro dos limites normais");
        }
        sc.close();
    }
}
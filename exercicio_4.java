package _Java_1º_Lista;

import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id;
        System.out.println("qual sua idade");
        id= sc.nextInt();

        if (id >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }
        sc.close();
    }
}

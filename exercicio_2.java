package _Java_1º_Lista;

import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double v ;

        System.out.println("Digite o valor de sua compra, se o valor de sua compra for maior que 100 voê tera 10% de desconto");
        v = sc.nextDouble();

        if (v<100) {
            System.out.println("Você tem 10% de desconto o valor final sera: R$ "+(v*0.90));
        }
        else {
            System.out.println("Você não tem 10% de desconto o valor final sera: R$ "+v);
        }
        sc.close();

    }
}

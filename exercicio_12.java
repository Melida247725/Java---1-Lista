package _Java_1º_Lista;

import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double oito;
        double V;
        double J;

        System.out.println("Escreva 3 números e diremos qual é o menor");

        oito = sc.nextDouble();
        V = sc.nextDouble();
        J = sc.nextDouble();

        if (V>=J && V>=oito) {
            System.out.println(V + " é o maior número");
        } else if (oito>=V && oito>=J) {
            System.out.println(oito + " é o maior número");
        } else if (J>=V && J>=oito) {
            System.out.println(J + " é o maior número");
        } else {
            System.out.println("Dois númros são maiores");
        }
        if (V<=J && V<=oito) {
            System.out.println(V + " é o menor número");
        } else if (oito<=V && oito<=J) {
            System.out.println(oito + " é o menor número");
        } else if (J<=V && J<=oito) {
            System.out.println(J + " é o menor número");
        }
        else  {
            System.out.println("Dois númros são menores");
        } if (V==J && J==oito && V==oito) {
            System.out.println("Todos os números são iguais");
        }
    }
}

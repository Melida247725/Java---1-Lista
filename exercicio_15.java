package _Java_1º_Lista;

import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double oito;
        double V;
        double J;

        oito = sc.nextDouble();
        V = sc.nextDouble();
        J = sc.nextDouble();
        if (oito+V>J && V+J>oito && oito+J>V){
            System.out.println("Eles podem formar um triângulo");
        } else {
            System.out.println("Eles não podem formar um triângulo");
        }
    }
}

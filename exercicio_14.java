package _Java_1º_Lista;

import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Insira a nota");
        double resenha;
        resenha = sc.nextDouble();
        if (resenha>=7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}

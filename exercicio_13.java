package _Java_1º_Lista;

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ano;
        ano = sc.nextInt();
        if (ano%100!=0 && ano%4==0 || ano%400==0){
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");}
       }
    }
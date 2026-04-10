package lista_1_Java;

import java.util.Scanner;

public class atividade_8 { static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("escreva um numero");
    int num;
    num=sc.nextInt();
    if (num>=0){
        System.out.println("numero positivo");
    }else {
        System.out.println("numero negativo");
    }
    sc.close();
}
}

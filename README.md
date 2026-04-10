package lista_1_Java;

import java.util.Scanner;

public class atividade_5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.println("escreva sua idade");
        id= sc.nextInt();
        if (id>=16){
            System.out.println("voce pode votar");
        }
        else {
            System.out.println("voce nao tem idade para votar");
        }
        sc.close();
    }

}


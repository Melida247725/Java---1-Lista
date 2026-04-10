package lista_1_Java;

import java.util.Scanner;

public class atividade_9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("digite a temperatura");
        num=sc.nextInt();
        if (num<15){
            System.out.println("esta frio");
        } else if (num>=15&&num<=25) {
            System.out.println("agradavel");
        }else {
            System.out.println("quente");
        }
        sc.close();
    }
}

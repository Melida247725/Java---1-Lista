package lista_1_Java;

import java.util.Scanner;

public class atividade_6 { static void main() {
    Scanner sc = new Scanner(System.in);
    int id;
    System.out.println("escreva sua idade");
    id= sc.nextInt();
    if (id<=12){
        System.out.println("infantil");
    }
    if (id>=13&&id<=17){
        System.out.println("adolescente");
    }
    if (id>=18&&id<=64){
        System.out.println("aduto");
    }
    if (id>=65){
        System.out.println("idoso");
    }
    if (id>=120){
        System.out.println("voce e velho de verdade ja deu a sua hora ja");
    }
    sc.close();
}
}

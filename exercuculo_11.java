package _Java_1º_Lista;

import java.util.Scanner;

public class exercuculo_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double predio;
        predio = sc.nextDouble();
        if (predio%5==0){
            System.out.println("número divisivel por 5");
        }else{
            System.out.println("numero não é divisivel");
        }
        sc.close();
    }
}

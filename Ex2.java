import java.util.*;
public class Ex2 {
    public static void main(String [] args){
        Scanner in = new Scanner ( System.in);

        double numero;

        System.out.println(" Digite um numero : ");

        numero = in.nextInt();

        numero = numero * 20 /100 + numero;

        System.out.println(" O valor do número mais 20% é de :" + numero);



    }

    
}

import java.util.*;
public class Ex3 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);

        double numero;

        System.out.println(" Digite um número : ");

        numero = in.nextInt();

        numero = numero * numero;

        System.out.println(" O quadrado do valor digitado é : " + numero);
    }
    
}

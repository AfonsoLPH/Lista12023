import java.util.*;
public class Ex09 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int mulheres, homens, crianças;

        double gramascriança = 200, gramasmulheres = 320, gramashomens = 400, total;

        System.out.println( " LISTA DE PESSOAS PARA ANIVERSÁRIO : ");

        System.out.println(" Quantidade de mulheres convidadas : ");

        mulheres = in.nextInt();

        System.out.println(" Quantidade de homens convidados : ");

        homens = in.nextInt();

        System.out.println(" Quantidade de crianças convidadas : ");

        crianças = in.nextInt();

        total = (crianças * gramascriança) + (mulheres * gramasmulheres) + (homens*gramashomens) * (20/100);

        System.out.println(" Total de carne a ser comprada em gramas ( com a zona segura ) é de : " + total);
        
        
}
}
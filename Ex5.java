import java. util.*;
public class Ex5 {
    public static void main( String [] args){

        Scanner in = new Scanner( System.in);

        System.out.println(" Digite o valor em Fahrenhit: ");

        double F, C;

        F = in.nextDouble();

        C = (F - 32)/9 * 5;

        System.out.println(" A temperatura em Celsius é :" + C);



    }
    
}

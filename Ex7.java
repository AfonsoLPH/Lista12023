import java.util.*;
public class Ex7 {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

        double D, T , V;

        System.out.println(" Digite a distancia a se percorrer: ");

        D = in.nextDouble();

        System.out.println( " Digite a velocidade na qual vai ser percorrida : ");

        V = in.nextDouble();

        T = D/V;

        System.out.println( " O tempo de viagem será de " + T + " horas");
        

    }
    
}

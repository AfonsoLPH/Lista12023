import java.util.*;
public class Ex4 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        double base, altura, area;

        System.out.println(" Digite o valor da base");

        base = in.nextDouble();

        System.out.println(" Digite o valor de altura");

        altura = in.nextDouble();

        area = base * altura / 2;

        System.out.println(" A área do triangulo é : " + area);
    }
    
}

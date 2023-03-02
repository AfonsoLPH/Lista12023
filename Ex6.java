import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.util.*;
public class Ex6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double  nota1, nota2, provas, media;

        System.out.println("Insira o numero de provas");

        provas = in.nextDouble();

        System.out.println(" Digite as notas das provas :");

        nota1 = in.nextDouble();
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / provas;

        System.out.println(" A média das provas é de :" + media);




        





    
    }
    
}

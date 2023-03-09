import java.util.*;

import javax.sound.midi.Soundbank;
public class Ex08{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int eleitores, nulos , brancos, validos;

        double percenteleitores, percentnulos,percentbrancos,percentvalidos;

        System.out.println(" Resultado das eleiçoes da eleção 2023:");

        System.out.println(" Digite o número total de eleitores:");

        eleitores = in.nextInt();

        System.out.println( " Digite o numero de votos nulos e brancos : ");

        nulos = in.nextInt();

        brancos = in.nextInt();

        System.out.println( " Digite o numero de votos validos : ");

        validos = in.nextInt();

        percentnulos = nulos * 100 / eleitores;

        percentbrancos = brancos * 100 / eleitores;

        percentvalidos = validos * 100 / eleitores;

        System.out.println(" Percentual de votos nulos : " + percentnulos);
        System.out.println(" Percentual de votos brancos : " + percentbrancos);
        System.out.println(" Percentual de votos validos : " + percentvalidos);

        









        




    }

}
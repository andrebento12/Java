import java.util.Scanner;

public class Uri1047{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        //System.out.println("Este arquivo eh so para copiar a estrutura");
        
        int hI, mI, hF, dur, mF, tempoI, tempoF, durH, durM;

        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        // parte 1 do metodo - converter tudo para minuto

        tempoI = hI *60 + mI;
        tempoF = hF * 60 + mF;

        dur = tempoF - tempoI;

        if (dur <= 0){
            dur = dur + 24*60;
            durH = dur / 60;
            durM = dur % 60;

            System.out.println("O JOGO DUROU " + durH + " HORA(S) E " + durM + " MINUTO(S)");
        }

    }
}
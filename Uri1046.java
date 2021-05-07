import java.util.Scanner;

public class Uri1046{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        // System.out.println("Este arquivo eh so para copiar a estrutura");

        int hora1, hora2, duracao;
        hora1 = teclado.nextInt();
        hora2 = teclado.nextInt();

        if (hora1 == hora2){
           System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else if (hora1 < hora2){
            duracao = hora2 - hora1;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        else if (hora1 > hora2){
            duracao = (24 - hora1) + hora2;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }

        
    }
}
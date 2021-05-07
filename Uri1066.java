import java.util.Scanner;

public class Uri1066{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        
        int valores;
        int contador;
        int qtdpares = 0;
        int qtdimpares = 0;
        int qtdpositivos = 0;
        int qtdnegativos = 0;

        for (contador = 1 ; contador <=5 ; contador++){
            valores = teclado.nextInt();
            if (valores %2 == 0){
            qtdpares++;
            // System.out.println("Verificacao temporaria de pares: quantidades de pares: " + qtdpares);
                if (valores > 0){
                        qtdpositivos++;
                }
                else if (valores < 0) {
                    qtdnegativos++;
                }
            }
            else{
                qtdimpares++;
              // System.out.println("Verificacao temporaria de impares: quantidades de impares: " + qtdimpares); 
              if (valores > 0){
                        qtdpositivos++;
                }
                else if (valores < 0) {
                    qtdnegativos++;
                } 
            }

        }
        System.out.println(qtdpares + " valor(es) par(es)");
        System.out.println(qtdimpares + " valor(es) impar(es)");
        System.out.println(qtdpositivos + " valor(es) positivo(s)");
        System.out.println(qtdnegativos + " valor(es) negativo(s)");

    }


}
import java.util.Scanner;

public class Uri2780{

    public static void main(String args[]){

        short distancia, pontos;
        Scanner teclado = new Scanner(System.in);
        // System.out.println("Digite a distancia em centrimetros");
        distancia = teclado.nextShort();
        

        if (distancia <= 800){
            pontos = 1;
            System.out.println(pontos);
        }
            else if (distancia > 800 && distancia <= 1400){
                pontos = 2;
                System.out.println(pontos);
            }
            else if (distancia > 1400 && distancia <= 2000){
                pontos = 3;
                System.out.println(pontos);
            }
            
                     

            
        


    }



    
}


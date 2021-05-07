import java.util.Scanner;

public class Uri1051{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        // System.out.println("Este arquivo eh so para copiar a estrutura");

        double salario, IR;
        salario = teclado.nextDouble();
        
        if (salario >= 0 && salario <= 2000){
            System.out.println("Isento");
        }
        else if (salario > 2000 && salario <= 3000){
            IR = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f\n" , IR);   
        }
        else if (salario > 3000 && salario <= 4500){
            IR = ((salario - 3000) * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f\n" , IR);   
        }
         else if (salario > 4500){
            IR = ((salario - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f\n" , IR);   
        }
        
    }
}
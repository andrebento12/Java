import java.util.Scanner;

public class Uri1048{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        // System.out.println("Este arquivo eh so para copiar a estrutura");

        double salario, soma, reajuste;

        salario = teclado.nextDouble();

        if (salario >= 0 && salario <= 400.00){
            soma = 1.15 * salario;
            reajuste = soma - salario;
            System.out.printf("Novo salario: %.2f\n" , soma );
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 15 %");

        }
        else if (salario > 400.00 && salario <= 800.00){
            soma = 1.12 * salario;
            reajuste = soma - salario;
            System.out.printf("Novo salario: %.2f\n" , soma );
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 12 %");
        }
         else if (salario > 800.00 && salario <= 1200.00){
            soma = 1.10 * salario;
            reajuste = soma - salario;
            System.out.printf("Novo salario: %.2f\n" , soma );
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 10 %");
        }
        else if (salario > 1200.00 && salario <= 2000.00){
            soma = 1.07 * salario;
            reajuste = soma - salario;
            System.out.printf("Novo salario: %.2f\n" , soma );
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 7 %");
        }
        else if (salario > 2000){
            soma = 1.04 * salario;
            reajuste = soma - salario;
            System.out.printf("Novo salario: %.2f\n" , soma );
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 4 %");
        }
        
    }
}
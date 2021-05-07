import java.util.Scanner;

public class Exercicio_e{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        double area_trapezio, base_maior, base_menor, altura;

        System.out.println("Digite o valor da base maior do trapezio: ");
        base_maior = entrada.nextDouble();

        System.out.println("Digite o valor da base menor do trapezio: ");
        base_menor = entrada.nextDouble();

        System.out.println("Digite o valor da altura do trapezio: ");
        altura = entrada.nextDouble();

        area_trapezio = (base_maior + base_menor)* altura /2;

        System.out.println("O valor da area do Trapezio eh = " + area_trapezio);

        
    }


}
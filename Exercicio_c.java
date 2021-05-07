import java.util.Scanner;


public class Exercicio_c{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double triangulo, base, altura;
        System.out.println("Neste programa vamos calcular a area do triangulo");
        System.out.println("Digite o valor da base do triangulo: ");

        base = teclado.nextDouble();

        System.out.println("Digite o valor da altura do triangulo");
        
        altura = teclado.nextDouble();

        triangulo = (base * altura) /2.0;

        System.out.println("O valor da area do triangulo é: " + triangulo);
    }



}
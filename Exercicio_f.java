import java.util.Scanner;

public class Exercicio_f{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
// declaracao de variaveis
        double volume, altura, largura, profundidade;
// Leitura de dados
        System.out.println("Vamos calcular o volume do paralelepipedo!");
        System.out.println("Entre com a altura do paralelepipedo: ");
        altura = teclado.nextDouble();

        System.out.println("Entre com a largura do paralelepipedo: ");
        largura = teclado.nextDouble();

        System.out.println("Entre com a profundidade do paralelepipedo: ");
        profundidade = teclado.nextDouble();
// Processamento
        volume = altura * largura * profundidade;
// Saída
        System.out.println("O volume do paralelepipedo eh: " + volume);


        
    }



}
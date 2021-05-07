import java.util.Scanner;

public class TestandoDecisoes{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        double n1, n2, me;

        System.out.print("Digite a nota n1: ");
        n1 = teclado.nextDouble();
        System.out.print("Digite a nota n2: ");
        n2 = teclado.nextDouble();

        me = (n1 + n2)/ 2;

        System.out.printf("Sua media = %.1f\n", me);

        if (me >= 6.0) {
            System.out.println("Parabens, voce esta aprovado!");
                      }
        else {
            System.out.println("Eba, nos vemos no ano que vem!");
             }
    }

}
import java.util.Scanner;

public class Uri1008{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int NUMBER, HORAS_TRABALHADAS;
        Float VALOR_HORA, SALARY;

        NUMBER = teclado.nextInt();
        HORAS_TRABALHADAS = teclado.nextInt();
        VALOR_HORA = teclado.nextFloat();   

        SALARY = HORAS_TRABALHADAS * VALOR_HORA;     

        System.out.printf("NUMBER = %d\n" , NUMBER);
        System.out.printf("SALARY = U$ %.2f\n" , SALARY);
        
    }
}
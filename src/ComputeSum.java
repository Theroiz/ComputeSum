import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int somaTotal = 0;
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i == 0 ? "Insira um numero" : "Insira outro numero\nDigite 0/zero para terminar o calculo ");
            int soma = entrada.nextInt();
            if(soma == 0)
            {
                break;
            }
            somaTotal += soma;
        }
        System.out.println("\nO total da soma e:"+somaTotal);
       

    }
}

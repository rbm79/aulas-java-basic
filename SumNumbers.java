import java.util.Scanner;

public class SumNumbers {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = in.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = in.nextInt();

        System.out.println("Escolha a operação ([ + ],[ - ],[ * ],[ / ]): ");
        String op = in.next();

        double resultado = 0;
        switch (op) {
            case "+":
                resultado = numero1 + numero2;
                break;
        
            default:
                break;
        }

        System.out.println("RESULTADO DA OPERACAO - "+resultado );


        int total = numero1 + numero2 ;
        
        System.out.println("A soma dos dois numeros digitados é - "+ (numero1+numero2));
        
        System.out.println("A soma dos dois numeros digitados é - "+ total);

        in.close();
    }

}

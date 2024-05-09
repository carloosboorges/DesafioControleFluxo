import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUM = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUM, parametroDois);
        }catch (ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }


    }

    public static void contar(int parametroUM, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUM >= parametroDois) {
            throw new ParametrosInvalidosException(" O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUM;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

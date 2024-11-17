import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Imprimindo o número 1 ");
        int parametroUm = terminal.nextInt();
        System.out.println("Imprimindo o número 2 ");
        int parametroDois = terminal.nextInt();

        try {
                contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException exception){
                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i < contagem+1; i++) {
            System.out.println(i);
        }
    }
}
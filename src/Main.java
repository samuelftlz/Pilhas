import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Testar entradas predefinidas");
            System.out.println("2 - Testar uma entrada manual");
            System.out.println("0 - Sair");

            int opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    StackAutomaton.testesPredefinidos();
                    break;
                case 2:
                    StackAutomaton.testeComEntradaUsuario();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        leitor.close();
    }
}

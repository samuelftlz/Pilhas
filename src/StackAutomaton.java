import java.util.Scanner;
import java.util.Stack;

public class StackAutomaton {
    public static boolean acceptLanguage(String cadeia) {
        Stack<Character> pilha = new Stack<>();

        for (char caractere : cadeia.toCharArray()) {
            if (caractere == '0') {
                pilha.push('Z');
            } else if (caractere == '1') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            } else {
                return false;
            }
        }

        return pilha.isEmpty();
    }

    public static void testesPredefinidos() {
        String[] cadeiasTeste = {"", "01", "0011", "000111", "000", "011", "101", "0110", "0101"};

        System.out.println("Testando entradas predefinidas:");
        for (String cadeia : cadeiasTeste) {
            boolean aceita = acceptLanguage(cadeia);
            System.out.println("Entrada: \"" + cadeia + "\" - " + (aceita ? "Aceita" : "Rejeitada"));
        }
    }

    public static void testeComEntradaUsuario() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma cadeia para testar (apenas 0 e 1):");
        String cadeiaUsuario = leitor.nextLine();

        boolean aceita = acceptLanguage(cadeiaUsuario);
        System.out.println("Entrada: \"" + cadeiaUsuario + "\" - " + (aceita ? "Aceita" : "Rejeitada"));
    }
}

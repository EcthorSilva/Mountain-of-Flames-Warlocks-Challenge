import java.util.Scanner;

public class Metodos {
    // menu
    public static void menu() {
        Scanner input = new Scanner(System.in);
        boolean sair = false;

        // boas vindas
        clearConsole(); // Limpa o console
        System.out.printf("Mountain of Flames: Warlock's Challenge\n");
        System.out.printf("\nPressione Enter para iniciar o jogo...");
        input.nextLine(); // Avança para a próxima linha

        // menu principal
        while (!sair) {
            clearConsole();
            System.out.printf("Escolha uma das opções abaixo:\n1. Introdução\n2. Iniciar Jogo\n3. Créditos\n4. Sair\n");
            System.out.printf("\n>"); // Indica onde o usuario irá digitar

            int opcao = input.nextInt();
            input.nextLine(); // Avança para a próxima linha

            switch (opcao) {
                case 1:
                    clearConsole(); // Limpa o console
                    System.out.printf("-- INTRODUÇÃO --\n");
                    delay(1000); // Adiciona atraso 
                    Atos.boatos(input); // Exibe os boatos
                    delay(1500); // Adiciona atraso 
                    System.out.print("Pressione Enter para voltar ao menu...");
                    input.nextLine(); // Avança para a próxima linha
                    break;
                    case 2:
                    clearConsole(); // Limpa o console
                    // jogar(); // Inicia o Jogo
                    break;
                case 3:
                    clearConsole(); // Limpa o console
                    System.out.printf("--CRÉDITOS--\n\n");
                    Atos.creditos(input); // Exibe os créditos
                    break;
                case 4:
                    sair = true;
                    clearConsole(); // Limpa o console
                    System.out.print("Saindo do jogo...");
                    delay(1000); // Adiciona atraso 
                    break;
                default:
                    clearConsole(); // Limpa o console
                    System.out.printf("Opção inválida!\nPressione Enter para tentar novamente!");
                    input.nextLine(); // Avança para a próxima linha
                    System.out.println(" ");
            }
        }
        input.close();
    }

    // Função para limpar o console e reposicionar o cursor
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    // Função para adicionar delay aos textos do console
    public static void delay(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

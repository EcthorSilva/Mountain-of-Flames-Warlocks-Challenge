import personagem.*;
import java.util.Scanner;
import java.util.Random;

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
                    jogar(input); // Inicia o Jogo
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

    public static void jogar(Scanner input){
        clearConsole(); // Limpa o console
        System.out.printf("Carregando...\n");
        delay(1000); // Adiciona atraso 
        clearConsole(); // Limpa o console

        // Criação do personagem
        Aventureiro personagem = criarPersonagem(input);

        // Verifica os atributos do personagem
        verificarPersonagem(personagem);
        System.out.printf("\nPressione Enter para iniciar a campanha...");
        input.nextLine(); // Avança para a próxima linha
        clearConsole(); // Limpa o console

        // Inicia a campanha
        Atos.pag1(personagem, input); // Exibe a página 1
    }

    // Criação do personagem
    public static Aventureiro criarPersonagem(Scanner input){
        System.out.printf("Antes de iniciarmos esta campanha você precisará definir alguns atributos ao seu personagem\n\n");
        delay(1500); // Adiciona atraso
        System.out.printf("Vamos definir a habilidade do seu personagem.\nJogue um dado D6 e veja o resultado.\n\n");
        System.out.printf("Pressione Enter para jogar o dado...");
        input.nextLine(); // Avança para a próxima linha
        clearConsole(); // Limpa o console
        delay(1500); // Adiciona atraso
        int habilidade = rolarDadoD6() + 6;
        System.out.printf("\nCerto seu personagem tem %d de pontos de habilidade.\n\n", habilidade);
        delay(1500); // Adiciona atraso
        System.out.printf("Agora vamos definir quanto de energia o seu personagem tem.\nJogue dois dados D6 e veja o resultado.\n\n");
        System.out.printf("Pressione Enter para jogar os dados...");
        input.nextLine(); // Avança para a próxima linha
        clearConsole(); // Limpa o console
        delay(1500); // Adiciona atraso
        int energia = rolarDadoD6() + rolarDadoD6() + 12;
        System.out.printf("\nCerto seu personagem tem %d de pontos de energia.\n\n", energia);
        delay(1500); // Adiciona atraso
        System.out.printf("Por fim vamos definir a sorte do seu personagem.\nJogue um dado D6 e veja o resultado.\n\n");
        System.out.printf("Pressione Enter para jogar o dado...");
        input.nextLine(); // Avança para a próxima linha
        clearConsole(); // Limpa o console
        delay(1500); // Adiciona atraso
        int sorte = rolarDadoD6() + 6;
        System.out.printf("\nCerto seu personagem tem %d de pontos de sorte.\n\n", sorte);
        System.out.printf("Pressione Enter para iniciar a campanha...");
        input.nextLine(); // Avança para a próxima linha
        clearConsole(); // Limpa o console
        delay(1500); // Adiciona atraso

        return new Aventureiro(habilidade, energia, sorte, 0, 10);
    }

    // função para verificar os atributos do personagem
    public static void verificarPersonagem(Aventureiro personagem){
        System.out.printf("\nSeu personagem esta com %d de habilidade, %d de energia e %d de sorte. \n", personagem.getHabilidade(), personagem.getEnergia(), personagem.getSorte());
        // System.out.printf("Habilidade: %d\n", personagem.getHabilidade());
        // System.out.printf("Energia: %d\n", personagem.getEnergia());
        // System.out.printf("Sorte: %d\n", personagem.getSorte());
        System.out.printf("Ouro: %d\n", personagem.getOuro());
        System.out.printf("Provisões Restantes: %d\n", personagem.getProvisoesRestantes());
        System.out.printf("Equipamentos: %s\n", personagem.getEquipamentos());
        System.out.printf("Poções: %s\n", personagem.getPocoes());

        System.out.printf("habilidade inicial: %d\n", personagem.getHabilidadeInicial());
        System.out.printf("energia inicial: %d\n", personagem.getEnergiaInicial());
    }

    // Função para rolar um dado de 6 lados (D6)
    public static int rolarDadoD6(){
        Random random = new Random();
        return random.nextInt(6) + 1;
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

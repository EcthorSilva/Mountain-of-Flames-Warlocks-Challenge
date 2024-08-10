import java.util.Scanner;

import personagem.Aventureiro;

public class Atos {
    /* creditos */
    public static void creditos(Scanner input) {
        Metodos.delay(1000); // Adiciona atraso 
        System.out.printf("O Feiticeiro da Montanha de Fogo (The Warlock of Firetop Mountain)\n\n");
        Metodos.delay(1500); // Adiciona atraso 
        System.out.printf("Escrito por: Steve Jackson & Ian Livin stone, 1982\n");
        Metodos.delay(1000); // Adiciona atraso 
        System.out.printf("Publicado por: Editora Marques-Saraiva, 1991\n");
        Metodos.delay(1000); // Adiciona atraso 
        System.out.printf("Adaptado e Desenvolvido por: Ecthor Silva, 2024\n\n");
        Metodos.delay(1500); // Adiciona atraso 
        System.out.printf("Pressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha
    }

    /* boatos */
    public static void boatos(Scanner input) {
        System.out.printf("\nSomente um aventureiro imprudente partiria em uma busca tão perigosa sem primeiro descobrir o\r\n" + //
                        "máximo possível a respeito da montanha e seus tesouros. Antes da sua chegada ao sopé da\r\n" + //
                        "Montanha do Cume de Fogo, você passou diversos dias com as pessoas da cidadezinha local, a uns\r\n" + //
                        "dois dias de viagem da base do monte. Por ser uma pessoa simpática, você não teve muita\r\n" + //
                        "dificuldade em se relacionar com os camponeses da região. Embora eles contassem muitas histórias\r\n" + //
                        "sobre o misterioso santuário do Feiticeiro, você não ficou muito convencido de que todas - ou\r\n" + //
                        "alguma delas, na realidade - eram baseadas em fatos reais. Os moradores da vila tinham visto\r\n" + //
                        "muitos aventureiros passarem por lá a caminho da montanha, mas muito poucos retornaram algum\r\n" + //
                        "dia. A jornada que você tinha pela frente era extremamente perigosa, isso você sabia com certeza.\r\n" + //
                        "Nenhum daqueles que retornaram à cidadezinha pensava em voltar à Montanha do Cume de Fogo.\n\n");
        Metodos.delay(1500); // Adiciona atraso 
        System.out.print("Pressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha

        System.out.printf("\nParecia haver algum grau de verdade no boato de que o tesouro do Feiticeiro estava guardado em\r\n" + //
                        "uma arca magnífica, com duas fechaduras, e que as chaves para estas fechaduras ficavam guardadas\r\n" + //
                        "por vários seres horripilantes dentro das cavernas. O próprio Feiticeiro era um mágico de grande\r\n" + //
                        "poder. Alguns o descreviam como sendo um velho, outros como um jovem. Alguns diziam que seu\r\n" + //
                        "poder provinha de um baralho encantado, outros que era derivado das luvas de seda negra que ele\r\n" + //
                        "sempre usava.\n\n");
        Metodos.delay(1500); // Adiciona atraso 
        System.out.print("Pressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha

        System.out.printf("\nA entrada da montanha era guardada por um bando de Goblins com o rosto cheio de verrugas,\r\n" + //
                        "criaturas estúpidas que adoravam comer e beber. Nas câmaras mais interiores, os seres se tornavam\r\n" + //
                        "mais assustadores. Para chegar às câmaras interiores você teria que atravessar um rio. O serviço de\r\n" + //
                        "travessia era regular, mas o barqueiro gostava sempre de fazer bons negócios, por isso você deveria\r\n" + //
                        "ter uma Peça de Ouro para a viagem. Os habitantes locais também o incentivaram a fazer um bom\r\n" + //
                        "mapa de sua trajetória pois sem um mapa você terminaria se perdendo irremediavelmente no\r\n" + //
                        "interior da montanha.\n\n");
        Metodos.delay(1500); // Adiciona atraso 
        System.out.print("Pressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha

        System.out.printf("\nQuando finalmente chegou o seu dia de partir, a vila inteira apareceu para desejar a você uma\r\n" + //
                        "viagem segura. Os olhos de muitas da mulheres se encheram de lágrimas, tanto das jovens quanto\r\n" + //
                        "das velhas. Você não conseguiu evitar de pensar se não seriam lágrimas antecipadas de sofrimento,\r\n" + //
                        "choradas por olhos que não voltariam a vê-lo vivo.\n\n");
    }
    /* Página 1 */
    public static void pag1 (Aventureiro personagem, Scanner input){
        System.out.printf("Finalmente a sua caminhada de dois dias chegou ao fim. Você desembainha a sua espada, coloca-a\r\n" + //
                        "no chão e suspira aliviado, enquanto se abaixa para se sentar nas pedras cheias de musgo para um\r\n" + //
                        "momento de descanso. Você se espreguiça, esfrega os olhos e, afinal, olha para a Montanha do\r\n" + //
                        "Cume de Fogo.\n\n");
        Metodos.delay(1500); // Adiciona atraso 
        System.out.print("Pressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha

        System.out.printf("\nA própria montanha em si já tem um ar ameaçador. Algum animal gigantesco parece ter deixado as\r\n" + //
                        "marcas de suas garras na encosta íngreme diante de você. Penhascos rochosos e pontudos se\r\n" + //
                        "projetam, formando ângulos estranhos. No cume você já pode vislumbrar a sinistra coloração\r\n" + //
                        "vermelha - provavelmente alguma vegetação misteriosa - que deu nome à montanha. Talvez\r\n" + //
                        "ninguém jamais chegue a saber o que cresce lá em cima, uma vez que escalar o pico deve ser com\r\n" + //
                        "certeza impossível.\n\n");
        Metodos.delay(1500); // Adiciona atraso 
        System.out.print("Pressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha
        
        System.out.printf("\nSua busca está para começar. Do outro lado da clareira há uma escura entrada de caverna. Vocêr\r\n" + //
                        "pega a sua espada, levanta-se e considera que perigos podem estar à sua frente, Mas, comr\r\n" + //
                        "determinação, você recoloca a sua espada na bainha e se aproxima da caverna.\n\n");
        Metodos.delay(1500); // Adiciona atraso 
        System.out.print("Pressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha

        System.out.printf("\nVocê dá uma primeira olhada na penumbra e vê-paredes escuras e úmidas com poças de água no\r\n" + //
                        "chão de pedra à sua frente. O ar é frio e úmido. Você acende a sua lanterna e avança cautelosamente\r\n" + //
                        "pela escuridão. Teias de aranha tocam seu rosto e você ouve a movimentação de pés minúsculos: \r\n" + //
                        "muito provavelmente, ratazanas. Você adentra a caverna. Depois de uns poucos metros, chega logo \r\n" + //
                        "a uma encruzilhada.\n\n");
        Metodos.delay(1500); // Adiciona atraso 
        System.out.print("Pressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha
        
        System.out.printf("\nVocê vai virar para o oeste ou para o leste? \n1. ir para o oeste\n2. ir para o leste"); // oeste (vá para 71) leste (vá para 278)
        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int escolha = input.nextInt();
        input.nextLine(); // Avança para a próxima linha
        
        switch (escolha) {
            case 1:
                pag71(personagem, input); // oeste (vá para 71)
                break;
            case 2:
                pag278(personagem, input); // leste (vá para 278)
                break;
            default:
                System.out.printf("Opção inválida!\nPressione Enter para tentar novamente!");
                break;
        }
    }
    /* Pagina 33 */
    public static void pag33(Aventureiro personagem, Scanner input){
        System.out.printf("O ser que dormia desperta sobressaltado. Ele fica em pé e avança sobre você desarmado. Com sua \r\n" + //
                        "espada, você deve ser capaz de derrotá-lo, mas seus dentes afiados parecem bem perigosos.\n\n");
        System.out.printf("Você pode Fugir pela porta ou ficar e lutar contra o Orca que está atacando você.\n (Se você derrotar o ser, pode levar a caixa.)\n\n"); // fugir (vá para 320) lutar Se você derrotar o ser, pode levar a caixa. Vá para 147.
        System.out.printf("1. Fugir\n2. Lutar\n\n");
        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int escolha = input.nextInt();
        input.nextLine(); // Avança para a próxima linha
        
        switch (escolha) {
            case 1:
                // fugir (vá para 320).

                break;
            case 2:
                // lutar (Vá para 147)

                /*
                 * BATALHA
                 * 
                 * ORCA HABILIDADE 6 ENERGIA 4
                 * 
                */
                break;
            default:
                System.out.printf("Opção inválida!\nPressione Enter para tentar novamente!");
                break;
        }
    }
    /* Página 42 */
    public static void pag42(Aventureiro personagem, Scanner input){
        System.out.printf("Afinal você chega ao final da trilha, em um encontro de três caminhos. Você pode ir para o oeste ou para o leste.\n");
        System.out.printf("1. ir para oeste\n2. ir para leste");
        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int escolha = input.nextInt();
        input.nextLine(); // Avança para a próxima linha
                        
        switch (escolha) {
            case 1:
                // oeste (vá para 257)
                break;
            case 2:
                // leste (vá para 113)
                break;
            default:
                System.out.printf("Opção inválida!\nPressione Enter para tentar novamente!");
                break;
        }
    }

    /* Página 71 */
    public static void pag71(Aventureiro personagem, Scanner input){
        Metodos.clearConsole(); // Limpa o console
        System.out.printf("Há uma curva na passagem para a direita, levando para o norte. Cautelosamente, você se aproxima \r\n" + //
                        "de um posto de sentinela em um canto e, ao olhar para dentro, vê um ser estranho, parecido com um \r\n" + //
                        "Goblin, vestido de armadura de couro e adormecido em seu posto.\n\n");
        Metodos.delay(1500); // Adiciona atraso 
        System.out.print("Pressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha
        System.out.printf("\nVocê tenta passar por ele na ponta dos pés. Teste a sua Sorte.\n\n"); // teste sua sorte: Se você tiver sorte (vá para 301) Se você não tiver sorte (vá para 248)

        System.out.print("Pressione Enter para executar o teste de sorte...");
        input.nextLine(); // Avança para a próxima linha
        Metodos.delay(1500); // Adiciona atraso 

        // Teste de sorte
        int resultado = Metodos.testeDeSorte(personagem);

        if (resultado <= personagem.getSorte()){
            System.out.printf("\nEle não acorda e continua a roncar alto\n\n");
            personagem.setSorte(personagem.getSorte() - 1);
            System.out.printf("Você perdeu 1 ponto de sorte!\nSorte atual: %d\nSorte inicial: %d\n\n", personagem.getSorte(), personagem.getSorteInicial());
            System.out.print("Pressione Enter para continuar...");
            input.nextLine(); // Avança para a próxima linha
            pag301(personagem, input);
        }else{
            System.out.printf("\nvocê pisa em terreno mole e faz um barulho, e os olhos do ser se abrem instantaneamente\n\n");
            personagem.setSorte(personagem.getSorte() - 1);
            System.out.printf("Você perdeu 1 ponto de sorte!\nSorte atual: %d\nSorte inicial: %d\n\n", personagem.getSorte(), personagem.getSorteInicial());
            System.out.print("Pressione Enter para continuar...");
            input.nextLine(); // Avança para a próxima linha
            pag248(personagem, input);
        }

    }
    /* Página 82 */
    public static void pag82 (Aventureiro personagem, Scanner input){
        System.out.printf("A porta se abre para revelar um aposento pequeno e de cheiro forte. No centro do aposento há uma \r\n" + //
                        "mesa de madeira instável onde está uma vela acesa. Embaixo da mesa há uma pequena caixa de \r\n" + //
                        "madeira. Dormindo em um colchão de palha, no canto mais distante do aposento, está um ser baixo \r\n" + //
                        "e robusto, com um rosto feio e cheio de verrugas: o mesmo tipo de ser que você encontrou \r\n" + //
                        "dormindo no posto de sentinela. Deve ser o guarda do turno da noite. ");

        System.out.printf("Você pode retornar para o corredor e seguir em frente para o norte ou insinuar-se pelo aposento para tentar pegar \r\n" + //
                        "a caixa sem acordar o ser.\n\n1. Retornar para o corredor e seguir em frente para o norte\n2. Tentar pegar a caixa. Teste de Sorte.");
        
        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int escolha = input.nextInt();
        input.nextLine(); // Avança para a próxima linha
                        
        switch (escolha) {
            case 1:
                System.out.printf("Você retorna para o corredor e segue em frente para o norte.\n\n");
                System.out.print("Pressione Enter para continuar...");
                input.nextLine(); // Avança para a próxima linha
                pag208(personagem, input);
                break;
            case 2:
                // Teste de sorte
                int resultado = Metodos.testeDeSorte(personagem);

                if(resultado <= personagem.getSorte()){
                    System.out.printf("\nEle não acorda e continua a roncar alto\n\n");
                    personagem.setSorte(personagem.getSorte() - 1);
                    System.out.printf("Você perdeu 1 ponto de sorte!\nSorte atual: %d\nSorte inicial: %d\n\n", personagem.getSorte(), personagem.getSorteInicial());
                    System.out.print("Pressione Enter para continuar...");
                    input.nextLine(); // Avança para a próxima linha
                    pag147(personagem, input);
                }else{
                    System.out.printf("\nEle acordou\n\n");
                    personagem.setSorte(personagem.getSorte() - 1);
                    System.out.printf("Você perdeu 1 ponto de sorte!\nSorte atual: %d\nSorte inicial: %d\n\n", personagem.getSorte(), personagem.getSorteInicial());
                    System.out.print("Pressione Enter para continuar...");
                    input.nextLine(); // Avança para a próxima linha
                    pag33(personagem, input);
                }

                break;
            default:
                System.out.printf("Opção inválida!\nPressione Enter para tentar novamente!");
                break;
        }
    }
    /* Página 92 */
    public static void pag92(Aventureiro personagem, Scanner input){
        System.out.printf("Você chega de volta à encruzilhada na passagem. Você olha à esquerda e vê a entrada da caverna à \r\n" + //
                        "distância, na penumbra, mas segue em frente caminhando.\n\n");
        System.out.print("Pressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha
        pag71(personagem, input);
    }

    /* Página 147 */
    public static void pag147(Aventureiro personagem, Scanner input) {
        System.out.printf(
                "Você sai do aposento e abre a caixa na passagem. Lá dentro, você encontra uma única Peça de Ouro \r\n" + //
                "e um pequeno camundongo, que deve ter sido o animal de estimação do ser. Você guarda a moeda e \r\n" + //
                "solta o camundongo, que sai correndo pela passagem afora.\n\n");
        personagem.setOuro(personagem.getOuro() + 1);

        // Aumenta a SORTE, mas não pode exceder o valor inicial
        int sorteNova = personagem.getSorte() + 2;
        if (sorteNova > personagem.getSorteInicial()) {
            sorteNova = personagem.getSorteInicial();
        }
        personagem.setSorte(sorteNova);

        System.out.printf("Você ganhou 2 pontos de SORTE! Você tem agora %d pontos de SORTE.\n\n", personagem.getSorte());
        System.out.print("Pressione Enter para continuar...");
        input.nextLine(); // Avança para a próxima linha
        pag208(personagem, input);
    }
    /* Página 208 */
    public static void pag208(Aventureiro personagem, Scanner input){
        System.out.printf("Mais adiante na passagem, seguindo a parede oeste, você vê outra porta. Você escuta com o ouvido \r\n" + //
                        "colado nela, mas não ouve nada.");
        System.out.printf("Você quer abrir a porta?\n1. Abrir a porta\n2. Continuar na direção norte");

        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int escolha = input.nextInt();
        input.nextLine(); // Avança para a próxima linha
                        
        switch (escolha) {
            case 1:
                System.out.printf("Você tenta abrir a porta...\n\n");
                System.out.print("Pressione Enter para continuar...");
                input.nextLine(); // Avança para a próxima linha
                pag397(personagem, input);
                break;
            case 2:
                System.out.printf("Você continua na direção norte...\n\n");
                System.out.print("Pressione Enter para continuar...");
                input.nextLine(); // Avança para a próxima linha
                pag363(personagem, input);
                break;
            default:
                System.out.printf("Opção inválida!\nPressione Enter para tentar novamente!");
                break;
        }
    }

    /* Página 248 */
    public static void pag248(Aventureiro personagem, Scanner input){
        System.out.printf("O ser que acabou de acordar é um ORCA! Ele se levanta rápido e se vira para puxar uma corda que \r\n" + //
                        "provavelmente é a sineta do alarme. Você tem que atacá-lo imediatamente.\n\n");
        /*
         * BATALHA
         * 
         * ORCA HABILIDADE 6 ENERGIA 5 
         * Se você vencer, pode continuar seguindo a passagem vá para 301. 
         * 
        */

    }

    /* Página 278 */
    public static void pag278(Aventureiro personagem, Scanner input){
        System.out.printf("A passagem logo termina em uma porta de madeira trancada. Você cola o ouvido na porta. Mas não ouve nada.");

        System.out.printf("Você vai tentar derrubá-la?\n1. Derrubar a porta\n2. retornar à encruzilhada"); // Derrubar a porta (vá para 156) retornar à encruzilhada (vá para 92)

        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int escolha = input.nextInt();
        input.nextLine(); // Avança para a próxima linha
        
        switch (escolha) {
            case 1:
                //  Em caso afirmativo, volte para 156.
                break;
            case 2:
                System.out.printf("Você decide retornar à encruzilhada...\n\n");
                System.out.print("Pressione Enter para continuar...");
                input.nextLine(); // Avança para a próxima linha
                pag92(personagem, input);
                break;
            default:
                System.out.printf("Opção inválida!\nPressione Enter para tentar novamente!");
                break;
        }
    }

    /* Página 301 */
    public static void pag301(Aventureiro personagem, Scanner input){
        System.out.printf("À sua esquerda, na parte oeste da passagem, há uma porta de madeira rústica. Você pára junto a ela \r\n" + //
                        "e ouve um som áspero que poderia ser de algum tipo de criatura roncando.");
        System.out.printf("Você quer abrir a porta? \n1. Abrir a porta\n2. Continuar na direção norte"); 
        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int escolha = input.nextInt();
        input.nextLine(); // Avança para a próxima linha
        
        switch (escolha) {
            case 1:
                // Em caso afirmativo, volte para 82.
                System.out.printf("Você tenta abrir a porta...\n\n");
                System.out.print("Pressione Enter para continuar...");
                input.nextLine(); // Avança para a próxima linha
                pag82(personagem, input);
                break;
            case 2:
                // Se quiser seguir adiante para o norte, volte para 208.
                System.out.printf("Você continua na direção norte...\n\n");
                System.out.print("Pressione Enter para continuar...");
                input.nextLine(); // Avança para a próxima linha
                pag208(personagem, input);
                break;
            default:
                System.out.printf("Opção inválida!\nPressione Enter para tentar novamente!");
                break;
        }
    }
    /* Página 363 */
    public static void pag363(Aventureiro personagem, Scanner input){
        System.out.printf("Seguindo pela passagem na parede oeste, você vê outra porta semelhante. Você escuta junto à porta \r\n" + //
                        "e faz uma careta ao ouvir a voz mais desafinada que seus ouvidos já conheceram!\n\n");
        System.out.print(" Você quer entrar no aposento para investigar o horroroso som ou seguir adiante pela passagem?\n1. Investigar\n2. Seguir adiante"); // investigar o horroroso som (vá para 370) sair (volte para 363).
        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int escolha = input.nextInt();
        input.nextLine(); // Avança para a próxima linha
        switch (escolha) {
            case 1:
                // investigar o horroroso som (vá para 370)
                break;
            case 2:
                System.out.printf("Você decide seguir adiante pela passagem...\n\n");
                System.out.print("Pressione Enter para continuar...");
                input.nextLine(); // Avança para a próxima linha
                pag42(personagem, input);
                break;
            default:
                System.out.printf("Opção inválida!\nPressione Enter para tentar novamente!");
                break;
        }
    }

    /* Página 397 */
    public static void pag397(Aventureiro personagem, Scanner input){
        System.out.printf("A porta abre e revela um pequeno aposento de chão de pedra e paredes sujas. Há um cheiro de mofo \r\n" + //
                        "no ar. No centro do aposento, há uma mesa improvisada de madeira, em cima da qual está uma vela \r\n" + //
                        "acesa. Sob a mesa, há uma pequena caixa. No canto mais distante do aposento, há um colchão de \r\n" + //
                        "palha.\n\n");
        System.out.printf(" Você pode abrir a caixa ou sair do aposento.\n1.Abrir a caixa\n2. Sair do aponsento"); // abrir a caixa (volte para 240) ou sair (volte para 363).
        System.out.printf("\n>"); // Indica onde o usuario irá digitar
        int escolha = input.nextInt();
        input.nextLine(); // Avança para a próxima linha
        switch (escolha) {
            case 1:
                // abrir a caixa (volte para 240).
                break;
            case 2:
                System.out.printf("Você decide sair do aposento...\n\n");
                System.out.print("Pressione Enter para continuar...");
                input.nextLine(); // Avança para a próxima linha
                pag363(personagem, input);
                break;
            default:
                System.out.printf("Opção inválida!\nPressione Enter para tentar novamente!");
                break;
        }

    }
}
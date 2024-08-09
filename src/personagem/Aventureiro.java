package personagem;

import java.util.ArrayList;

public class Aventureiro {
    // Atributos que irão ser alterados durante o jogo
    private int habilidade;
    private int energia;
    private int sorte;

    // Atributos que não irão ser alterados durante o jogo (definidos no inicio da campanha)
    private int habilidadeInicial;
    // Atributos que poderão ser alterados durante o jogo dependendo do "nivel" (definidos no inicio da campanha)
    private int energiaInicial;
    private int sorteInicial;

    private int ouro;
    private int provisoesRestantes;

    private ArrayList<String> equipamentos;
    private ArrayList<String> pocoes;

    // Construtor da classe Aventureiro
    public Aventureiro(int habilidade, int energia, int sorte, int ouro, int provisoesRestantes) {
        this.habilidade = habilidade;
        this.energia = energia;
        this.sorte = sorte;
        this.habilidadeInicial = habilidade; // Armazena o valor inicial de habilidade
        this.energiaInicial = energia; // Armazena o valor inicial de energia
        this.sorteInicial = sorte; // Armazena o valor inicial de sorte
        this.ouro = ouro;
        this.provisoesRestantes = provisoesRestantes;
        this.equipamentos = new ArrayList<>();
        this.pocoes = new ArrayList<>();
    }

    // Métodos getters e setters para manipulação dos atributos
    public int getHabilidade() {return habilidade;}
    public void setHabilidade(int habilidade) {this.habilidade = habilidade;}
    
    public int getEnergia() {return energia;}
    public void setEnergia(int energia) {this.energia = energia;}

    public int getSorte() {return sorte;}
    public void setSorte(int sorte) {this.sorte = sorte;}

    public int getHabilidadeInicial() {return habilidadeInicial;}

    public int getEnergiaInicial() {return energiaInicial;}
    public void setEnergiaInicial(int energiaInicial) {this.energiaInicial = energiaInicial;}

    public int getSorteInicial() {return sorteInicial;}
    public void setSorteInicial(int sorteInicial) {this.sorteInicial = sorteInicial;}


    public int getOuro() {return ouro;}
    public void setOuro(int ouro) {this.ouro = ouro;}

    public int getProvisoesRestantes() {return provisoesRestantes;}
    public void setProvisoesRestantes(int provisoesRestantes) {this.provisoesRestantes = provisoesRestantes;}

    public ArrayList<String> getEquipamentos() {return equipamentos;}
    public void addEquipamento(String equipamento) {this.equipamentos.add(equipamento);}

    public ArrayList<String> getPocoes() {return pocoes;}
    public void addPocao(String pocao) {this.pocoes.add(pocao);}

}

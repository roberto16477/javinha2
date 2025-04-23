package strategy;

public class Main {
    public static void main(String[] args) {
        Personagem rei = new Rei();
        rei.atribuirArma(new Espada());
        rei.lutar();

        Personagem rainha = new Rainha();
        rainha.atribuirArma(new Arco());
        rainha.lutar();

        Personagem duende = new Duende();
        duende.atribuirArma(new Faca());
        duende.lutar();

        Personagem guerreiro = new Guerreiro();
        guerreiro.atribuirArma(new Machado());
        guerreiro.lutar();
    }
}

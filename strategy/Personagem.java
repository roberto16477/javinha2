package strategy;

public abstract class Personagem {
    protected Arma arma;

    public void lutar() {
        if (arma != null) {
            arma.usarArma();
        } else {
            System.out.println("Sem arma!");
        }
    }

    public void atribuirArma(Arma arma) {
        this.arma = arma;
    }
}

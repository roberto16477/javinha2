package strategy;

public abstract class Personagem {
    protected Arma arma;

    public void lutar() {
        System.out.print(getClass().getSimpleName() + " está lutando: ");
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

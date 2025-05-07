package exercicio_obs;

public class MultObserver implements Observer {

    public void update(int valor1, int valor2) {
        System.out.println("Multiplicação: " + (valor1 * valor2));
    }
    
}

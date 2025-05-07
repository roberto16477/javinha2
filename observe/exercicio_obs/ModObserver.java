package exercicio_obs;

public class ModObserver implements Observer {
    
    public void update(int valor1, int valor2) {
        if (valor2 != 0)
            System.out.println("Resto da divisão: " + (valor1 % valor2));
        else
            System.out.println("Resto da divisão: Divisão por zero!");
    }
}

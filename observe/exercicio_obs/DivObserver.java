package exercicio_obs;

public class DivObserver implements Observer {

    public void update(int valor1, int valor2) {
        if (valor2 != 0)
            System.out.println("Divisão inteira: " + (valor1 / valor2));
        else
            System.out.println("Divisão inteira: Divisão por zero!");
    }
    
}

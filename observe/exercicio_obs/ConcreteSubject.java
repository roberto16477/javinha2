package exercicio_obs;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int valor1;
    private int valor2;

    public void setValores(int v1, int v2) {
        this.valor1 = v1;
        this.valor2 = v2;
        valoresMudaram();
    }

    private void valoresMudaram() {
        notifyObservers();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(valor1, valor2);
        }
    }
}

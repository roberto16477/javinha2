package exercicio_obs;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        subject.registerObserver(new DivObserver());
        subject.registerObserver(new ModObserver());
        subject.registerObserver(new MultObserver());

        subject.setValores(10, 3);
        System.out.println("---");
        subject.setValores(20, 0);  // Teste com divisão por zero
    }
    
}

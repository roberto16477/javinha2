public class ComAdocante extends DrinkDecorator {
    public ComAdocante(Drink drink) {
        super(drink);
    }

    public String getDescricao() {
        return drink.getDescricao() + ", adoçante";
    }

    public double getPreco() {
        return drink.getPreco() + 1.0;
    }
}

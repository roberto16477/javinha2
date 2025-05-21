public class ComSaque extends DrinkDecorator {
    public ComSaque(Drink drink) {
        super(drink);
    }

    public String getDescricao() {
        return drink.getDescricao() + ", saquê";
    }

    public double getPreco() {
        return drink.getPreco() + 1.0;
    }
}

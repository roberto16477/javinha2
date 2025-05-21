public class ComKiwi extends DrinkDecorator {
    public ComKiwi(Drink drink) {
        super(drink);
    }

    public String getDescricao() {
        return drink.getDescricao() + ", Kiwi";
    }

    public double getPreco() {
        return drink.getPreco() + 4.0;
    }
}

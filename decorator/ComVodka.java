public class ComVodka extends DrinkDecorator {
    public ComVodka(Drink drink) {
        super(drink);
    }

    public String getDescricao() {
        return drink.getDescricao() + ", vodka";
    }

    public double getPreco() {
        return drink.getPreco() + 5.0;
    }
}

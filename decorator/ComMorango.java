public class ComMorango extends DrinkDecorator {
    public ComMorango(Drink drink) {
        super(drink);
    }

    public String getDescricao() {
        return drink.getDescricao() + ", morango";
    }

    public double getPreco() {
        return drink.getPreco() + 3.5;
    }
}

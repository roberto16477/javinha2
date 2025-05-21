public class ComAcucar extends DrinkDecorator {
    public ComAcucar(Drink drink) {
        super(drink);
    }

    public String getDescricao() {
        return drink.getDescricao() + ", açucar";
    }

    public double getPreco() {
        return drink.getPreco() + 1.0;
    }
}

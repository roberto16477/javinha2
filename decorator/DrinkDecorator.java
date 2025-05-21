public abstract class DrinkDecorator implements Drink {
    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    public abstract String getDescricao();
    public abstract double getPreco();
}

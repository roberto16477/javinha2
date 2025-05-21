public class Main {
    public static void main(String[] args) {
        // Caipira personalizada com vodka, morango e adoçante
        Drink meuDrink = new CaipiraBase();
        meuDrink = new ComVodka(meuDrink);
        meuDrink = new ComMorango(meuDrink);
        meuDrink = new ComAdocante(meuDrink);

        System.out.println("Pedido: " + meuDrink.getDescricao());
        System.out.println("Preço: R$ " + meuDrink.getPreco());

        System.out.println("------------");

        Drink meuDrink2 = new CaipiraBase();
        meuDrink2 = new ComSaque(meuDrink2);
        meuDrink2 = new ComKiwi(meuDrink2);
        meuDrink2 = new ComAcucar(meuDrink2);

        System.out.println("Pedido: " + meuDrink2.getDescricao());
        System.out.println("Preço: R$ " + meuDrink2.getPreco());

        System.out.println("------------");

        // Caipirinha pronta, não decorável
        Drink caipirinha = new Caipirinha();
        System.out.println("Pedido: " + caipirinha.getDescricao());
        System.out.println("Preço: R$ " + caipirinha.getPreco());
    }
}

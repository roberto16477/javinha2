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

        // Caipirinha pronta, não decorável
        Drink caipirinha = new Caipirinha();
        System.out.println("Pedido: " + caipirinha.getDescricao());
        System.out.println("Preço: R$ " + caipirinha.getPreco());
    }
}

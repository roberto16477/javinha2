public class FindGuitarTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("null", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        Guitar guitar = inventory.search(whatErinLikes);

        if (guitar != null) {
            System.out.println("A guitarra perfeita pra Erin é: ");
            System.out.println("Modelo: " + guitar.getModel());
            System.out.println("Construtor: " + guitar.getBuilder());
            System.out.println("Tipo: " + guitar.getType());
            System.out.println("Madeira traseira: " + guitar.getBackWood());
            System.out.println("Madeira superior: " + guitar.getTopWood());
            System.out.println("Preço: R$" + guitar.getPrice());
        } else {
            System.out.println("Nenhuma guitarra encontrada para Erin.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("E0705", 1499.99, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("E1310", 1549.99, Builder.GIBSON, "Les Paul", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE);
        inventory.addGuitar("V1503", 1299.99, Builder.MARTIN, "D-28", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.CEDAR);
    }
}

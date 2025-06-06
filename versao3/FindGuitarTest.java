import java.util.Iterator;
import java.util.List;

public class FindGuitarTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = 
            new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, 
                           Wood.ALDER, Wood.ALDER);

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Guitar guitar : matchingGuitars) {
                GuitarSpec spec = guitar.getSpec();

                System.out.println("We have a " + 
                    spec.getBuilder() + " " + spec.getModel() + " " +
                    spec.getType() + " guitar:\n" +
                    spec.getNumStrings() + " strings,\n" +
                    spec.getBackWood() + " back and sides,\n" +
                    spec.getTopWood() + " top. You can have it for only $" + 
                    guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("E0705", 1499.99, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("E1310", 1549.99, Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAPLE);
        inventory.addGuitar("V1503", 1299.99, Builder.MARTIN, "D-28", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD, Wood.CEDAR);
    }
}
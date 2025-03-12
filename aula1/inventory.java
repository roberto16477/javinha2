import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        for (Guitar guitar : guitars) {
            if (searchGuitar.getBuilder() != guitar.getBuilder()) continue;
            if (searchGuitar.getType() != guitar.getType()) continue;
            if (searchGuitar.getBackWood() != guitar.getBackWood()) continue;
            if (searchGuitar.getTopWood() != guitar.getTopWood()) continue;

            String model = searchGuitar.getModel();
            if (model != null && !model.isEmpty() &&
                !model.equalsIgnoreCase(guitar.getModel())) {
                continue;
            }

            return guitar;
        }
        return null;
    }
}
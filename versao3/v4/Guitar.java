public class Guitar extends Instrument{
    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        super(serialNumber, price, spec);
        }

    public String getSerialNumber(){
    return serialNumber;
    }

    public double getPrice(){
    return price;
    }

    public void setPrice(float newPrice){
    this.price = newPrice;
    }

    public GuitarSpec getSpec(){
    return spec;
    }

}
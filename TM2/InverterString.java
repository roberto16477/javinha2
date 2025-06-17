package TM2;
public class InverterString extends ProcessadorString {
    protected String transformar(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}

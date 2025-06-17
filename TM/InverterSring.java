public class InverterSring extends ProcessadorString {
    protected String transformar(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}

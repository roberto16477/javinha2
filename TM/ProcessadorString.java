package TM;
public abstract class ProcessadorString {
    // Template method
    public void processar(String s) {
        String resultado = transformar(s);
        imprimir(resultado);
    }

    // Método abstrato (hook method)
    protected abstract String transformar(String s);

    // Método comum
    protected void imprimir(String s) {
        System.out.println("Resultado: " + s);
    }
}

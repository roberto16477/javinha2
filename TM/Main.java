public class Main {
    public static void main(String[] args) {
        String texto = "Ressaca's Bar";

        ProcessadorString proc1 = new ParaMaiusculo();
        proc1.processar(texto);  // Resultado: RESSACA'S BAR

        ProcessadorString proc2 = new ParaMinusculo();
        proc2.processar(texto);  // Resultado: ressaca's bar

        ProcessadorString proc3 = new InverterString();
        proc3.processar(texto);  // Resultado: raB s'acasseR
    }
}

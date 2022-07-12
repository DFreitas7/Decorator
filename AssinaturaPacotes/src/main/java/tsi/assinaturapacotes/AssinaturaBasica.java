package tsi.assinaturapacotes;

public class AssinaturaBasica implements Assinatura {
    @Override
    public void mostrarRecursos() {
        System.out.println("Assinatura básica por R$ 9,99");
    }

    @Override
    public Double obterValor() {
        return 9.99d;
    }
}

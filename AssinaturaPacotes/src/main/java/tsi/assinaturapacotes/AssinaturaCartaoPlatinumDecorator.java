
package tsi.assinaturapacotes;

public class AssinaturaCartaoPlatinumDecorator extends AssinaturaDecorator {
    AssinaturaCartaoPlatinumDecorator(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void mostrarRecursos() {
        System.out.println("Cartão de crédito Platinum por R$ 49,99");
        assinatura.mostrarRecursos();
    }

    @Override
    public Double obterValor() {
        return assinatura.obterValor() + 49.99d;
    }
}

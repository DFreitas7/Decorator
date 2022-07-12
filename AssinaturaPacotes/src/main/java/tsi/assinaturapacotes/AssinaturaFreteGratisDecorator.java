
package tsi.assinaturapacotes;

public class AssinaturaFreteGratisDecorator extends AssinaturaDecorator {
    AssinaturaFreteGratisDecorator(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void mostrarRecursos() {
        System.out.println("Frete grátis em produtos por R$ 9,99");
        assinatura.mostrarRecursos();
    }

    @Override
    public Double obterValor() {
        return assinatura.obterValor() + 9.99d;
    }
}

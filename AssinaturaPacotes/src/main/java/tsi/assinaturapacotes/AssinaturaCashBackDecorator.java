
package tsi.assinaturapacotes;

public class AssinaturaCashBackDecorator extends AssinaturaDecorator {
    AssinaturaCashBackDecorator(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void mostrarRecursos() {
        System.out.println("Compra com Cash Back por R$ 19,99");
        assinatura.mostrarRecursos();
    }

    @Override
    public Double obterValor() {
        return assinatura.obterValor() + 19.99d;
    }
}

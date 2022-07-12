
package tsi.assinaturapacotes;

public class AssinaturaCaixaSurpresaDecorator extends AssinaturaDecorator {
    AssinaturaCaixaSurpresaDecorator(Assinatura assinatura) {
       super(assinatura);
    }

    @Override
    public void mostrarRecursos() {
        System.out.println("Caixa surpresa com produtos relacionados a filmes e séries por R$ 29,99");
        assinatura.mostrarRecursos();
    }

    @Override
    public Double obterValor() {
        return assinatura.obterValor() + 29.99d;
    }
}

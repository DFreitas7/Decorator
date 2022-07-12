
package tsi.assinaturapacotes;

import java.util.List;

public abstract class AssinaturaDecorator implements Assinatura {
    protected Assinatura assinatura;
    
    AssinaturaDecorator(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public void mostrarRecursos() {
        assinatura.mostrarRecursos();
    }

    @Override
    public Double obterValor() {
        return assinatura.obterValor();
    }
}

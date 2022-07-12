
package tsi.assinaturapacotes;

public class AssinaturaVariosDispositivosDecorator extends AssinaturaDecorator {
    AssinaturaVariosDispositivosDecorator(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void mostrarRecursos() {
        System.out.println("Assitir vídeos em vários dispositivos por R$ 19,99");
        assinatura.mostrarRecursos();
    }

    @Override
    public Double obterValor() {
        return assinatura.obterValor() + 19.99d;
    }
}

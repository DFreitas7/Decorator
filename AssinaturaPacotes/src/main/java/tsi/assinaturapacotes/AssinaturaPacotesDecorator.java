package tsi.assinaturapacotes;

import java.util.Scanner;

public class AssinaturaPacotesDecorator {

    public static void main(String[] args) {
        String[] pacotes = {
            "Assitir vídeos em vários dispositivos",
            "Frete grátis em produtos",
            "Caixa surpresa com produtos relacionados a filmes e séries",
            "Cartão de crédito Platinum",
            "Compra com Cash Back"
        };
        
        System.out.println("Bem vindo ao serviço de Venda de Assinaturas");
        System.out.println("A Assinatura Base custa R$ 9,99 e te permite Assistir vídeos num único dispositivo");
        
        Integer comando;

        Scanner scanner = new Scanner(System.in);
        Assinatura assinaturaDecorator = new AssinaturaBasica();
        do {
            System.out.println("Digite 1 para adicionar, 2 para reiniciar ou 0 para finalizar");
            comando = Integer.parseInt(scanner.nextLine());
            
            switch (comando) {
                case 1:
                    System.out.println("Digite o numero de um pacote para adicionar");
                    for(Integer numeroPacote = 1; numeroPacote <= pacotes.length; numeroPacote++) {
                        System.out.println(numeroPacote.toString() + ": " + pacotes[numeroPacote-1]);
                    }
                        
                    comando = Integer.parseInt(scanner.nextLine());
                    switch (comando) {
                        case 1:
                            assinaturaDecorator = new AssinaturaVariosDispositivosDecorator(assinaturaDecorator);
                            break;
                        case 2:
                            assinaturaDecorator = new AssinaturaFreteGratisDecorator(assinaturaDecorator);
                            break;
                        case 3:
                            assinaturaDecorator = new AssinaturaCaixaSurpresaDecorator(assinaturaDecorator);
                            break;
                        case 4:
                            assinaturaDecorator = new AssinaturaCartaoPlatinumDecorator(assinaturaDecorator);
                            break;
                        case 5:
                            assinaturaDecorator = new AssinaturaCashBackDecorator(assinaturaDecorator);
                            break;
                        default:
                            System.out.println("Numero inválido");
                         break;
                    }
                    break;
                case 2:
                    assinaturaDecorator = new AssinaturaBasica();
                    System.out.println("Você reiniciou sua assinatura");
                    break;
                default:
                    System.out.println("Finalizando assinatura");
                    break;
            }
        } while(comando != 0);
        
        assinaturaDecorator.mostrarRecursos();
        System.out.println("Valor total da assinatura: R$ " + assinaturaDecorator.obterValor());
    }
}

package apple;

import aparelhos.IPhone;
import recursos.chamadas.AparelhoTelefonico;
import recursos.chamadas.Telefone;
import recursos.internet.Google;
import recursos.internet.NavegadorInternet;
import recursos.musica.IPod;
import recursos.musica.ReprodutorMusical;

public class Apple {
    public static void main (String[] args) {
        IPhone iphone = new IPhone();
        ReprodutorMusical ipod = iphone;
        AparelhoTelefonico telefone = iphone;
        NavegadorInternet navegador = iphone;

        ipod.selecionarMusica();
        telefone.ligar();
        navegador.exibirPagina();
    }
}

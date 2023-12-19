package aparelhos;

import recursos.chamadas.AparelhoTelefonico;
import recursos.internet.NavegadorInternet;
import recursos.musica.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocarMusica () {
        System.out.println("Tocando música no IPhone *** ");
    }

    @Override
    public void pausarMusica () {
        System.out.println("Pausando música no IPhone *** ");
    }

    @Override
    public void selecionarMusica () {
        System.out.println("Selecionando música no IPhone *** ");
    }

    @Override
    public void ligar () {
        System.out.println("Fazendo ligação telefônica no IPhone *** ");
    }

    @Override
    public void atender () {
        System.out.println("Atendendo ligação telefônica no IPhone *** ");
    }

    @Override
    public void iniciarCorreioVoz () {
        System.out.println("Iniciando correio de voz no IPhone *** ");
    }

    @Override
    public void exibirPagina () {
        System.out.println("Exibindo página de internet no IPhone *** ");
    }

    @Override
    public void adicionarAba () {
        System.out.println("Abrindo nova aba de internet no IPhone *** ");
    }

    @Override
    public void atualizarPagina () {
        System.out.println("Atualizando página de internet no IPhone *** ");
    }

}
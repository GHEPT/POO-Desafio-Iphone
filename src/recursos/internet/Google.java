package recursos.internet;

public class Google implements NavegadorInternet {

    @Override
    public void exibirPagina () {
        System.out.println("Exibindo página de internet pelo Google . . . ");
    }

    @Override
    public void adicionarAba () {
        System.out.println("Abrindo página de internet pelo Google . . . ");
    }

    @Override
    public void atualizarPagina () {
        System.out.println("Atualizando página de internet pelo Google . . . ");
    }

}

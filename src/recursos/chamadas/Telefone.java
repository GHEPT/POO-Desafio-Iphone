package recursos.chamadas;

public class Telefone implements AparelhoTelefonico{

    @Override
    public void ligar () {
        System.out.println("Fazendo ligação pelo telefone - - - ");
    }

    @Override
    public void atender () {
        System.out.println("Atendendo ligação pelo telefone - - - ");
    }

    @Override
    public void iniciarCorreioVoz () {
        System.out.println("Iniciando correio de voz pelo telefone - - - ");
    }

}

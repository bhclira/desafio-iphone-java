package equipments.telefone;

public class Phone implements AparelhoTelefonico {
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }
}

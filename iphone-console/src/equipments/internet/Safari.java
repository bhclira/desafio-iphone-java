package equipments.internet;

public class Safari implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url + " no Safari");
    }

}

import equipments.internet.NavegadorInternet;
import equipments.internet.Safari;
import equipments.music.Ipod;
import equipments.music.ReprodutorMusical;
import equipments.telefone.AparelhoTelefonico;
import equipments.telefone.Phone;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
        
    }

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando a música: " + musica);
        
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
        
    }

    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Iphone");

        Ipod ipod = new Ipod();
        ipod.tocarMusica("Faixa 01");
        

        Phone phone = new Phone();
        phone.fazerChamada("4336-3996");
        

        Safari safari = new Safari();
        safari.exibirPagina("www.google.com");
        

        Iphone iphone = new Iphone();
        iphone.tocarMusica("Faixa 02");
        iphone.fazerChamada("3446-3996");
        iphone.exibirPagina("www.uol.com.br");

    }

   
}

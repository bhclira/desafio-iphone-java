import equipments.internet.NavegadorInternet;
import equipments.internet.Safari;
import equipments.music.Ipod;
import equipments.music.ReprodutorMusical;
import equipments.telefone.AparelhoTelefonico;
import equipments.telefone.Phone;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url + " no Safari via Iphone");
        
    }

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando a música: " + musica + " via IPhone");
        
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero + " via Iphone");
        
    }

    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Iphone");

        Ipod ipod = new Ipod();
        ipod.tocarMusica("Faixa 01");
        

        Phone phone = new Phone();
        phone.fazerChamada("4336-3996");
        

        Safari safari = new Safari();
        safari.exibirPagina("www.google.com");
        
        // Iphone consegue fazer tudo que os aparelhos 
        Iphone iphone = new Iphone();
        iphone.tocarMusica("Faixa 02");
        iphone.fazerChamada("3446-3996");
        iphone.exibirPagina("www.uol.com.br");

        // Iphone representado nas interfaces executa os comandos via iPhone
        Iphone em = new Iphone();
        ReprodutorMusical ipod2 = em;
        AparelhoTelefonico phone2 = em;
        NavegadorInternet safari2 = em;

        ipod2.tocarMusica("faixa 01");
        phone2.fazerChamada("4336-0000");
        safari2.exibirPagina("www.google.com");

    }

   
}

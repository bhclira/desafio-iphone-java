package equipments.music;

public class Ipod implements ReprodutorMusical {

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando a música " + musica + " no Ipod");
        
    }

}

package Talleres.Taller01;

public class MediaPlayer {
    private int volume;
    private String playbackState="Detenido";

    public void volumeUp(){
        
        if (volume<96){
            volume+=5;
            System.out.println("Volumen aumentado a: "+volume);
        }
        else if(volume==100){
            System.out.println("No se puede aumentar el volumen, volumen máximo alcanzado");        
        }
        else{
            volume=100;
            System.out.println("Volumen aumentado a: "+volume);
        }

    }
    public void volumeDown(){
        
        if (volume>4){
            volume-=5;
            System.out.println("Volumen disminuido a: "+volume);
        }
        else if(volume==0){
            System.out.println("No se puede disminuir el volumen, volumen mínimo alcanzado");        
        }
        else{
            volume=0;
            System.out.println("Volumen disminuido a: "+volume);
        }

    }

    public void switchPlaybackState(){
        if (playbackState=="Detenido"){
            playbackState="Reproduciendo";
        }
        else{
            playbackState="Detenido";
        }
    }

    public void getInfo(){
        System.out.println("El audio está: "+playbackState);
        System.out.println("El volumen es: "+volume);
    }

}

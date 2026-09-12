package Talleres.Taller01;

public class Thermometer {

    private int temperature;

    public void getTemperature(){
        System.out.println("La temperatura actual es: "+temperature+"ºc");;
    }

    public void setTemperature(int temperature){
        if(temperature>100||temperature<(-50)) {
            System.out.println("No se pudo actualizar la temperatura");
        }
        else{
            this.temperature=temperature;
            System.out.println("Temperatura actualizada");
        }
    }
}
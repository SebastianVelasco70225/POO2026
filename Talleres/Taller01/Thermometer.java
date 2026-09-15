package Talleres.Taller01;

public class Thermometer {

    private float temperature;

    public float getTemperature(){
        return temperature;
    }

    public boolean setTemperature(int temperature){
        if(temperature>100||temperature<(-50)) {
            return false;
        }
        else{
            this.temperature=temperature;
            return true;
        }
    }
}

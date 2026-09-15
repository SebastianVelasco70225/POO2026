package Talleres.Taller01;

public class TestTermomether {
    public static void main(String[] args) {
        Thermometer termomether= new Thermometer();
        boolean validTemperature=termomether.setTemperature(20);
        comprobation(validTemperature,20);
        validTemperature=termomether.setTemperature(200);
        comprobation(validTemperature, 200);
        validTemperature=termomether.setTemperature(-200);
        comprobation(validTemperature, -200);
    }
    public static void comprobation(boolean validTemperature, float temperature){
        if(validTemperature){
            System.out.println("Temperatura actualizada a: "+temperature);
        }
        else{
            System.out.println("No fue posible modificar la temperatura");
    }
}
}

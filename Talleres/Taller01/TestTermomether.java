package Talleres.Taller01;

public class TestTermomether {
    public static void main(String[] args) {
        Thermometer termomether= new Thermometer();
        termomether.setTemperature(20);
        termomether.getTemperature();
        termomether.setTemperature(-40);
        termomether.getTemperature();
        termomether.setTemperature(180);
        termomether.getTemperature();
        termomether.setTemperature(-180);
        termomether.getTemperature();
    }
}

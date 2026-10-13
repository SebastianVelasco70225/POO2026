package Talleres.taller03.domain;

public class Taxi extends Bus {
    private double kilometerPrice;
    private int kilometers;

    public int getKilometers(){
        return kilometers;
    }
    
    public void setKilometers(int kilometers){
        if (comprobation(kilometers)){
            throw new IllegalArgumentException("Los kil{ometros recorridos deben ser positivos");
        }
        this.kilometers=kilometers;
    }

    public double getKilometerPrice() {
        return kilometerPrice;
    }

    public void setKilometerPrice(double kilometerPrice) {
        if(comprobation(kilometerPrice)){
            throw new IllegalArgumentException("El precio por kilometro debe ser positivo");
        }
        this.kilometerPrice = kilometerPrice;
    }

    
    public Taxi(double basePrice,int id,double kilometerPrice,int kilometers){
        super(basePrice,id);
        setName("Taxi");
        setKilometerPrice(kilometerPrice);
        setKilometers(kilometers);
        setPrice(basePrice+(kilometerPrice*kilometers));
    }
    
    @Override 
    public String [] allInfo(){
        String[]list=new String[6];
        list[0]="Nombre: Taxi";
        list[1]="Id del taxi: "+getId();
        list[2]="Precio base del taxi: "+getBasePrice();
        list[3]="Precio por kilómetro recorrido del taxi: "+getKilometerPrice();
        list[4]="Kilómetros recorridos: "+getKilometers();
        list[5]="Precio de tarifa final del taxi: "+getPrice();
        return list;
    }
}
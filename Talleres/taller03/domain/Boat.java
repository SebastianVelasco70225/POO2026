package Talleres.taller03.domain;

public class Boat extends Taxi{
    private double embarguePrice;
    public double getEmbarguePrice() {
        return embarguePrice;
    }
    public void setEmbarguePrice(double embarguePrice) {
        if(comprobation(embarguePrice)){
            throw new IllegalArgumentException("El precio de embargo debe ser positivo");
        }
        this.embarguePrice = embarguePrice;
    }
    public Boat(double basePrice,double priceKilometer,int id,double embarguePrice, int kilometers){
        super(basePrice, id, priceKilometer, kilometers);
        setName("Bote");
        setEmbarguePrice(embarguePrice);
        setPrice(getPrice()+embarguePrice);
    }

    @Override 
    public String [] allInfo(){
        String[]list=new String[7];
        list[0]="Nombre: Bote";
        list[1]="Id del bote: "+getId();
        list[2]="Precio base del bote: "+getBasePrice();
        list[3]="Precio por kilómetro recorrido del bote: "+getKilometerPrice();
        list[4]="Kilómetros recorridos: "+getKilometers();
        list[5]="Precio fijo por embarque: "+getEmbarguePrice();
        list[6]="Precio de tarifa final del bote: "+getPrice();
        return list;
    }
    
}

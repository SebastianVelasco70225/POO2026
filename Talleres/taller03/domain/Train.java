package Talleres.taller03.domain;

public  class Train extends Taxi{
    private double ferroPrice;
    
    public double getFerroPrice() {
        return ferroPrice;
    }
    public void setFerroPrice(double ferroPrice) {
        if(comprobation(ferroPrice)){
            throw new IllegalArgumentException("El precio por el servicio ferroviario debe ser positivo");
        }
        this.ferroPrice = ferroPrice;
    }
    public Train (double kilometerPrice, double ferroPrice, int id,int kilometers){
        super(ferroPrice,id,kilometerPrice,kilometers);
        setName("Tren");
        setFerroPrice(ferroPrice);
        setPrice((getKilometerPrice()*getKilometers())+ferroPrice);
    }
    
    @Override 
    public String [] allInfo(){
        String[]list=new String[6];
        list[0]="Nombre: Tren";
        list[1]="Id del tren: "+getId();
        list[2]="Precio por el servicio ferroviario: "+getFerroPrice();
        list[3]="Precio por kilómetro recorrido del tren: "+getKilometerPrice();
        list[4]="Kilómetros recorridos: "+getKilometers();
        list[5]="Precio de tarifa final del tren: "+getPrice();
        return list;
    } 
}

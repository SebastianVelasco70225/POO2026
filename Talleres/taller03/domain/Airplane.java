package Talleres.taller03.domain;

public class Airplane extends Bus{
    private double kilogramPrice;
    private int kilograms;
    
    public int getKilograms() {
        return kilograms;
    }

    public void setKilograms(int kilograms) {
        if(comprobation(kilograms)){
            throw new IllegalArgumentException("Los kilogramos de equipaje deben ser positivos");
        }
        this.kilograms = kilograms;
    }

    public double getKilogramPrice() {
        return kilogramPrice;
    }

    public void setKilogramPrice(double kilogramPrice) {
        if(comprobation(kilogramPrice)){
            throw new IllegalArgumentException ("El precio por kilogramo de equipaje debe ser positivo");
        }
        this.kilogramPrice = kilogramPrice;
    }

    public Airplane(double basePrice,int id,double kilogramPrice,int kilograms){
        super(basePrice, id);
        setName("Avión");        
        setKilogramPrice(kilogramPrice);
        setKilograms(kilograms);
        setPrice(getBasePrice()+(getKilogramPrice()*getKilograms()));
    }
    
    @Override 
    public String[] allInfo(){
        String[]list=new String[5];
        list[0]="Nombre: Avión";
        list[1]="Id del avión: "+getId();
        list[2]="Precio base del avión: "+getBasePrice();
        list[3]="Precio por kilogramo de equipaje: "+getKilogramPrice();
        list[4]="Kilogramos cargados: "+getKilograms();
        list[5]="Precio de tarifa final del avión: "+getPrice();
        return list;
    }
}
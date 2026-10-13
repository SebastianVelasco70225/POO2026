package Talleres.taller03.domain;

public class Bus extends TransportService{
    private double basePrice;
    
    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        if (comprobation(basePrice)){
            throw new IllegalArgumentException("El precio debe ser positivo");
        }
        this.basePrice=basePrice;
    }

    public Bus (double basePrice, int id){
        setBasePrice(basePrice);
        setName("Bus");
        setId(id);
        setPrice(basePrice);
    }

	@Override
	public String[] allInfo() {
		String[]list=new String[4];
        list[0]="Nombre: Bus";
        list[1]="Id del bus: "+getId();
        list[2]="Precio base del bus: "+getBasePrice();
        list[3]="Precio de tarifa final del bus: "+getPrice();
        return list;
	}
}
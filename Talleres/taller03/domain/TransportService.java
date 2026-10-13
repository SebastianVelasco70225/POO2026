package Talleres.taller03.domain;

public abstract class TransportService {
    private int id;
    private double price;
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public boolean comprobation(double price){
        if(price<0||price==0){
            return true;
        }
        return false;
    }

    public abstract String[] allInfo();

}

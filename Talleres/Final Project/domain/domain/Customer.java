public class Customer extends Person {
    private Renting renting; 
    public Customer(int id, String name, String adress, Renting renting){
        super(id,name,adress);
        setRenting(renting);
    }
   
    public Renting getRenting() {
        return renting;
    }
    public void setRenting(Renting renting) {
        this.renting = renting;
    }

}

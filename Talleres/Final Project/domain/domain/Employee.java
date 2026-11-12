public class Employee extends Person{
    private String charge;
    private MovieStore movieStore;
    
    public Employee(int id, String name, String adress, String charge, MovieStore movieStore){
        super(id,name,adress);
        setCharge(charge);
        setMovieStore(movieStore);
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public MovieStore getMovieStore(){
        return movieStore;
    }

    public void setMovieStore(MovieStore movieStore){
        this.movieStore=movieStore;
    }
}

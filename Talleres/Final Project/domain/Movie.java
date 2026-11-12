public class Movie {
    private String title;
    private int pegi;
    private boolean available;
    private String category;
    private float rentPrice;
    private MovieStore movieStore; 

    public Movie (String title, int pegi, String category, float rentPrice, MovieStore movieStore){
        setAvailable(true);
        setTitle(title);
        setPegi(pegi);
        setCategory(category);
        setRentPrice(rentPrice);
        setMovieStore(movieStore);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public MovieStore getMovieStore() {
        return movieStore;
    }

    public void setMovieStore(MovieStore movieStore) {
        this.movieStore = movieStore;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(float rentPrice) {
        this.rentPrice = rentPrice;
    }
    
}

public class Person {
    private int identificationNumber;
    private String name;
    private String adress;

    public Person(int id, String name, String adress){
        setIdentificationNumber(id);
        setName(name);
        setAdress(adress);
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}

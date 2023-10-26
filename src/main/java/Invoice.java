public class Invoice {

    private String name, address, city, state, zip;
    public Invoice(String name, String address, String city, String state, String zip){
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String toString(){
        return "Ship to: \n\t" + this.name + "\n\t" + this.address + "\n\t" + this.city + ", " + this.state + " " + this.zip;
    }
}

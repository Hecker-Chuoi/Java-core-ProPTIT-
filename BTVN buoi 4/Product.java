abstract public class Product {
    private String name;
    private double price;
    private String TTSP;

    public Product(){}
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getName(){
        return name;
    }

    public String getTTSP() {
        return TTSP;
    }

    public void setTTSP(String TTSP) {
        this.TTSP = TTSP;
    }

    public double getPrice(){
        return price;
    }

    abstract public void displayAsTable();
    abstract public void displayAsList();
    abstract public void update();
    abstract public void getDetails();
    public boolean compare(String a){

    }
}

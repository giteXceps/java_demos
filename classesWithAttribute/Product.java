package classesWithAttribute;

public class Product {

    public Product(int id, String name, String description, double price, int stockAmount, String color) { // Constructer
        System.out.println("Started Constructer");
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
        this.color = color;
    }

    public Product(){
        
    }
    // attribute | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String color;
    private String code;

    // getter
    public int getId() {
        return id;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCode() {
        code = this.name.substring(0, 1) + this.id;
        return code;
    }
}

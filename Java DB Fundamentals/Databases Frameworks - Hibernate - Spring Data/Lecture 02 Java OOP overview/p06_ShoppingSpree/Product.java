package hw02_OOP_Overview.p06_ShoppingSpree;

class Product {
    private String name;
    private int price;

    Product(String name, int price) {
        setName(name);
        setPrice(price);
    }

    int getPrice() {
        return this.price;
    }

    String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return this.name + " " + this.price;
    }
    private void setPrice(int price) {
        if (price>=0){
            this.price = price;
        } else {
            throw new java.lang.RuntimeException("Money cannot be negative");
        }
    }
    private void setName(String name) {
        if (!"".equalsIgnoreCase(name.trim())){
            this.name = name;
        } else {
            throw new java.lang.RuntimeException("Name cannot be empty");
        }
    }
}

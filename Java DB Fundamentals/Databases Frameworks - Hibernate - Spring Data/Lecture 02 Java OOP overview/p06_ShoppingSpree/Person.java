package hw02_OOP_Overview.p06_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int money;
    private List<String> products;

    Person(String name, int money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    String buyProduct(Product product){
         if (this.money>=product.getPrice()){
             this.money-=product.getPrice();
             products.add(product.getName());
             return String.format("%s bought %s",this.name, product.getName());
         } else {
             return String.format("%s can't afford %s",this.name, product.getName());
         }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.products.size()>0){
        sb.append(this.name).append(" - ").append(String.join(", ", this.products));
        } else {
            sb.append(this.name).append(" - Nothing bought");
        }
        return  sb.toString();
    }

    private void setMoney(int money) {
        if (money>=0){
        this.money = money;
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

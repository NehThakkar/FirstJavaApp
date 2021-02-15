package models;

import java.util.Arrays;
import java.util.List;

public class GroceryItem {
    private String name;
    private double price;
    private String category;

    public GroceryItem(String name, double price, String category) {
        setName(name);
        setPrice(price);
        setCategory(category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>2) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name should be more than 2 letters");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0 && price<=150) {
            this.price = price;
        }
        else{
            throw new IllegalArgumentException("Price should be from 0 to 150");
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        List<String> categories = Arrays.asList("meat","eggs","vegetables","fruits","dairy");
        if(categories.contains(category.toLowerCase())){
            this.category = category;
        }
        else{
            throw new IllegalArgumentException("category should be from: "+categories);
        }
    }
}

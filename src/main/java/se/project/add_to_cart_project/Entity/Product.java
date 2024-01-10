package se.project.add_to_cart_project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    private Long id;

    @Column(name = "ProductName")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private String price;

    @Column(name = "image")
    private String image;

    @Column(name = "size")
    private String size;

    @Column(name = "color")
    private String color;
    
    
   
    public Product(Long id, String name, String description, String price, String image, String size, String color) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.size = size;
        this.color = color;
    }

    

    public Product(){
        
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
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



    public String getPrice() {
        return price;
    }



    public void setPrice(String price) {
        this.price = price;
    }



    public String getImage() {
        return image;
    }



    public void setImage(String image) {
        this.image = image;
    }



    public String getSize() {
        return size;
    }



    public void setSize(String size) {
        this.size = size;
    }



    public String getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = color;
    }
}

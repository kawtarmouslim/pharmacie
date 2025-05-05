package org.example.apppharmacie.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  float quantiteStock;
    private int price;
    private String description;
    public Produit() {
    }

    public Produit(Long id, String name, float quantiteStock, int price, String description) {
        this.id = id;
        this.name = name;
        this.quantiteStock = quantiteStock;
        this.price = price;
        this.description = description;
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

    public float getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(float quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

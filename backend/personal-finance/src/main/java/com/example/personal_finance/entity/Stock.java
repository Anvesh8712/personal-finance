package com.example.personal_finance.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String symbol;
    private String name;
    private double boughtPrice;

    @ManyToMany(mappedBy = "stocks")
    private Set<Investment> investments;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBoughtPrice() { return boughtPrice; }
    public void setBoughtPrice(double boughtPrice) { this.boughtPrice = boughtPrice; }

    public Set<Investment> getInvestments() { return investments; }
    public void setInvestments(Set<Investment> investments) { this.investments = investments; }
}

package org.launchcode.inventorytrackerspringboot.model;

import javax.persistence.*;

@Entity
@Table(name="inventories")
public class ExampleInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String exItemName;
    private String exCategory;

    public ExampleInventory() {
    }

    public ExampleInventory(String exItemName, String exCategory) {
        super();
        this.exItemName = exItemName;
        this.exCategory = exCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExItemName() {
        return exItemName;
    }

    public void setExItemName(String exItemName) {
        this.exItemName = exItemName;
    }

    public String getExCategory() {
        return exCategory;
    }

    public void setExCategory(String exCategory) {
        this.exCategory = exCategory;
    }
}

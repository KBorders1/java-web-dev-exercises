package restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private String type;
    private double price;
    private Date dateAdded;
    private boolean isNew;

    public MenuItem(String name, String description, String type, double price, Date dateAdded, boolean isNew) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.price = price;
        this.dateAdded = dateAdded;
        this.isNew = isNew;
    }

    public MenuItem(String name, String description, String type, double price) {
        this(name, description, type, price, new Date(), true);
    }
}

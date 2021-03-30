package Com.xsushirollx.sushibyte.xsushirollx.model;

import Com.xsushirollx.sushibyte.xsushirollx.service.Helper;

import java.awt.image.BufferedImage;
import java.util.Objects;
import java.util.Vector;

public class Food {

    private Integer id;

    private Integer restaurantID;

    private String name;

    private Double cost;

    private BufferedImage image;

    private String summary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(id, food.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private Integer special;

    private Integer is_active;

    //Relationships
    private Vector<OrderItem> orderitem = new Vector<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(Integer restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        Helper help = new Helper();
        this.cost = help.roundTwoPlaces(cost,2d);
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getSpecial() {
        return special;
    }

    public void setSpecial(Integer special) {
        this.special = special;
    }

    public Integer getIs_active() {
        return is_active;
    }

    public void setIs_active(Integer is_active) {
        this.is_active = is_active;
    }

    public Vector<OrderItem> getOrderitem() {
        return orderitem;
    }

    public void setOrderitem(Vector<OrderItem> orderitem) {
        this.orderitem = orderitem;
    }


}

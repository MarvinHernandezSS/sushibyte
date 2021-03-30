package Com.xsushirollx.sushibyte.xsushirollx.model;

import Com.xsushirollx.sushibyte.xsushirollx.service.Helper;

import java.util.Objects;
import java.util.Vector;

public class Restaurant {

    private Integer id;

    private String name;

    private Integer priceID;

    private Double averageRating;

    private String tags;

    private Integer isActive;

    //Relationships
    private Vector<AddressBook> locations = new Vector<>();

    private Vector<Discount> discounts = new Vector<>();

    private Vector<Food> food = new Vector<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return id.equals(that.id) && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriceID() {
        return priceID;
    }

    public void setPriceID(Integer priceID) {
        this.priceID = priceID;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        Helper help = new Helper();
        this.averageRating = help.roundTwoPlaces(averageRating,2d);
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        if (isActive == 0 || isActive == 1)
        {
            this.isActive = isActive;
        }
        this.isActive = isActive;
    }

    public Vector<AddressBook> getLocations() {
        return locations;
    }

    public void setLocations(Vector<AddressBook> locations) {
        this.locations = locations;
    }

    public Vector<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Vector<Discount> discounts) {
        this.discounts = discounts;
    }

    public Vector<Food> getFood() {
        return food;
    }

    public void setFood(Vector<Food> food) {
        this.food = food;
    }
}

package Com.xsushirollx.sushibyte.xsushirollx.model;

import Com.xsushirollx.sushibyte.xsushirollx.service.Helper;

import java.util.Objects;
import java.util.Vector;

public class PriceCategory {

    private Integer id;

    private Double price;

    //Relationships
    private Vector<Restaurant> locations = new Vector<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriceCategory that = (PriceCategory) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(String price) {
        Helper help = new Helper();
        if (help.isDouble(price)) {
            this.price = help.roundTwoPlaces(Double.parseDouble(price),2d);
        }
    }

    public void setPrice(Double price) {
        Helper help = new Helper();

        this.price = help.roundTwoPlaces(price,2d);
    }

    public Vector<Restaurant> getLocations() {
        return locations;
    }

    public void setLocations(Vector<Restaurant> locations) {
        this.locations = locations;
    }


}

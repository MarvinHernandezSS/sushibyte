package Com.xsushirollx.sushibyte.xsushirollx.model;

import Com.xsushirollx.sushibyte.xsushirollx.service.Helper;

import java.util.Objects;

public class Discount {

    private Integer id;

    private Integer restaurantID;

    private Double discountScale;

    private Double discountAmount;

    private Integer elderlyElligible;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discount discount = (Discount) o;
        return Objects.equals(id, discount.id);
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

    public Integer getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(Integer restaurantID) {
        this.restaurantID = restaurantID;
    }

    public Double getDiscountScale() {
        return discountScale;
    }

    public void setDiscountScale(Double discountScale) {
        this.discountScale = discountScale;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        Helper help = new Helper();
        this.discountAmount = help.roundTwoPlaces(discountAmount,2d);
    }

    public Integer getElderlyElligible() {
        return elderlyElligible;
    }

    public void setElderlyElligible(Integer elderlyElligible) {
        this.elderlyElligible = elderlyElligible;
    }
}

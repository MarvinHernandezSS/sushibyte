package Com.xsushirollx.sushibyte.xsushirollx.model;


import java.util.Objects;

public class AddressBook {

    private Integer id;

    private String streetAddress;

    private String city;

    private String state;

    private String zipCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressBook that = (AddressBook) o;
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

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state.toCharArray().length == 2) {
            this.state = state;
        }
    }

    public String getZipCode() {
        return zipCode;
    }
//don't know if I want to allow only 5 or the zip +4 format
    public void setZipCode(String zipCode) {
//        for (char c :zipCode.toCharArray()) {
//            if (c.)
//        }
//
//        if (zipCode.toCharArray().length == 5 && )
        this.zipCode = zipCode;
    }
}

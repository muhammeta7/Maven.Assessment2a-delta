package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    String line1;
    String line2;
    String city;
    String state;
    String zipcode;


    public Address() {
        this.line1 = "";
        this.line2 = "";
        this.city = "";
        this.state = "";
        this.zipcode ="";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.line1 = addressLine1;
        this.line2 = addressLine2;
        this.city= city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return line1;
    }

    public void setAddressLine1(String addressLine1) {
        this.line1 = addressLine1;
    }

    public String getAddressLine2() {
        return line2;
    }

    public void setAddressLine2(String addressLine2) {
        this.line2 = addressLine2;
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
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if( !this.line1.equals(((Address) o).line1) ){
            return false;
        }
        if( !this.line2.equals(((Address) o).line2) ){
            return false;
        }
        if( !this.city.equals(((Address) o).city) ){
            return false;
        }
        if( !this.state.equals(((Address) o).state) ){
            return false;
        }
        if( !this.zipcode.equals(((Address) o).zipcode) ){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public String toString(){
        String address = "Address{";
        String addLine1 = "addressLine1='" + this.line1 +"', ";
        String addLine2 = "addressLine2='" + this.line2 +"', ";
        String city = "city='" + this.city +"', ";
        String state = "state='" + this.state +"', ";
        String zipcode = "zipcode='" + this.zipcode +"'}";

        return address + addLine1 + addLine2 + city + state + zipcode;
    }
}

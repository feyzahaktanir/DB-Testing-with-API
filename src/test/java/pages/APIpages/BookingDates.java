package pages.APIpages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingDates {

    @JsonProperty("checkin")
    private String checkin;
    @JsonProperty("checkout")
    private String checkout;

    @JsonProperty("checkin")
    public String getCheckin(){return checkin;}
    @JsonProperty("checkin")
    public void setCheckin(String string){this.checkin = checkin;}

    @JsonProperty("checkout")
    public String getCheckout(){return checkout;}
    @JsonProperty("checkout")
    public void setCheckout(String string){this.checkout = checkout;}


    public BookingDates(String checkin, String checkout){
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString(){

        return"BookDates{" +
                "checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                "}";
    }


}
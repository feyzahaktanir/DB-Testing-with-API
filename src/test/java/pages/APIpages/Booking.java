package pages.APIpages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Booking {
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("totalprice")
    private int totalprice;
    @JsonProperty("depositpaid")
    private boolean depositpaid;
    @JsonProperty("bookingdates")
    private BookingDates bookingDates;
    @JsonProperty("additionalneeds")
    private String additionalneeds;

    @JsonProperty("firstname")
    public String getFirstname(){ return firstname;}
    @JsonProperty("firstname")
    public void setFirstname(String firstname){this.firstname = firstname;}

    @JsonProperty("lastname")
    public String getLastname(){ return lastname;}
    @JsonProperty("lastname")
    public void setLastname(String lastname){this.lastname = lastname;}

    @JsonProperty("totalprice")
    public int getTotalprice(){ return totalprice;}
    @JsonProperty("totalprice")
    public void setTotalprice(Integer totalprice){this.totalprice = totalprice;}

    @JsonProperty("depositpaid")
    public boolean getDepositpaid(){ return depositpaid;}
    @JsonProperty("depositpaid")
    public void setDepositpaid(Boolean depositpaid){this.depositpaid = depositpaid;}

    @JsonProperty("bookingdates")
    public BookingDates getBookingDates(){ return bookingDates;}
    @JsonProperty("bookingdates")
    public void setBookingDates(BookingDates bookingDates){this.bookingDates = bookingDates;}

    @JsonProperty("additionalneeds")
    public String getAdditionalneeds(){ return additionalneeds;}
    @JsonProperty("additionalneeds")
    public void setAdditionalneeds(String additionalneeds){this.additionalneeds = additionalneeds;}

    public Booking(String firstname, String lastname, Integer totalprice, Boolean depositpaid, BookingDates bookingDates, String additionalneeds){
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingDates = bookingDates;
        this.additionalneeds = additionalneeds;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "firstname='" + firstname + "" +
                ", lastname='" + lastname + "" +
                ", totalprice=" + totalprice +
                ", depositpaid=" + depositpaid +
                ", bookingdates=" + bookingDates +
                ", additionalneeds='" + additionalneeds + "" +
                '}';
    }
}
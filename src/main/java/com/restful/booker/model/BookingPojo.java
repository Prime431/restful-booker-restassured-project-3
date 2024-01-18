package com.restful.booker.model;

import java.util.HashMap;

public class BookingPojo {
    private String lastname;
    private int totalprice;
    private String checkin;
    private String checkout;
    private String additionalneeds;
    private Boolean depositpaid;
    private HashMap<String, String> bookingdates;
    private String firstname;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public HashMap<String, String> getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(HashMap<String, String> bookingdates) {
        this.bookingdates = bookingdates;
    }
}

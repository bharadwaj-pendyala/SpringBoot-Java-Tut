package com.restinit.restapitut;

public class HotelBooking {
    private String hotelName;
    private double pricePerNight;
    private int nbofNights;

    public HotelBooking() {

    }

    public HotelBooking(String hotelName, double pricePerNight, int nbOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbofNights = nbOfNights;
    }

    /**
     * @return the hotelName
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * @param hotelName the hotelName to set
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /**
     * @return the pricePerNight
     */
    public double getPricePerNight() {
        return pricePerNight;
    }

    /**
     * @param pricePerNight the pricePerNight to set
     */
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    /**
     * @return the nbofNights
     */
    public int getNbofNights() {
        return nbofNights;
    }

    /**
     * @param nbofNights the nbofNights to set
     */
    public void setNbofNights(int nbofNights) {
        this.nbofNights = nbofNights;
    }

    public double getTotalPrice() {
        return pricePerNight * nbofNights;
    }

}
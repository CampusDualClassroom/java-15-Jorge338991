package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    //atributos
    private Date expirationDate;

    //constructor
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    //metodos
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    @Override
    public Object getSpecificData() {
        SimpleDateFormat sDF = new SimpleDateFormat("dd-MM-yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("expiration date → ");
        sb.append(getFormattedDate(expirationDate));
        return getLocation() + "\n" + sb.toString();
    }

    @Override
    public String getLocation() {
        StringBuilder builder = new StringBuilder();
        builder.append("location → ");
        builder.append("Z - ");
        builder.append(getZone());
        builder.append(" A - ");
        builder.append(getArea());
        builder.append(" E - ");
        builder.append(getShelf());
        return builder.toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }

    public String getFormattedDate(Date expirationDate) {
        SimpleDateFormat sDF = new SimpleDateFormat("dd-MM-yyyy");
        StringBuilder sb = new StringBuilder();
        return sDF.format(expirationDate);
    }
}
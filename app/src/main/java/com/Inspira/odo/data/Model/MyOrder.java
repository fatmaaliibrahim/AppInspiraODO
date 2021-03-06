
package com.Inspira.odo.data.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyOrder {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("buyerPhoneNumber")
    @Expose
    private String buyerPhoneNumber;
    @SerializedName("orderPartType")
    @Expose
    private String orderPartType;
    @SerializedName("order")
    @Expose
    private OrderM order;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("orderImages")
    @Expose
    private List<Object> orderImages = null;
    @SerializedName("responses")
    @Expose
    private List<Object> responses = null;
    @SerializedName("carDetails")
    @Expose
    private CarDetails carDetails;
    @SerializedName("Date")
    @Expose
    private String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuyerPhoneNumber() {
        return buyerPhoneNumber;
    }

    public void setBuyerPhoneNumber(String buyerPhoneNumber) {
        this.buyerPhoneNumber = buyerPhoneNumber;
    }

    public String getOrderPartType() {
        return orderPartType;
    }

    public void setOrderPartType(String orderPartType)
    {
        this.orderPartType = orderPartType;
    }

    public OrderM getOrder() {
        return order;
    }

    public void setOrder(OrderM order) {
        this.order = order;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public List<Object> getOrderImages() {
        return orderImages;
    }

    public void setOrderImages(List<Object> orderImages) {
        this.orderImages = orderImages;
    }

    public List<Object> getResponses() {
        return responses;
    }

    public void setResponses(List<Object> responses) {
        this.responses = responses;
    }

    public CarDetails getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(CarDetails carDetails) {
        this.carDetails = carDetails;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}

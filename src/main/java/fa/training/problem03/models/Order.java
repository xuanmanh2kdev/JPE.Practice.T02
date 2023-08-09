package main.java.fa.training.problem03.models;

import java.time.LocalDateTime;

public class Order {
    int order_id;
    String customer_id;
    LocalDateTime order_date;
    LocalDateTime required_date;
    LocalDateTime shipped_date;
    String ship_address;

    public Order() {
    }

    public Order(int order_id, String customer_id, LocalDateTime order_date, LocalDateTime required_date,
            LocalDateTime shipped_date, String ship_address) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.order_date = order_date;
        this.required_date = required_date;
        this.shipped_date = shipped_date;
        this.ship_address = ship_address;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public LocalDateTime getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDateTime order_date) {
        this.order_date = order_date;
    }

    public LocalDateTime getRequired_date() {
        return required_date;
    }

    public void setRequired_date(LocalDateTime required_date) {
        this.required_date = required_date;
    }

    public LocalDateTime getShipped_date() {
        return shipped_date;
    }

    public void setShipped_date(LocalDateTime shipped_date) {
        this.shipped_date = shipped_date;
    }

    public String getShip_address() {
        return ship_address;
    }

    public void setShip_address(String ship_address) {
        this.ship_address = ship_address;
    }



    @Override
    public String toString() {
        return "Order [customer_id=" + customer_id + ", order_date=" + order_date + ", order_id=" + order_id
                + ", required_date=" + required_date + ", shipped_date=" + shipped_date + ", ship_address=" + ship_address
                + "]";
    }
}

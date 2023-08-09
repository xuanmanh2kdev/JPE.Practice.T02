package fa.training.problem03.models;

public class OrderDetail {
    int order_id;
    String product_id;
    int unit_price;
    int quantity;
    float discount;

    public OrderDetail() {
    }

    public OrderDetail(int order_id, String product_id, int unit_price, int quantity, float discount) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.unit_price = unit_price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public int getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(int unit_price) {
        this.unit_price = unit_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "order_id=" + order_id + ", product_id=" + product_id + ", unit_price=" + unit_price + ", quantity=" + quantity + ", discount=" + discount + '}';
    }
}

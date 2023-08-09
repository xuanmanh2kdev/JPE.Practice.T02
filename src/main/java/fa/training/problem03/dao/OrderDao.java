package fa.training.problem03.dao;

import java.util.List;
import java.util.Map;

public interface OrderDao {
    public String save(main.java.fa.training.problem03.models.Order order);
    public Map<String, Double> reportOfSale();
    List<main.java.fa.training.problem03.models.Order> findOrderByCustomer(String customerId);
}

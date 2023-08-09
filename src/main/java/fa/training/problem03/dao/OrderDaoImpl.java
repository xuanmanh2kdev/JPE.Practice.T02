package fa.training.problem03.dao;

import fa.training.problem03.dao.*;
import fa.training.problem03.models.*;
import fa.training.problem03.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderDaoImpl implements OrderDao {
        @Override
        public String save(main.java.fa.training.problem03.models.Order order){
          try(Connection conn = DBUtils.getConnection()){
                  String sql = "INSERT INTO Orders VALUES(?,?,?,?,?,?)";
                  PreparedStatement preparedStatement = conn.prepareStatement(sql);
                  preparedStatement.setInt(1, order.getOrder_id());
                  preparedStatement.setString(2, order.getCustomer_id());
                  preparedStatement.setTimestamp(3, Timestamp.valueOf(order.getOrder_date()));
                  preparedStatement.setTimestamp(4, Timestamp.valueOf(order.getRequired_date()));
                  preparedStatement.setTimestamp(5, Timestamp.valueOf(order.getShipped_date()));
                  preparedStatement.setString(6, order.getShip_address());
                  preparedStatement.executeUpdate();
                  return "success";
          }
          catch (Exception e){
                  System.out.println("Order is not saved");
          }
          return "fail";
        }

        @Override
        public Map<String, Double> reportOfSale() {
                try(Connection conn = DBUtils.getConnection()){
                        String sql = "SELECT customer_id, SUM(unit_price*quantity) AS total FROM Orders INNER JOIN OrderDetail ON Orders.order_id = OrderDetail.order_id WHERE order_date = CURDATE() GROUP BY customer_id";
                        PreparedStatement preparedStatement = conn.prepareStatement(sql);
                        ResultSet resultSet = preparedStatement.executeQuery();
                        Map<String, Double> map = new HashMap<>();
                        while(resultSet.next()){
                                map.put(resultSet.getString("customer_id"), resultSet.getDouble("total"));
                        }
                        return map;
                }catch (Exception e){
                        System.out.println("Order is not found");
                }
                return null;
        }

        @Override
        public List<main.java.fa.training.problem03.models.Order> findOrderByCustomer(String customerId){
                try(Connection conn = DBUtils.getConnection()){
                        String sql = "SELECT * FROM Orders WHERE customer_id = ?";
                        PreparedStatement preparedStatement = conn.prepareStatement(sql);
                        preparedStatement.setString(1, customerId);
                        ResultSet resultSet = preparedStatement.executeQuery();
                        List<main.java.fa.training.problem03.models.Order> list = new ArrayList<>();
                        while(resultSet.next()){
                                main.java.fa.training.problem03.models.Order order = new main.java.fa.training.problem03.models.Order();
                                order.setOrder_id(resultSet.getInt("order_id"));
                                order.setCustomer_id(resultSet.getString("customer_id"));
                                order.setOrder_date(resultSet.getTimestamp("order_date").toLocalDateTime());
                                order.setRequired_date(resultSet.getTimestamp("required_date").toLocalDateTime());
                                order.setShipped_date(resultSet.getTimestamp("shipped_date").toLocalDateTime());
                                order.setShip_address(resultSet.getString("ship_address"));
                                list.add(order);
                        }
                        return list;
                }catch (Exception e){
                        System.out.println("Order is not found");
                }
                return null;
        }
}

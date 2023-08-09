package fa.training.problem03.dao;

import fa.training.problem03.dao.OrderDao;
import org.junit.Test;

import java.time.LocalDateTime;

public class OrderDaoTest {

    @Test
    public void testOderSave() {
        OrderDAO orderDAO = new OrderDaoImpl();
        main.java.fa.training.problem03.models.Order order = new main.java.fa.training.problem03.models.Order(3, "abcd",LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now(), "Hanoi");
        System.out.println(orderDAO.save(order));
    }

    @Test
    public void testOderDetailSave() {
        OrderDetailDAO orderDetailDAO = new OrderDaoImpl();

        main.java.fa.training.problem03.models.OrderDetail orderDetail = new main.java.fa.training.problem03.models.OrderDetail(1, 2000, 3, 500);
        System.out.println(orderDetailDAO.save(orderDetail));
    }

    @Test
    public void testfindOrderByCustomer(){
        OrderDAO orderDAO = new OrderDaoImpl();
        System.out.println(orderDAO.findOrderByCustomer("12126"));}

    @Test
    public void testReportOfSale(){
        OrderDAO orderDAO = new OrderDaoImpl();
        System.out.println(orderDAO.reportOfSale());
    }
}

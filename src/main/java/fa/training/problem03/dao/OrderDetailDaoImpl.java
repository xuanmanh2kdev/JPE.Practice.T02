package fa.training.problem03.dao;

import fa.training.problem03.models.OrderDetail;
import fa.training.problem03.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OrderDetailDaoImpl implements OrderDetailDao {

    @Override
    public String save(OrderDetail orderDetail) {

        try(Connection conn = DBUtils.getConnection()){
            String sql = "INSERT INTO OrderDetail VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, orderDetail.getOrder_id());
            preparedStatement.setString(2, orderDetail.getProduct_id());
            preparedStatement.setInt(3, orderDetail.getUnit_price());
            preparedStatement.setInt(4, orderDetail.getQuantity());
            preparedStatement.setFloat(5, orderDetail.getDiscount());
            preparedStatement.executeUpdate();
            return "success";
        }catch (Exception e){
            System.out.println("OrderDetail is not saved");
        }
        return "fail";
    }
}

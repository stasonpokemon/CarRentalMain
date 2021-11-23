package dao;

import pojo.Car;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CarDaoImpl extends BaseDaoImpl implements CarDao {
    private static CarDaoImpl carDao;

    private CarDaoImpl() throws SQLException {
    }

    public static CarDaoImpl getInstance() throws SQLException {
        if (carDao == null) {
            carDao = new CarDaoImpl();
        }
        return carDao;
    }

    @Override
    public int getMaxCarId() {
        String sql = "SELECT MAX(id) FROM cars";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        int id = 0;
        try {
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                id = resultSet.getInt("MAX(id)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public Integer create(Car car) {
        String sql = "INSERT INTO cars (id, name, state) VALUES (?, ?, ?)";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, car.getId());
            statement.setString(2, car.getName());
            statement.setString(3, car.getState());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return car.getId();
    }

}

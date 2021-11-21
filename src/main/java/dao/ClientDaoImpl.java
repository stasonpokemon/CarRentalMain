package dao;

import pojo.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ClientDaoImpl extends BaseDaoImpl implements ClientDao {
   private static ClientDaoImpl clientDao;

    protected ClientDaoImpl() throws SQLException {
    }

    public static ClientDaoImpl getClientDao() {
        if (clientDao == null){
            try {
                clientDao = new ClientDaoImpl();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return clientDao;
    }

    @Override
    public Integer create(Client client) {
        String sql = "INSERT INTO clients (id, name , address) VALUES(?, ?, ?)";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, client.getId());
            statement.setString(2, client.getName());
            statement.setString(3, client.getAddress());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client.getId();
    }

    @Override
    public Client read(Integer id) {
        return null;
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Client> readAll() {
        return null;
    }

    @Override
    public int getMaxClientId() {
        String sql = "SELECT MAX(id) FROM clients";
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
}
package dao;

import pojo.Client;
import pojo.Order;

import java.util.List;

public interface OrderDao extends Dao<Order>{


    /*
    * Обновления заказа, который отклонён либо пока без возврата
    * */
    void updateWithoutRefund(Order order);


    /*
     * Список заказов определённого клиента
     * */
    List<Order> findAllOrdersByClient(Client user);

    /*
     * Список заказов с определённым статусом
     * */
    List<Order> findOrdersByStatus(String status);

    /*
    * Получение максимального id из всех заказов
    * */
    int getMaxOrderId();
}

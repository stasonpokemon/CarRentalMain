import com.google.gson.Gson;
import dao.OrderDaoImpl;
import menu.AdminMenu;
import pojo.OrdersForJson;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        final AdminMenu adminMenu = AdminMenu.getAdminMenu();
        adminMenu.menu();

//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss XXX");
//        String dateStr = "2019-04-22T13:07:31 +03:00";
//        Timestamp timestamp = null;
//        try {
//            timestamp = new Timestamp(format.parse(dateStr).getTime());
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(format.format(timestamp));
//
//        OrdersForJson orders = new OrdersForJson();
//        orders.addAllOrders(OrderDaoImpl.getOrderDao().readAll());
//        orders.getOrders().forEach(System.out::println);
//
//        Gson gson = new Gson();
//        final String s = gson.toJson(orders);
//        System.out.println(s);


//        String str = "$435.3";
//        String newStr = str.replace("$", "");
//        double d = Double.parseDouble(newStr);
//        System.out.println(d);





//        ImportOrdersFromJsonMenu.getMenu().parseJson().forEach(System.out::println);

////        Запись в JSON
//        String path = "orders2.json";
//        writeToJSON(path);


//        Чтение из JSON
//        String path2 = "orders.json";
//        final List<Order> orders = readFromJson(path2, Order.class);
//        orders.forEach(System.out::println);


    }

//    private  static <T extends Entity> List<Order> readFromJson(String path, Class<T> orderClass) {
//        List<Order> orders = new ArrayList<>();
//        Gson gson = new Gson();
//        try (Reader reader = new FileReader(path)) {
//            final JsonElement jsonElement = JsonParser.parseReader(reader);
//            final JsonArray asJsonArray = jsonElement.getAsJsonArray();
//            for (JsonElement element : asJsonArray) {
//                orders.add(gson.fromJson(element, (Type) orderClass));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return orders;
//    }
//
//    private static void writeToJSON(String path) {
//        List<Order> orders = OrderDaoImpl.getOrderDao().readAll();
//        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
//        try (FileWriter writer = new FileWriter(path)) {
//            gson.toJson(orders, writer);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
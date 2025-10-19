class OrderBase {
    String orderId;
    String orderDate;

    OrderBase(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrderInfo extends OrderBase {
    String trackingNumber;

    ShippedOrderInfo(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped with Tracking Number: " + trackingNumber;
    }
}

class DeliveredOrderInfo extends ShippedOrderInfo {
    String deliveryDate;

    DeliveredOrderInfo(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on: " + deliveryDate + " (Tracking: " + trackingNumber + ")";
    }
}

public class RetailOrderDemo {
    public static void main(String[] args) {
        OrderBase order1 = new OrderBase("ORD001", "2025-10-19");
        ShippedOrderInfo order2 = new ShippedOrderInfo("ORD002", "2025-10-18", "TRK12345");
        DeliveredOrderInfo order3 = new DeliveredOrderInfo("ORD003", "2025-10-17", "TRK54321", "2025-10-19");

        System.out.println(order1.getOrderStatus());
        System.out.println(order2.getOrderStatus());
        System.out.println(order3.getOrderStatus());
    }
}

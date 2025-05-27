package com.ednaldo.Order.services;

import com.ednaldo.Order.entities.Order;

public class ShippingService {

    public Double shippment(Order order) {

       if (order.getBasic() < 100.0){

          return order.getCode() + 20.0;

       } else if (order.getBasic() >= 100.0 && order.getBasic() < 200.0) {
           return order.getBasic() + 12.0;
       }else {
           return order.getBasic();
       }
    }
}

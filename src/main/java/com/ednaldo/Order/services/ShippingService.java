package com.ednaldo.Order.services;

import com.ednaldo.Order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shippment(Order order) {

        double basic = order.getBasic();

        if (basic < 100.0) {
            return 20.0;
        } else if (basic < 200.0) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}

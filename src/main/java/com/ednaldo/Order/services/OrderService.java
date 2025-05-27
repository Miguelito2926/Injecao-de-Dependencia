package com.ednaldo.Order.services;

import com.ednaldo.Order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public Double total(Order order) {

        return order.getBasic() - order.getDiscount();
    }
}

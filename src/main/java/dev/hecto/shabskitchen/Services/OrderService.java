package dev.hecto.shabskitchen.Services;

import dev.hecto.shabskitchen.Model.Order;
import dev.hecto.shabskitchen.Repository.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService
{
    @Autowired
    private OrdersRepo ordersrepo;

    public List<Order> findAll() {
        return ordersrepo.findAll();
    }

    public Order save(Order order) {
        return ordersrepo.save(order);
    }
}

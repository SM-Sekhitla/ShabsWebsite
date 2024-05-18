package dev.hecto.shabskitchen.Controller;

import dev.hecto.shabskitchen.Model.Order;
import dev.hecto.shabskitchen.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

        @Autowired
        private OrderService orderService;

        @GetMapping
        public List<Order> getAllOrders() {
            return orderService.findAll();
        }

        @PostMapping
        public Order placeOrder(@RequestBody Order order) {
            return orderService.save(order);
        }
}

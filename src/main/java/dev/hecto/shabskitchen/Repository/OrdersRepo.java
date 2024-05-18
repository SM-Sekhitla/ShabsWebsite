package dev.hecto.shabskitchen.Repository;

import dev.hecto.shabskitchen.Model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepo extends MongoRepository<Order,Integer> {
}

package dev.hecto.shabskitchen.Repository;

import dev.hecto.shabskitchen.Model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepo extends MongoRepository<Cart,Integer> {
}

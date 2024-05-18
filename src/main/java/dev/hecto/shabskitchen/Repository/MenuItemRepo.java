package dev.hecto.shabskitchen.Repository;

import dev.hecto.shabskitchen.Model.MenuItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuItemRepo extends MongoRepository<MenuItem,Integer> {
}

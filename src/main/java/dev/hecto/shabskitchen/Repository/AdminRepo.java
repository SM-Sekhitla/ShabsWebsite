package dev.hecto.shabskitchen.Repository;

import dev.hecto.shabskitchen.Model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface AdminRepo extends MongoRepository<Admin,Integer> {
    Optional<Admin> findById(Integer adminid);
    List<Admin> findAll();
}

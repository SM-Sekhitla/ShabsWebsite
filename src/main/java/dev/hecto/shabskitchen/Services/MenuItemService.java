package dev.hecto.shabskitchen.Services;

import dev.hecto.shabskitchen.Model.MenuItem;
import dev.hecto.shabskitchen.Repository.MenuItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuItemService
{
    @Autowired
    private MenuItemRepo menuItemRepo;


    public List<MenuItem> findAll() {
        return menuItemRepo.findAll();
    }

    public MenuItem save(MenuItem menuItem) {
        return menuItemRepo.save(menuItem);
    }

    public void delete(Integer id) {
        menuItemRepo.deleteById(id);
    }

    public Optional<MenuItem> findById(Integer id) {
        return menuItemRepo.findById(id);
    }
}

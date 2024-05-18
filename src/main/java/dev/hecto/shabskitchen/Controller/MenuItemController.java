package dev.hecto.shabskitchen.Controller;

import dev.hecto.shabskitchen.Model.MenuItem;
import dev.hecto.shabskitchen.Services.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menuitems")
public class MenuItemController
{
    @Autowired
    private MenuItemService menuitemservice;

    @GetMapping
    public List<MenuItem> getAllItems() {
        return menuitemservice.findAll();
    }

    @PostMapping
    public MenuItem addItem(@RequestBody MenuItem item) {
        return menuitemservice.save(item);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MenuItem> updateItem(@PathVariable Integer id, @RequestBody MenuItem item) {
        return menuitemservice.findById(id)
                .map(existingItem -> {
                    existingItem.setName(item.getName());
                    existingItem.setDescription(item.getDescription());
                    existingItem.setPrice(item.getPrice());
                    existingItem.setImages(item.getImages());
                    return ResponseEntity.ok(menuitemservice.save(existingItem));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Integer id) {
        menuitemservice.delete(id);
    }
}

package dev.hecto.shabskitchen.Controller;

import dev.hecto.shabskitchen.Model.Admin;
import dev.hecto.shabskitchen.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Admin.api")
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping("/addNewAdmin")
    public Admin addNewAdmin(@RequestParam String name) {
    Admin admin=new Admin();
    admin.setName(name);
        return adminService.save(admin);
    }

    ////@GetMapping("/getAdmin/{id}")
    public Admin getAdmin(@PathVariable Integer id){
        return adminService.findById(id).orElse(null);
    }

    //@GetMapping("/fetchAdmins")
    public List<Admin> Admins(){
        return adminService.allAdmins();
    }

}

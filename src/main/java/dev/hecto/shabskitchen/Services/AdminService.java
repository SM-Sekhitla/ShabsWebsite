package dev.hecto.shabskitchen.Services;

import dev.hecto.shabskitchen.Model.Admin;
import dev.hecto.shabskitchen.Repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AdminService
{
    @Autowired
    private AdminRepo adminrepo;
    /*@Autowired
    private BCryptPasswordEncoder passwordEncoder;*/

    public Admin save(Admin admin){
        return adminrepo.save(admin);
    }

    public Optional<Admin> findById(Integer adminId){
        return adminrepo.findById(adminId);
    }

    public List<Admin> allAdmins(){
        return adminrepo.findAll();
    }
}

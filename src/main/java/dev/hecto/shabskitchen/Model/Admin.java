package dev.hecto.shabskitchen.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "admin")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Admin {
    @Id
    private Integer adminId;
    private String username;
    private String email;
    private String password;
    //private String role;


    public String getPassword() {
        return password;
    }

    public String getName() {
        return username;
    }
    public Integer getAdminId() {
        return adminId;
    }

    public String getEmail() {
        return email;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }



    public void setName(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

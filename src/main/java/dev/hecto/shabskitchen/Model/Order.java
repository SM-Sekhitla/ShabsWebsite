package dev.hecto.shabskitchen.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order
{
    @Id
    private Integer orderId;
    private List<MenuItem> items;
    private Double totalPrice;
    private String name;
    private String address;
    private String contactNo;
    private Date timestamp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}

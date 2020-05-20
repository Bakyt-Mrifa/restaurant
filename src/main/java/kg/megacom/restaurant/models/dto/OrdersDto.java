package kg.megacom.restaurant.models.dto;

import kg.megacom.restaurant.models.domain.Customer;
import lombok.Data;

import java.util.Date;

@Data
public class OrdersDto {
    private Long id;
    private Customer customer;
    private Date createDate;
    private double cost;
}

package kg.megacom.restaurant.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OrdersDto {
    private Long orderId;
    private CustomerDto customerId;
    private Date createDate;
    private double cost;
}

package kg.megacom.restaurant.models.dto;

import kg.megacom.restaurant.models.domain.Dishes;
import kg.megacom.restaurant.models.domain.Orders;
import lombok.Data;

@Data
public class OrderDetailsDto {
    private Long id;
    private Orders orderId;
    private Dishes dishId;
    private Integer amount;;
}

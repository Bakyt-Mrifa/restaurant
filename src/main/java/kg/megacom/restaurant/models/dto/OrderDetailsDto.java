package kg.megacom.restaurant.models.dto;

import lombok.Data;

@Data
public class OrderDetailsDto {
    // @JsonProperty("orDetId")
    private Long orderDetailId;
    private OrdersDto orderId;
    private DishesDto dishId;
    private Integer amount;
}

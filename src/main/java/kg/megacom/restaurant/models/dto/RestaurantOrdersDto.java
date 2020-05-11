package kg.megacom.restaurant.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class RestaurantOrdersDto {
    private Long restaurantOrderId;
    private RestaurantDto restaurantId;
    private OrdersDto orderId;
    private boolean  isReady;
    private Date startDate;
    private Date endDate;

}

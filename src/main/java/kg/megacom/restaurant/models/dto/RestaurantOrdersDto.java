package kg.megacom.restaurant.models.dto;

import kg.megacom.restaurant.models.domain.Orders;
import kg.megacom.restaurant.models.domain.Restaurant;
import lombok.Data;

import java.util.Date;

@Data
public class RestaurantOrdersDto {
    private Long id;
    private Restaurant restaurant;
    private Orders order;
    private boolean  isReady;
    private Date startDate;
    private Date endDate;

}

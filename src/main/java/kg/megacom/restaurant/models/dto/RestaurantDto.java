package kg.megacom.restaurant.models.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class RestaurantDto {
    private Long restaurantId;
    private String name;
    private boolean isActive;
}

package kg.megacom.restaurant.models.dto;

import lombok.Data;

@Data
public class DishesDto {
    private Long dishId;
    private String dishName;
    private MenuDto menuId;
    private Integer dishSize;
    private String photo; //?????
    private boolean isActive;
}

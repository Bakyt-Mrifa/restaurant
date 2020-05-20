package kg.megacom.restaurant.models.dto;

import kg.megacom.restaurant.models.domain.Menu;
import lombok.Data;

@Data
public class DishesDto {
    private Long id;
    private String dishName;
    private Menu menu;
    private float dishSize;
    private String photo;
    private boolean isActive;
}

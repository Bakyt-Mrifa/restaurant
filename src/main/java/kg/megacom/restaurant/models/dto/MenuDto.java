package kg.megacom.restaurant.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MenuDto {
    private Long id;
    private RestaurantDto restaurant;
    private Date createDate;

}

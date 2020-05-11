package kg.megacom.restaurant.models.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class PricesDto {
    private Long priceId;
    private double price;
    private Date startDate;
    private Date endDate;
    private DishesDto dishId;
}

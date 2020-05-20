package kg.megacom.restaurant.models.dto;

import kg.megacom.restaurant.models.domain.Dishes;
import lombok.Data;

import java.util.Date;

@Data
public class PricesDto {
    private Long id;
    private double price;
    private Date startDate;
    private Date endDate;
    private Dishes dish;
}

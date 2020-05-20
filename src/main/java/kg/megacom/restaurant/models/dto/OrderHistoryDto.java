package kg.megacom.restaurant.models.dto;

import kg.megacom.restaurant.enums.OrderStatus;
import kg.megacom.restaurant.models.domain.Orders;
import kg.megacom.restaurant.models.domain.Users;
import lombok.Data;

import java.util.Date;

@Data
public class OrderHistoryDto {
    private Long id;
    private Date startDate;
    private Date endDate;
    private Users user;
    private Orders order;
    private OrderStatus status;
}

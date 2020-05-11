package kg.megacom.restaurant.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OrderStatusDto {
    private Long orderStatusId;
    private Date startDate;
    private Date endDate;
    private OrdersDto orderId;
    private UsersDto userId;
    private StatusesDto statusesId;
}

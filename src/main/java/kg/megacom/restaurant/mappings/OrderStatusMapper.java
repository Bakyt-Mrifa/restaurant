package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.OrderHistory;
import kg.megacom.restaurant.models.dto.DishesDto;
import kg.megacom.restaurant.models.dto.OrderHistoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderStatusMapper {

    OrderStatusMapper INSTANCE = Mappers.getMapper(OrderStatusMapper.class);
    OrderHistory OrderStatusDtoToOrderStatus(OrderHistoryDto orderHistoryDto);
    DishesDto OrderStatusToOrderStatusDto(OrderHistory orderHistory);
    void updateOrderStatusFromDto(OrderHistoryDto orderHistoryDto, @MappingTarget OrderHistory orderHistory);
}

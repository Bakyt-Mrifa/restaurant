package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.OrderStatus;
import kg.megacom.restaurant.models.dto.DishesDto;
import kg.megacom.restaurant.models.dto.OrderStatusDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderStatusMapper {

    OrderStatusMapper INSTANCE = Mappers.getMapper(OrderStatusMapper.class);
    OrderStatus OrderStatusDtoToOrderStatus(OrderStatusDto orderStatusDto);
    DishesDto OrderStatusToOrderStatusDto(OrderStatus orderStatus);
    void updateOrderStatusFromDto(OrderStatusDto orderStatusDto, @MappingTarget OrderStatus orderStatus);
}

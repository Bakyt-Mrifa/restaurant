package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.Orders;
import kg.megacom.restaurant.models.dto.OrdersDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrdersMapper {

    OrdersMapper INSTANCE = Mappers.getMapper(OrdersMapper.class);
    Orders OrdersDtoToOrders(OrdersDto ordersDto);
    OrdersDto OrdersToOrdersDto(Orders orders);
    void updateOrdersFromDto(OrdersDto ordersDto, @MappingTarget Orders orders);
}

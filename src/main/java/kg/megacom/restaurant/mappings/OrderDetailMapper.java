package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.OrderDetails;
import kg.megacom.restaurant.models.dto.OrderDetailsDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDetailMapper {

    OrderDetailMapper INSTANCE = Mappers.getMapper(OrderDetailMapper.class);
    OrderDetails OrderDetailsDtoToOrderDetails (OrderDetailsDto orderDetailsDto);
    OrderDetailsDto OrderDetailsToOrderDetailsDto(OrderDetails orderDetails);
    void updateOrderDetailsFromDto(OrderDetailsDto orderDetailsDto, @MappingTarget OrderDetails orderDetails);
}

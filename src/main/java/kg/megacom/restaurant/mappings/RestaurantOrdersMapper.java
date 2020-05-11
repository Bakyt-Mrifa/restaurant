package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.RestaurantOrders;
import kg.megacom.restaurant.models.dto.RestaurantOrdersDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantOrdersMapper {

    RestaurantOrdersMapper INSTANCE = Mappers.getMapper(RestaurantOrdersMapper.class);
    RestaurantOrders restaurantOrderDtoToRestaurantOrders(RestaurantOrdersDto restaurantOrdersDto);
    RestaurantOrdersDto restaurantOrderToRestaurantOrdersDto(RestaurantOrders restaurantOrders);
    void updateRestaurantOrdersFromDto(RestaurantOrdersDto restaurantOrdersDto, @MappingTarget RestaurantOrders restaurantOrders);
}

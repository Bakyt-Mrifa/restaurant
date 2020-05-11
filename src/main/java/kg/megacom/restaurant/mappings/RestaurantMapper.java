package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.Restaurant;
import kg.megacom.restaurant.models.dto.RestaurantDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);
    Restaurant restaurantDtoToRestaurant(RestaurantDto restaurantDto);
    RestaurantDto restaurantToRestaurantDto(Restaurant restaurant);
    void updateRestaurantFromDto(RestaurantDto restaurantDto, @MappingTarget Restaurant restaurant);
}

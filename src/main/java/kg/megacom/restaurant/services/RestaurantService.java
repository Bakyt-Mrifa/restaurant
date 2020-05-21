package kg.megacom.restaurant.services;

import kg.megacom.restaurant.models.dto.RestaurantDto;

import java.util.List;

public interface RestaurantService {
    RestaurantDto saveRestaurant(RestaurantDto restaurantDto);
    RestaurantDto findById(Long id);
    List<RestaurantDto> findRestaurants();
    List<RestaurantDto> findRestaurants(Integer pageNo,Integer pageSize,String sortBy);
}

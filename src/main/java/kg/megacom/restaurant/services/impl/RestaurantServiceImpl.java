package kg.megacom.restaurant.services.impl;

import kg.megacom.restaurant.database.RestaurantRepo;
import kg.megacom.restaurant.mappings.RestaurantMapper;
import kg.megacom.restaurant.models.domain.Restaurant;
import kg.megacom.restaurant.models.dto.RestaurantDto;
import kg.megacom.restaurant.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
/*
    1. Заведение нового ресторана
    2. Изменение ресторана
    3. Удаление
    4. Получение одного ресторана по ИД
    5. Получение списка всех ресторанов
    */
@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepo restaurantRepo;
    @Override
    public RestaurantDto saveRestaurant(RestaurantDto restaurantDto) {
        Restaurant restaurant= RestaurantMapper.INSTANCE.restaurantDtoToRestaurant(restaurantDto);
        restaurant= restaurantRepo.save(restaurant);
        System.out.println("save repository "+restaurant);

        restaurantDto=RestaurantMapper.INSTANCE.restaurantToRestaurantDto(restaurant);
        System.out.println("restaurant after convert to DTO "+restaurantDto);
        return restaurantDto;
    }

    @Override
    public RestaurantDto findById(Long id) {
        Restaurant restaurant=restaurantRepo.findById(id).orElse(new Restaurant());
        RestaurantDto restaurantDto=RestaurantMapper.INSTANCE.restaurantToRestaurantDto(restaurant);
        return restaurantDto;
    }

    @Override
    public List<RestaurantDto> findRestaurants() {
        return RestaurantMapper.INSTANCE.restaurantsToRestaurantDtos(restaurantRepo.findAll());
    }

    @Override
    public List<RestaurantDto> findRestaurants(Integer pageNo, Integer pageSize, String sortBy) {
        Pageable pageable= PageRequest.of(pageNo,pageSize, Sort.by(sortBy));
        return RestaurantMapper.INSTANCE.restaurantsToRestaurantDtos(restaurantRepo.findRestaurantsBy(pageable));

    }
}

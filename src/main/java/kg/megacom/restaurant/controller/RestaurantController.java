package kg.megacom.restaurant.controller;

import io.swagger.annotations.Api;
import kg.megacom.restaurant.models.dto.RestaurantDto;
import kg.megacom.restaurant.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/restaurants")
@Api(value = "Управление Ресторанами", description = "методы для управления Ресторанами")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;
    @PostMapping(value = "/save")
    public RestaurantDto saveRestaurant (@RequestBody RestaurantDto restaurantDto){
        System.out.println("Restaurant Controller " + restaurantDto);
        return restaurantService.saveRestaurant(restaurantDto);
    }
    @GetMapping(value = "/get")
    public RestaurantDto getRestaurant(@RequestParam(defaultValue = "1") Long id){
        return restaurantService.findById(id);
    }

    @GetMapping(value = "/getlist")
    public List<RestaurantDto> getRestaurantList(){
        return restaurantService.findRestaurants();
    }

    @GetMapping(value = "/getPageableList")
    public List<RestaurantDto> getPageableRestaurantList(
            @RequestParam(defaultValue = "0")Integer pageNo,
            @RequestParam(defaultValue = "3", name="size")Integer pageSize,
            @RequestParam(defaultValue = "name")String sortBy
    ){
        return restaurantService.findRestaurants(pageNo,pageSize,sortBy);
    }
}

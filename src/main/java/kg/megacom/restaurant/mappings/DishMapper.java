package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.Dishes;
import kg.megacom.restaurant.models.dto.DishesDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DishMapper {

    DishMapper INSTANCE = Mappers.getMapper(DishMapper.class);
    Dishes dishesDtoToDishes(DishesDto dishesDto);
    DishesDto dishesToDishesDto(Dishes dishes);
    void updateDishesFromDto(DishesDto dishesDto, @MappingTarget Dishes dishes);
}

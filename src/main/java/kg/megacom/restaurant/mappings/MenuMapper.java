package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.Menu;
import kg.megacom.restaurant.models.dto.MenuDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MenuMapper {

    MenuMapper INSTANCE = Mappers.getMapper(MenuMapper.class);
    Menu menuDtoToMenu(MenuDto menuDto);
    MenuDto menuToMenuDto(Menu menu);
    void updateMenuFromDto(MenuDto menuDto, @MappingTarget Menu menu);
}

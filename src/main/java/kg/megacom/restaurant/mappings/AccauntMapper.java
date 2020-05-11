package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.Accaunts;
import kg.megacom.restaurant.models.dto.AccauntsDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccauntMapper {

    AccauntMapper INSTANCE = Mappers.getMapper(AccauntMapper.class);
    Accaunts accountsDtoToAccaunt (AccauntsDto accauntsDto);
    AccauntsDto accountsToAccauntDto (Accaunts accaunts);
    void updateAccauntFromDto (AccauntsDto accauntsDto, @MappingTarget Accaunts accaunts);
}

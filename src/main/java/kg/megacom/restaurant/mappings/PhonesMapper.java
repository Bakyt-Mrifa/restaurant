package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.Phones;
import kg.megacom.restaurant.models.dto.PhonesDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PhonesMapper {

    PhonesMapper INSTANCE = Mappers.getMapper(PhonesMapper.class);
    Phones phonesDtoToPhones(PhonesDto phonesDto);
    PhonesDto phonesToPhonesDto(Phones phones);
    void updatePhonesFromDto(PhonesDto phonesDto, @MappingTarget Phones phones);
}

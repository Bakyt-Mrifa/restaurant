package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.Statuses;
import kg.megacom.restaurant.models.dto.StatusesDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StatusesMapper {

    StatusesMapper INSTANCE = Mappers.getMapper(StatusesMapper.class);
    Statuses statusesDtoToStatuses(StatusesDto statusesDto);
    StatusesDto statusesToStatusesDto(Statuses statuses);
    void updateStatusesFromDto(StatusesDto statusesDto, @MappingTarget Statuses statuses);
}

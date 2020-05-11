package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.Positions;
import kg.megacom.restaurant.models.dto.PositionsDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PositionsMapper {

    PositionsMapper INSTANCE = Mappers.getMapper(PositionsMapper.class);
    Positions positionsDtoToPositions(PositionsDto positionsDto);
    PositionsDto positionsToPositionsDto(Positions positions);
    void updatePositionsFromDto(PositionsDto positionsDto, @MappingTarget Positions positions);
}

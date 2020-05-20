package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.Accounts;
import kg.megacom.restaurant.models.dto.AccountsDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccauntMapper {

    AccauntMapper INSTANCE = Mappers.getMapper(AccauntMapper.class);
    Accounts accountsDtoToAccaunt (AccountsDto accountsDto);
    AccountsDto accountsToAccauntDto (Accounts accounts);
    void updateAccauntFromDto (AccountsDto accountsDto, @MappingTarget Accounts accounts);
}

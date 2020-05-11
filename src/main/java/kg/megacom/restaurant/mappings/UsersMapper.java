package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.Statuses;
import kg.megacom.restaurant.models.domain.Users;
import kg.megacom.restaurant.models.dto.StatusesDto;
import kg.megacom.restaurant.models.dto.UsersDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsersMapper {

    UsersMapper INSTANCE = Mappers.getMapper(UsersMapper.class);
    Users usersDtoToUsers(UsersDto usersDto);
    UsersDto usersToUsersDto(Users users);
    void updateUsersFromDto(UsersDto usersDto, @MappingTarget Users users);
}

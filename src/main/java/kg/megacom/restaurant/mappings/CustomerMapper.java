package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.Customer;
import kg.megacom.restaurant.models.dto.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    Customer customerDtoToCustomer(CustomerDto customerDto);
    CustomerDto customerToCustomerDto(Customer customer);
    void updateCustomerFromDto(CustomerDto customerDto, @MappingTarget Customer customer);
}

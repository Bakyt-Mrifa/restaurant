package kg.megacom.restaurant.mappings;

import kg.megacom.restaurant.models.domain.Prices;
import kg.megacom.restaurant.models.dto.PricesDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PricesMapper {

    PricesMapper INSTANCE = Mappers.getMapper(PricesMapper.class);
    Prices pricesDtoToPrices(PricesDto pricesDto);
    PricesDto pricesToPricesDto(Prices prices);
    void updatePricesFromDto(PricesDto pricesDto, @MappingTarget Prices prices);
}

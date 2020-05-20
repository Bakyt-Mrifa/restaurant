package kg.megacom.restaurant.models.dto;

import lombok.Data;

@Data
public class PositionsDto {
    private Long id;
    private String positionName;
    private boolean isActive;
}

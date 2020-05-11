package kg.megacom.restaurant.models.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class PositionsDto {
    private Long positionId;
    private String positionName;
    private boolean isActive;
}

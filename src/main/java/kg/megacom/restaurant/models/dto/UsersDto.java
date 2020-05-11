package kg.megacom.restaurant.models.dto;

import lombok.Data;

@Data
public class UsersDto {
    private Long userId;
    private String userName;
    private PositionsDto positionId;
    private boolean isActive;
}

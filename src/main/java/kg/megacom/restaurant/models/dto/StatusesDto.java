package kg.megacom.restaurant.models.dto;

import lombok.Data;

@Data
public class StatusesDto {
    private Long statusId;
    private String statusName;
    private boolean isActive;
}

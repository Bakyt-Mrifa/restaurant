package kg.megacom.restaurant.models.dto;

import lombok.Data;

@Data

public class PhonesDto {
    private Long id;
    private String phoneNum;
    private boolean isActive;
    private boolean isMain;
}

package kg.megacom.restaurant.models.dto;

import lombok.Data;

import javax.persistence.*;

@Data

public class PhonesDto {
    private Long phoneId;
    private String phoneNum;
    private boolean isActive;
    private boolean isMain;
    private UsersDto usersId;
}

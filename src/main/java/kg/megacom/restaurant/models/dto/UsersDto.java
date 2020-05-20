package kg.megacom.restaurant.models.dto;

import kg.megacom.restaurant.models.domain.Accounts;
import kg.megacom.restaurant.models.domain.Phones;
import kg.megacom.restaurant.models.domain.Positions;
import lombok.Data;

import java.util.List;

@Data
public class UsersDto {
    private Long id;
    private String userName;
    private Positions position;
    private boolean isActive;
    private Accounts accounts;
    private List<Phones> phones;
}

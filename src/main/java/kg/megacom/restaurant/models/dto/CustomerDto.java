package kg.megacom.restaurant.models.dto;

import lombok.Data;

@Data

public class CustomerDto {
    private Long id;
    private String customerName;
    private String address;
    private String houseNum;
    private String flatNum;
    private String phoneNum;
}

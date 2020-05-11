package kg.megacom.restaurant.models.dto;

import lombok.Data;

@Data

public class CustomerDto {
    private Long customerId;
    private String customerName;
    private String address;
    private String houseNum;
    private String flatNum;
    private String phoneNum;
}

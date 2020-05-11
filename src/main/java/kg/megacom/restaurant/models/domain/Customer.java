package kg.megacom.restaurant.models.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private Long customerId;
    private String customerName;
    private String address;
    private String houseNum;
    private String flatNum;
    private String phoneNum;
}

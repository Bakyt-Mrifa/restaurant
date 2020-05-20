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
    private Long id;
    @Column(length = 50, nullable = false)
    private String customerName;
    @Column(length = 100, nullable = false)
    private String address;
    @Column(length = 5)
    private String houseNum;
    @Column(length = 5)
    private String flatNum;
    @Column(length = 20)
    private String phoneNum;
}

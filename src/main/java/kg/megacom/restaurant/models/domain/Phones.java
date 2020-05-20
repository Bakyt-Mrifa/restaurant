package kg.megacom.restaurant.models.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "phones")
public class Phones {
    @Id
    @GeneratedValue
    @Column(name = "phone_id")
    private Long id;

    @Column(length = 20)
    private String phoneNum;

    private boolean isActive;
    private boolean isMain;
}

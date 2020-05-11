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
    private Long phoneId;
    private String phoneNum;
    private boolean isActive;
    private boolean isMain;
    @ManyToMany
    @JoinColumn(name = "user_id")
    private Users usersId;
}

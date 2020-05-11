package kg.megacom.restaurant.models.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long userId;
    private String userName;
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Positions positionId;
    private boolean isActive;
}

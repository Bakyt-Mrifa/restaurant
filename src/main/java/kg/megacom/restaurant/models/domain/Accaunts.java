package kg.megacom.restaurant.models.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "accaunts")
public class Accaunts {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long userId;
    private String login;
    private String password;
}

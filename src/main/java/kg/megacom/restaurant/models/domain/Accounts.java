package kg.megacom.restaurant.models.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "accounts")
public class Accounts {
    @Id
    @GeneratedValue
    @Column(name = "account_id")
    private Long id;
    @Column(length = 50)
    private String login;
    @Column(length = 50)
    private String password;

}

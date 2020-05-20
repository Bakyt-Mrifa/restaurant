package kg.megacom.restaurant.models.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "menus")
public class Menu {
    @Id
    @GeneratedValue
    @Column(name = "menu_id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    private Date createDate;

}

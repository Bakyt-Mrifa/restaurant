package kg.megacom.restaurant.models.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue
    @Column(name = "menu_id")
    private Long menuId;
    @OneToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurantId;

}

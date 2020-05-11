package kg.megacom.restaurant.models.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dishes")
public class Dishes {
    @Id
    @GeneratedValue
    @Column(name = "dish_id")
    private Long dishId;
    private String dishName;
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menuId;
    private Integer dishSize;
    private String photo; //?????
    private boolean isActive;
}

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
    private Long id;

    @Column(length = 100)
    private String dishName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_id")
    private Menu menu;

    private float dishSize;
    private String photo;
    private boolean isActive;
}

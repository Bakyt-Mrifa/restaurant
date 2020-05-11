package kg.megacom.restaurant.models.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue
    @Column(name = "restaurant_id")
    private Long restaurantId;
    private String name;
    private boolean isActive;
}

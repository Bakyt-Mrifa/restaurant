package kg.megacom.restaurant.models.domain;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "prices")
public class Prices {
    @Id
    @GeneratedValue
    @Column(name = "price_id")
    private Long priceId;
    private double price;
    private Date startDate;
    private Date endDate;
    @OneToOne
    @JoinColumn(name = "dish_id")
    private Dishes dishId;
}

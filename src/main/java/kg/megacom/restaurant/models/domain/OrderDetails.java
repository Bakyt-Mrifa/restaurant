package kg.megacom.restaurant.models.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_details")
public class OrderDetails {

    @Id
    @GeneratedValue
    @Column(name = "order_detail_id")
    private Long orderDetailId;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Orders orderId;
    @ManyToMany
    @JoinColumn(name = "dish_id")
    private Dishes dishId;
    private Integer amount;
}

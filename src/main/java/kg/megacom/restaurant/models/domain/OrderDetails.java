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
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Orders orders;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dish_id")
    private Dishes dishes;
    private Byte amount;
}

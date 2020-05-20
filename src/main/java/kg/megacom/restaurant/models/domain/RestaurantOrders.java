package kg.megacom.restaurant.models.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "restaurant_orders")
public class RestaurantOrders {
    @Id
    @GeneratedValue
    @Column(name = "restaurant_orders_id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "order_id")
    private Orders order;

    @Column(name = "is_ready")
    private boolean  isReady;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date startDate;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date endDate;

}

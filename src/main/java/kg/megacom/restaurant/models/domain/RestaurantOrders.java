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
    private Long restaurantOrderId;
    @OneToOne                                  //???????????????
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurantId;
    @OneToMany                                  //??????????????
    @JoinColumn(name = "order_id")
    private Orders orderId;
    private boolean  isReady;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date startDate;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date endDate;

}

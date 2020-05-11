package kg.megacom.restaurant.models.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long orderId;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date createDate;
    private double cost;
}

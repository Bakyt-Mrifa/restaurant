package kg.megacom.restaurant.models.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megacom.restaurant.enums.OrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "order_history")
public class OrderHistory {
    @Id
    @GeneratedValue
    @Column(name = "order_history_id")
    private Long id;
    @JsonFormat(pattern = "dd.MM.yyy")
    private Date startDate;
    @JsonFormat(pattern = "dd.MM.yyy")
    private Date endDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Users user;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Orders order;

    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;
}

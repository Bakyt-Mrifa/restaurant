package kg.megacom.restaurant.models.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "order_status")
public class OrderStatus {
    @Id
    @GeneratedValue
    @Column(name = "order_status_id")
    private Long orderStatusId;
    @JsonFormat(pattern = "dd.MM.yyy")
    private Date startDate;
    @JsonFormat(pattern = "dd.MM.yyy")
    private Date endDate;
    @OneToMany
    @JoinColumn(name = "order_id")
    private Orders orderId;
    @OneToMany
    @JoinColumn(name = "user_id")
    private Users userId;
    @OneToMany
    @JoinColumn(name = "status_id")
    private Statuses statusesId;
}

package kg.megacom.restaurant.models.domain;

import lombok.Data;
import org.springframework.core.KotlinReflectionParameterNameDiscoverer;

import javax.persistence.*;

@Data
@Entity
@Table(name = "positions")
public class Positions {
    @Id
    @GeneratedValue
    @Column(name = "position_id")
    private Long positionId;
    private String positionName;
    private boolean isActive;
}

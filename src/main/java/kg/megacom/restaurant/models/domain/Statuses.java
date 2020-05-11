package kg.megacom.restaurant.models.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "statuses")
@NoArgsConstructor
@RequiredArgsConstructor
public class Statuses {
    @Id
    @GeneratedValue
    @Column(name = "status_id")
    private Long statusId;
    @NonNull
    private String statusName;
    private boolean isActive;
}

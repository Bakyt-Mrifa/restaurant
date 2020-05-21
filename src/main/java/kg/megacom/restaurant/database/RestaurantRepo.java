package kg.megacom.restaurant.database;

import kg.megacom.restaurant.models.domain.Restaurant;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {
    List<Restaurant> findRestaurantsBy(Pageable pageable);
}

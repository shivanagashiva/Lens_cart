package Com.Amazon.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import Com.Amazon.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Additional query methods can be added here if needed
}

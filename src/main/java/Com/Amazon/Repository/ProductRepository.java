package Com.Amazon.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import Com.Amazon.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional query methods can be added here if needed
}

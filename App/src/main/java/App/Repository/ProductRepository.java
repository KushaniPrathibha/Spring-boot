package App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import App.Domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}

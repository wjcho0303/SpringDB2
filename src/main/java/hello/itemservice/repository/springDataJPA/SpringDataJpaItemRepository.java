package hello.itemservice.repository.springDataJPA;

import hello.itemservice.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaItemRepository extends JpaRepository<Item, Long> {
}

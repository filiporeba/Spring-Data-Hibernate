package shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.model.Gun;

@Repository
public interface GunRepo extends JpaRepository<Gun,Integer> {
}

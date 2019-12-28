package shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.model.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction,Integer> {
}

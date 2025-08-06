package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

}


package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.Deck;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Long> {

}
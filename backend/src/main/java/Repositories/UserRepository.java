package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
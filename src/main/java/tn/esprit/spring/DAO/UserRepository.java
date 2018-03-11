package tn.esprit.spring.DAO;

import org.springframework.data.jpa.repository.JpaRepository;



import tn.esprit.spring.entity.User;


//https://docs.spring.io/spring-data/jpa/docs/current/reference/html
public interface UserRepository extends JpaRepository<User, Long> {
  
}
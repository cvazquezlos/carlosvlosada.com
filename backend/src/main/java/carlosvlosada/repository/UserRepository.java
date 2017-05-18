package carlosvlosada.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import carlosvlosada.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
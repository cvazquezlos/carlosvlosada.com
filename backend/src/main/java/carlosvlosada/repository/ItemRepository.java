package carlosvlosada.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import carlosvlosada.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
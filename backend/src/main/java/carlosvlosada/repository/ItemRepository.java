package carlosvlosada.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import carlosvlosada.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

	List<Item> findByCategory(String category);
}
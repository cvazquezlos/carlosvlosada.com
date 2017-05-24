package carlosvlosada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import carlosvlosada.model.Item;
import carlosvlosada.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public List<Item> findAll() {
		return itemRepository.findAll();
	}

	public Page<Item> findAll(int page) {
		return itemRepository.findAll(new PageRequest(page, 3));
	}

	public List<Item> findByCategory(String category) {
		return itemRepository.findByCategory(category);
	}
	
	public Item findOne(int id) {
		return itemRepository.findOne(id);
	}
}
package App.Service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.Domain.Product;
import App.Repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public void saveProducts(HashMap<String, Object> itemMap){
		Product item = new Product();
		item.setProductName((String) itemMap.get("productName"));
	//	item.setPrice((Long) itemMap.get("price"));
		productRepository.save(item);
	}

}

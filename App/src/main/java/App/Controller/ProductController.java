package App.Controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Domain.Product;
import App.Repository.ProductRepository;
import App.Service.ProductService;

@RestController
@RequestMapping(value = "api/product")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void saveItems( @RequestBody HashMap<String,Object> itemMap) {
		productService.saveProducts(itemMap);
	}
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<Product> getAllProducts(){		
		return productRepository.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Product getItemById(@PathVariable("id") Long id){
		return productRepository.getOne(id);
	}

}

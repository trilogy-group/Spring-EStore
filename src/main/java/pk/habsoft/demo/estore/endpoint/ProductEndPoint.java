package pk.habsoft.demo.estore.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import pk.habsoft.demo.estore.dto.ProductDTO;
import pk.habsoft.demo.estore.service.ProductService;

@Api("products")
@RestController
@RequestMapping("/product")
public class ProductEndPoint {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ProductDTO getById(@PathVariable Long id) {
		System.out.println("Get by id : " + id);
		return productService.getById(id);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<ProductDTO> getAllProducts() {
		return productService.getAllProducts();
	}

}

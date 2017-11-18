package pk.habsoft.demo.estore.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import pk.habsoft.demo.estore.model.ProductDTO;
import pk.habsoft.demo.estore.service.ProductService;

@Api("products")
@RestController
@RequestMapping(Endpoints.ProductEndpoint.BASE_URL)
public class ProductEndPoint {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = Endpoints.ProductEndpoint.GET_BY_ID, method = RequestMethod.GET)
    @ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header")
    public ProductDTO getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @RequestMapping(value = Endpoints.ProductEndpoint.GET_ALL_PRODUCTS, method = RequestMethod.GET)
    @ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header")
    public List<ProductDTO> getAllProducts() {
        return productService.getAllProducts();
    }

}

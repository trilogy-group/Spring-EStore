package pk.habsoft.demo.estore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pk.habsoft.demo.estore.aop.audit.Auditable;
import pk.habsoft.demo.estore.model.CategoryDTO;
import pk.habsoft.demo.estore.model.ProductDTO;
import pk.habsoft.demo.estore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    private static final List<ProductDTO> PRODUCTS = new ArrayList<>();
    static {

        CategoryDTO c1 = new CategoryDTO(1L, "School Bags");
        CategoryDTO c2 = new CategoryDTO(2L, "Electonics");

        ProductDTO p1 = new ProductDTO(1L, "Book-01", 300, c1);
        ProductDTO p2 = new ProductDTO(2L, "Book-02", 300, c1);

        ProductDTO p3 = new ProductDTO(3L, "Nokia-3310", 2500, c2);
        ProductDTO p4 = new ProductDTO(4L, "Samsung S3", 25000, c2);

        PRODUCTS.add(p1);
        PRODUCTS.add(p2);
        PRODUCTS.add(p3);
        PRODUCTS.add(p4);

    }

    /*
     * (non-Javadoc)
     * 
     * @see pk.habsoft.demo.estore.service.impl.ProductService#getAllProducts()
     */
    @Override
    public List<ProductDTO> getAllProducts() {
        return new ArrayList<>(PRODUCTS);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * pk.habsoft.demo.estore.service.impl.ProductService#getById(java.lang.
     * Long)
     */
    @Override
    @Auditable(userId = 1, message = "getById called")
    public ProductDTO getById(Long id) {
        for (ProductDTO productDTO : PRODUCTS) {
            if (productDTO.getId() == id)
                return productDTO;
        }
        return null;
    }

}

package pk.habsoft.demo.estore.model;

import java.util.List;

public class CategoryDTO extends BaseDTO {

    private List<ProductDTO> products;

    public CategoryDTO(Long id, String name) {
        super(id, name);
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }

}

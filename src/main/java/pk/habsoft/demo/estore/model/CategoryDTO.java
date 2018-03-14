package pk.habsoft.demo.estore.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CategoryDTO extends BaseDTO {

    @JsonIgnore
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

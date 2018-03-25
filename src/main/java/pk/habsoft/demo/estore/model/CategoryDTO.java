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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((products == null) ? 0 : products.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        if (this == obj)
            return true;
        if (getClass() != obj.getClass())
            return false;
        CategoryDTO other = (CategoryDTO) obj;
        if (products == null) {
            if (other.products != null)
                return false;
        } else if (!products.equals(other.products))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CategoryDTO [products=" + products + "]";
    }
    
    

}

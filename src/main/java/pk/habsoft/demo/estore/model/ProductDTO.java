package pk.habsoft.demo.estore.model;

public class ProductDTO extends BaseDTO {

    private double price;

    private CategoryDTO category;

    public ProductDTO(Long id, String name, double price, CategoryDTO category) {
        super(id, name);
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

}

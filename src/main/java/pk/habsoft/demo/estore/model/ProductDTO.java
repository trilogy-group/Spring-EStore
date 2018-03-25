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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        ProductDTO other = (ProductDTO) obj;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ProductDTO [price=" + price + ", category=" + category + "]";
    }

}

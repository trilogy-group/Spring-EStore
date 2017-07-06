package pk.habsoft.demo.estore.dto;

public class BaseDTO {

    protected Long id;
    protected String name;

    public BaseDTO(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BaseDTO [id=" + id + ", name=" + name + "]";
    }

}

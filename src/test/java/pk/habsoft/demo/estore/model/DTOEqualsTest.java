package pk.habsoft.demo.estore.model;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class DTOEqualsTest {

    Warning[] warnings = new Warning[] { Warning.NONFINAL_FIELDS, Warning.NULL_FIELDS };

    @Test
    public void testProductDTOEquals() {
        ProductDTO p1 = new ProductDTO(1L, "prod-1", 30, new CategoryDTO(1L, "cat-1"));
        ProductDTO p2 = new ProductDTO(2L, "prod-2", 40, new CategoryDTO(2L, "cat-2"));

        EqualsVerifier.forClass(ProductDTO.class).suppress(warnings).usingGetClass()
                .withPrefabValues(ProductDTO.class, p1, p2).verify();

        CategoryDTO c1 = new CategoryDTO(1L, "cat-1");
        CategoryDTO c2 = new CategoryDTO(2L, "cat-2");

        EqualsVerifier.forClass(CategoryDTO.class).suppress(warnings).usingGetClass()
                .withPrefabValues(CategoryDTO.class, c1, c2).verify();
    }

    @Test
    public void testBulkDTOEquals() {
        Class<?>[] clazzes = new Class[] { BaseDTO.class, LoginRequest.class, UserDTO.class };

        for (Class<?> clazz : clazzes) {
            EqualsVerifier.forClass(clazz).suppress(warnings).usingGetClass().verify();
        }
    }

}

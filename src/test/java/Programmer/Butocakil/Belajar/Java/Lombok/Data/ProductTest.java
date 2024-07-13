package Programmer.Butocakil.Belajar.Java.Lombok.Data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void testGettersAndSetters() {
        // Create a new Product instance
        Product product = new Product("P001", "Product A", 100L);

        // Test getters
        assertEquals("P001", product.getId());
        assertEquals("Product A", product.getName());
        assertEquals(100L, product.getPrice());

        // Test setters
        product.setName("Product B");
        product.setPrice(200L);
        assertEquals("Product B", product.getName());
        assertEquals(200L, product.getPrice());
    }

    @Test
    void testToStringExcludesPrice() {
        // Create a new Product instance
        Product product = new Product("P001", "Product A", 100L);

        // Test toString()
        String productString = product.toString();
        assertTrue(productString.contains("id=P001"));
        assertTrue(productString.contains("name=Product A"));
        assertFalse(productString.contains("price=100"));
    }

    @Test
    void testAllArgsConstructor() {
        // Create a new Product instance using the AllArgsConstructor
        Product product = new Product("P001", "Product A", 100L);

        // Test the values
        assertEquals("P001", product.getId());
        assertEquals("Product A", product.getName());
        assertEquals(100L, product.getPrice());
    }

    @Test
    void testRequiredArgsConstructor() {
        // Create a new Product instance using the RequiredArgsConstructor
        Product product = new Product("P001");

        // Test the values
        assertEquals("P001", product.getId());
        assertNull(product.getName());
        assertEquals(0L, product.getPrice());
    }
}
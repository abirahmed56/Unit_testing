import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    @Test
    void returnProduct() {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",2,100000);
        ad.addProducts("Toyota","Vehicle","Car",4,100000);
        ad.addProducts("Toyota","Vehicle","Car",5,100000);
        Products pd=new Products();
        assertEquals(true,pd.returnProduct(2));
    }

    @Test
    void viewProducts() {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",2,100000);
        ad.addProducts("Toyota","Vehicle","Car",4,100000);
        ad.addProducts("Toyota","Vehicle","Car",5,100000);
        Products pd=new Products();
        assertEquals(3,pd.viewProducts().size());
    }
}
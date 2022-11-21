import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

@Test
    void testAddProducts()
{
   Admin ad=new Admin();
   assertEquals(true,ad.addProducts("Toyota","Vehicle","Car",1,100000));
}
    @Test
    void testAddProducts1()
    {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",2,100000);
        //same id test case fails
        assertEquals(true,ad.addProducts("Toyota","Vehicle","Car",2,100000));
    }
    @Test
    void testDeleteProducts()
    {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",2,100000);

        //same id test case fails
        assertEquals(true,ad.deleteProducts(2));
    }
    @Test
    void testDeleteProducts1()
    {
        Admin ad=new Admin();

        //no such id test case fails
        assertEquals(true,ad.deleteProducts(3));
    }
    @Test
    void testViewProducts()
    {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",10,100000);
        ad.addProducts("Toyota","Vehicle","Car",4,100000);
        ad.addProducts("Toyota","Vehicle","Car",5,100000);
        List<Products> productsList=ad.viewProducts();
        //testing if the product list is equal to the actual added products
        assertEquals(ad.totalProducts,productsList.size());
    }
    @Test
    void testViewProducts1()
    {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",2,100000);
        ad.addProducts("Toyota","Vehicle","Car",4,100000);
        ad.addProducts("Toyota","Vehicle","Car",2,100000);
        List<Products> productsList=ad.viewProducts();
        //two products have same id so one should not be added so product list should be 1 less than added items: test case fails
        assertEquals(3,productsList.size());
    }
    @Test
    void testModifyProducts()
    {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",2,100000);
        ad.addProducts("Toyota","Vehicle","Car",4,100000);
        ad.addProducts("Toyota","Vehicle","Car",1,100000);
       ad.modifyProducts(4,"Toyota","Vehicle","ModelCars");
       assertEquals(true,  ad.modifyProducts(4,"Toyota","Vehicle","ModelCars"));
    }
    @Test
    void testModifyProducts1()
    {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",2,100000);
        ad.addProducts("Toyota","Vehicle","Car",4,100000);
        ad.addProducts("Toyota","Vehicle","Car",1,100000);
        ad.modifyProducts(4,"Toyota","Vehicle","ModelCars");
        //no such id of product exists so test case should fail
        assertEquals(true,  ad.modifyProducts(100,"Toyota","Vehicle","ModelCars"));
    }
}
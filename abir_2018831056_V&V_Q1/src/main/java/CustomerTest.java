import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void testSingleProduct() {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",2,100000);
        ad.addProducts("Toyota","Vehicle","Car",3,100000);
        ad.addProducts("Toyota","Vehicle","Car",4,100000);
        Customer cus=new Customer(1,"Abid","Sylhet","01398");

        //comparing added items to how many have been added to cart progrmatically
        assertEquals(true,cus.singleProduct(2));

    }
    @Test
    void testShowCart() {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",2,100000);
        ad.addProducts("Toyota","Vehicle","Car",3,100000);
        ad.addProducts("Toyota","Vehicle","Car",4,100000);
        Customer cus=new Customer(1,"Abid","Sylhet","01398");
        cus.addToCart(2);
        cus.addToCart(3);
        cus.addToCart(4);
        //comparing added items to how many have been added to cart progrmatically
        assertEquals(3,cus.showCart());

    }

    @Test
    void addToCart() {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",2,100000);
        ad.addProducts("Toyota","Vehicle","Car",3,100000);
        ad.addProducts("Toyota","Vehicle","Car",4,100000);
        Customer cus=new Customer(1,"Abid","Sylhet","01398");
        assertEquals(true,cus.addToCart(2));

    }
    @Test
    void makePayment() {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",2,100000);
        ad.addProducts("Toyota","Vehicle","Car",3,100000);
        ad.addProducts("Toyota","Vehicle","Car",4,100000);
        Customer cus=new Customer(1,"Abid","Sylhet","01398");
        assertEquals(true,cus.makePayment());

    }
    @Test
    void viewProducts() {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",2,100000);
        ad.addProducts("Toyota","Vehicle","Car",3,100000);
        ad.addProducts("Toyota","Vehicle","Car",4,100000);
        Customer cus=new Customer(1,"Abid","Sylhet","01398");
        assertEquals(3,cus.viewProducts().size());
    }
    @Test
    void testRemoveFromCart() {
        Admin ad=new Admin();
        ad.addProducts("Toyota","Vehicle","Car",2,100000);
        ad.addProducts("Toyota","Vehicle","Car",3,100000);
        ad.addProducts("Toyota","Vehicle","Car",4,100000);
        Customer cus=new Customer(1,"Abid","Sylhet","01398");
        cus.addToCart(2);
        cus.addToCart(3);
        cus.addToCart(4);

        assertEquals(true,cus.deleteFromCart(2));
    }
}
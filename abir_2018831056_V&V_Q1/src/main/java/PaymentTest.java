import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    @Test
    void makePayment() {
        Customer cus=new Customer(1,"Abid","Sylhet","013038");
        assertEquals(true,cus.makePayment());
        Payment pay=new Payment();
        //will pass because one customer has id 1
       assertEquals(true,pay.makePayment(1));



    }
    @Test
    void makePayment1() {

        Payment pay=new Payment();
        //will fails because no customer has id 2
        assertEquals(true,pay.makePayment(1));



    }
}
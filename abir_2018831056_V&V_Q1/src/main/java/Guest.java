import java.util.List;

public class Guest {
    public List<Products> viewProducts()
    {
        return Admin.productsList;
    }
    public boolean getRegistered(String name,String address,String phone,int id){

        Customer customer=new Customer(id,name,address,phone);
        return true;

    }
}

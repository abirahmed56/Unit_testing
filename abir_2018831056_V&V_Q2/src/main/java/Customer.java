import java.util.List;

public class Customer {
    int id;
    String name;
    float price=0;
    String address;
    String phoneNumber;
    Cart cart;
    public Customer()
    {}

    public Customer(int id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        cart=new Cart();
    }
    public List<Products> viewProducts()
    {
        return Admin.productsList;
    }
    public boolean singleProduct(int id)
    {
        for(int i=0;i<Admin.productsList.size();i++)
        {
            if(id==Admin.productsList.get(i).getId())
            {
                cart.addToCart(Admin.productsList.get(i));
                price+=Admin.productsList.get(i).getPrice();
                return true;
            }
        }
        return false;

    }
    public int showCart()
    {
        List<Products> list=cart.getCartList();
        return list.size();
    }
    public boolean addToCart(int id)
    {
        Products pd;
        for(int i=0;i<Admin.productsList.size();i++)
        {
            if(id==Admin.productsList.get(i).getId())
            {
            cart.addToCart(Admin.productsList.get(i));
            price+=Admin.productsList.get(i).getPrice();
            return true;
            }
        }
        return false;
    }

    public boolean deleteFromCart(int id)
    {
        return cart.removeFromCart(id);
    }

}

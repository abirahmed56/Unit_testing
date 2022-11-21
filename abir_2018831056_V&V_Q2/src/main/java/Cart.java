import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Products> cartList=new ArrayList<>();
    int id;
    int numOfProducts;

    public List<Products> getCartList() {
        return cartList;
    }

    public boolean removeFromCart(int id)
    {
        for(int i=0;i<cartList.size();i++)
        {
            if(id==cartList.get(i).id) {

                cartList.remove(cartList.get(i));
                return true;
            }
        }
        return false;
    }
    float total;
    public void addToCart(Products product)
    {
        cartList.add(product);
        total+=product.getPrice();
        numOfProducts++;
    }
}

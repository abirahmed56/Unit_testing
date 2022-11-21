import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Products {
    String name;
    float price;
    String group;
public  Products()
{}
    public boolean returnProduct(int id)
    {
        for(int i=0;i<Admin.productsList.size();i++)
        {
            if(id==Admin.productsList.get(i).getId())
            {
                System.out.println("The name of the product is:"+Admin.productsList.get(i));
                return true;
            }
        }
        return false;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Products(String name, String group, String subGroup, int id, float price) {
        this.name = name;
        this.group = group;
        this.subGroup = subGroup;
        this.id = id;


    }

    String subGroup;
    int id;



    public void setName(String name) {
        this.name = name;
    }



    public void setGroup(String group) {
        this.group = group;
    }


    public void setSubGroup(String subGroup) {
        this.subGroup = subGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     public List<Products> viewProducts()
     {
         return Admin.productsList;
     }
}

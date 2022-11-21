import java.util.ArrayList;
import java.util.List;

public class Admin {
    int totalProducts=0;
    String name="Abir Ahmed";
    int id=1;
    static List<Products> productsList=new ArrayList<>();
    List<Products> viewProducts(){

        return productsList;
    }
      boolean addProducts(String name,String group,String subGroup,int id,float price)
      {
         for(int i=0;i<productsList.size();i++)
         {
             if(id==productsList.get(i).id) {
                 System.out.println(id);
                 return false;
             }
         }
          Products products=new Products(name,group,subGroup,id,price);
          productsList.add(products);
          totalProducts++;
                  return true;
      }
      public int returnTotalProducts()
      {
          return totalProducts;
      }
      boolean deleteProducts(int id)
      {
          for(int i=0;i<productsList.size();i++)
          {
              if(id==productsList.get(i).id) {
                  productsList.remove(productsList.get(i));
                  totalProducts--;
                  return true;
              }
          }
          return false;
      }
    boolean modifyProducts(int id,String name,String group, String subGroup)
    {
        for(int i=0;i<productsList.size();i++)
        {
            if(id==productsList.get(i).id) {

                productsList.get(i).setName(name);
                productsList.get(i).setGroup(group);
                productsList.get(i).setSubGroup(subGroup);
                return true;
            }
        }
        return false;
    }

}

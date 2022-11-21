public class Payment {
    int cusId;
    String name;
    float price;
    String cardName;
    String cardNum;
      Payment(){}
    public Payment(int cusId, String name, float price, String cardName, String cardNum) {


        this.cusId = cusId;
        this.name = name;
        this.price = price;
        this.cardName = cardName;
        this.cardNum = cardNum;
    }
    public boolean makePayment(int id)
    {
        for(int i=0;i<Customer.customers.size();i++)
        {
            if(id==Customer.customers.get(i))
            {
                return true;
            }
        }
        return false;
    }
}

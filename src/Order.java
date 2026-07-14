import java.util.Arrays;

public class Order {
    public String customer;
    public Product[] basket;
    public int count = 0;

    public Order (String customer, int orders){
        this.customer = customer;
        this.basket = new Product[orders];
    }

    public void addProduct(Product newProduct) {
        if(count<basket.length) {
            basket[count] = newProduct;
            count++;
        }
    }

    @Override
    public String toString(){

        return "В корзине покупателя " + customer + " находятся - " + Arrays.toString(basket) + ". ";


    }

    public void printOrders() {
        System.out.println(Arrays.toString(basket));
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) {
            return false;
        }
        Order order = (Order) object;
        return customer == order.customer && Arrays.equals(basket, order.basket);
    }


}

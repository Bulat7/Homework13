import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Product pixel7 = new Product(1, "Google Pixel 7", 30000, "phone");
        Product pixel7copy = new Product(1, "Google Pixel 7", 30000, "phone");
        Product pixel8 = new Product(2, "Google Pxel 8", 35000, "phone");
        Product pixelBuds = new Product(3, "Pixel Buds ", 10000, "headphones");
        Product pixelWatch = new Product(4, "Google Pixel Watch", 15000, "smart watch");

        System.out.println(pixel7);
        System.out.println(pixel8);
        System.out.println(pixelBuds);
        System.out.println(pixelWatch);

        System.out.println(pixel7.equals(pixel7copy));
        System.out.println(pixel7.equals(pixel8));
        System.out.println(pixelBuds.equals(pixelWatch));

        Order firstOrder = new Order("Aleks", 1);
        firstOrder.addProduct(pixel7);

        Order secondOrder = new Order("Anna", 1);
        secondOrder.addProduct(pixelBuds);

        Order therdOrder = new Order("Anna", 1);
        therdOrder.addProduct(pixelBuds);

        System.out.println(firstOrder);
        System.out.println(secondOrder);

        System.out.println(firstOrder.equals(secondOrder));
        System.out.println(secondOrder.equals(therdOrder));


    }


}

class Product {
    public int id;
    public String name;
    public int price;
    public String category;


    public Product (int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Товар [артикул = " + id + ", название = " + name + ", цена = " + price + ", категория = " + category + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return id == product.id && Objects.equals(category, product.category);
    }


}

class Order {
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

        return "В корзине покупателя " + customer + " находятся -" + Arrays.toString(basket) + ".";


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
        return Objects.equals(customer, order.customer) && basketEqual(this.basket, order.basket);
    }

    public boolean basketEqual(Product[] basket1, Product[] basket2) {
        if(basket1==basket2) return true;
        if(basket1 == null || basket2 == null) return false;
        if(basket1.length != basket2.length) return false;

        for (int i = 0; i <basket1.length; i++) {
            Product p1 = basket1[i];
            Product p2 = basket2[i];

            if (p1==null) {
                if (p2 != null) return false;
            } else if (!p1.equals(p2)) {
                return false;
            }
        }
        return true;
    }


}






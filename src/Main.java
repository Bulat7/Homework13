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

        System.out.println(firstOrder);
        System.out.println(secondOrder);

        System.out.println(firstOrder.equals(secondOrder));
    }
}



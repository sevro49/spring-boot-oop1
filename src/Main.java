public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Kahve makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("phillips Kahve makinesi");
        product2.setDiscount(5);
        product2.setUnitPrice(6500);
        product2.setUnitInStock(3);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("xyz  makinesi");
        product3.setDiscount(8);
        product3.setUnitPrice(7900);
        product3.setUnitInStock(8);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }

    }
}

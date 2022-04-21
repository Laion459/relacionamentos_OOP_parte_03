package orientada.a.objetos;

import java.util.Arrays;

public class Request {
    private String products[];

    public Request(String[] products) {
        this.products = products;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Request{" +
                "products=" + Arrays.toString(products) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Request)) return false;
        Request request = (Request) o;
        return Arrays.equals(getProducts(), request.getProducts());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getProducts());
    }
}

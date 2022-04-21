package orientada.a.objetos;

import java.util.Arrays;

public class Purchase {
    private Request[] requests;
    private Float amount;
    private Payment[] payments;

    public Purchase(Request[] requests, Float amount, Payment[] payments) {
        this.requests = requests;
        this.amount = amount;
        this.payments = payments;
    }

    public Request[] getRequests() {
        return requests;
    }

    public void setRequests(Request[] requests) {
        this.requests = requests;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Payment[] getPayments() {
        return payments;
    }

    public void setPayments(Payment[] payments) {
        this.payments = payments;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "requests=" + Arrays.toString(requests) +
                ", amount=" + amount +
                ", payments=" + Arrays.toString(payments) +
                '}';
    }

    // Métodos Públicos

    public void markePurchase(){

    }
}

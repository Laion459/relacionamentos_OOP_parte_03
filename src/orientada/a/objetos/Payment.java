package orientada.a.objetos;

import java.util.Objects;

public class Payment {
    // pagamento

    private String paymentType;
    private Float value;

    public Payment(String paymentType, Float value) {
        this.paymentType = paymentType;
        this.value = value;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentType='" + paymentType + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;
        Payment payment = (Payment) o;
        return Objects.equals(getPaymentType(), payment.getPaymentType()) && Objects.equals(getValue(), payment.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPaymentType(), getValue());
    }
}

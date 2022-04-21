package orientada.a.objetos;

import java.util.Objects;

public class CustumerFile {
    private Client client;
    private Purchase purchase;

    public CustumerFile(Client client, Purchase purchase) {
        this.client = client;
        this.purchase = purchase;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        return "CustumerFile{" +
                "client=" + client +
                ", purchase=" + purchase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustumerFile)) return false;
        CustumerFile that = (CustumerFile) o;
        return Objects.equals(getClient(), that.getClient()) && Objects.equals(getPurchase(), that.getPurchase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClient(), getPurchase());
    }
}

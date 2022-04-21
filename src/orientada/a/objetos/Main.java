package orientada.a.objetos;

public class Main {

    public static void main(String[] args) {
        System.out.println("3)  Composição (TODO-PARTE FORTE): ");

        String[] products = {"pão","suco","leite"};


        Client client = new Client("001");
        Client client1 = new Client("002");

        Request request = new Request(products);
        Request request1 = new Request(products);
        Request[] requests = {request,request1};

        Payment payment = new Payment("Débito - a Vista",999f);
        Payment payment1 = new Payment("Credito - parcelado", 0009f);
        Payment[] payments = {payment,payment1};

        Purchase purchase = new Purchase(requests,20f, payments);

        CustumerFile custumerFile = new CustumerFile(client,purchase);
        System.out.println(custumerFile);
        System.out.println("######################");

        for (int i = 0; i < products.length; i++){
            System.out.println((i+1) + "° Produto array: " + products[i]);
        }
        System.out.println("Cliente 1: " + client);
        System.out.println("Cliente 2: " + client1);

    }
}

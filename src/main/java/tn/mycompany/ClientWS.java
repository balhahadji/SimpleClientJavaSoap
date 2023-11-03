package tn.mycompany;

import tn.mycompany.proxy.BanqueService;
import tn.mycompany.proxy.BanqueWs;
import tn.mycompany.proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWs().getBanqueServicePort();
        System.out.println(
                stub.convert(100)
        );
        Compte compte = stub.getCompte(1);
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
    }
}

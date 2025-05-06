package org.example.apppharmacie.sercices.imp;

import org.example.apppharmacie.entities.Produit;

import java.util.List;

public interface IProduit {
    Produit saveProduit(Produit produit);
    List<Produit> getProduits();
    void deleteProduit(long id);
    Produit UpdateProduit(long id,Produit produit);
    Produit getProduitById(long id);

}

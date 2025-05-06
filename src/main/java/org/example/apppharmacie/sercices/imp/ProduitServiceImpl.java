package org.example.apppharmacie.sercices.imp;

import lombok.AllArgsConstructor;
import org.example.apppharmacie.entities.Produit;
import org.example.apppharmacie.repositorie.ProduitRepositorie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProduitServiceImpl implements IProduit{
    private final ProduitRepositorie produitRepositorie;
    @Override
    public Produit saveProduit(Produit produit) {
        return produitRepositorie.save(produit);
    }

    @Override
    public List<Produit> getProduits() {
        return produitRepositorie.findAll();
    }

    @Override
    public void deleteProduit(long id) {
        produitRepositorie.deleteById(id);

    }

    @Override
    public Produit UpdateProduit(long id, Produit produit) {
        Produit existeProduit = produitRepositorie.findById(id)
                .orElseThrow(() -> new RuntimeException("Produit introuvable avec id: " + id));
        existeProduit.setDescription(produit.getDescription());
        existeProduit.setName(produit.getName());
        existeProduit.setPrice(produit.getPrice());
        existeProduit.setQuantiteStock(produit.getQuantiteStock());

        return produitRepositorie.save(existeProduit);
    }

    @Override
    public Produit getProduitById(long id) {
        return produitRepositorie.getById(id);
    }
    }












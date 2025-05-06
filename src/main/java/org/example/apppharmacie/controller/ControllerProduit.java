package org.example.apppharmacie.controller;

import lombok.AllArgsConstructor;
import org.example.apppharmacie.entities.Produit;
import org.example.apppharmacie.sercices.imp.ProduitServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class ControllerProduit {
    private final  ProduitServiceImpl produitService;
    @PostMapping("/produit")
    public Produit saveProduit(@RequestBody Produit produit) {
        return produitService.saveProduit(produit);
    }
    @GetMapping("/produits")
    public List<Produit> getProduits() {
        return produitService.getProduits();
    }
    @DeleteMapping("/{id}")
    public void deleteProduits(@PathVariable("id") Long id) {
        produitService.deleteProduit(id);
    }
    @GetMapping("/{id}")
    public Produit getProduitById(@PathVariable("id") Long id) {
        return produitService.getProduitById(id);
    }
    @PutMapping("produit/{id}")
    private Produit updateProduit(@PathVariable("id") Long id, @RequestBody Produit produit) {
        produit.setId(id);
       return produitService.UpdateProduit(id, produit);
    }

}

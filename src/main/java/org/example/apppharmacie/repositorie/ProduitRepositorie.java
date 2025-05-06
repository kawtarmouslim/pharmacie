package org.example.apppharmacie.repositorie;

import org.example.apppharmacie.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepositorie extends JpaRepository<Produit, Long> {
}

package repositories; // Définition du package repositories

import entities.Compte; // Importation de la classe Compte
import org.springframework.data.jpa.repository.JpaRepository; // Importation de l'interface JpaRepository de Spring Data JPA

// Définition de l'interface CompteRepository étendant JpaRepository pour la gestion des opérations de base sur les entités Compte
public interface CompteRepository extends JpaRepository<Compte, Long> {
}

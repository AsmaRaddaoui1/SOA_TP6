package entities; // Définition du package entities

import lombok.*; // Importation des annotations Lombok

import javax.persistence.GeneratedValue; // Importation de l'annotation pour la génération automatique de clé
import javax.persistence.GenerationType; // Importation de la stratégie de génération de clé

import java.util.Date; // Importation de la classe Date

@Getter // Annotation Lombok pour générer automatiquement les getters
@NoArgsConstructor // Annotation Lombok pour générer automatiquement un constructeur sans arguments
@AllArgsConstructor // Annotation Lombok pour générer automatiquement un constructeur avec tous les arguments
@Setter // Annotation Lombok pour générer automatiquement les setters
@ToString // Annotation Lombok pour générer automatiquement la méthode toString

// Définition de la classe Compte représentant un compte
public class Compte {

    @GeneratedValue(strategy = GenerationType.IDENTITY) // Annotation pour la génération automatique de l'ID
    long id; // Attribut représentant l'identifiant du compte

    double solde; // Attribut représentant le solde du compte

    Date dateCreation; // Attribut représentant la date de création du compte

    etatCompte etat; // Attribut représentant l'état du compte en utilisant l'énumération etatCompte

    typeCompte compte; // Attribut représentant le type de compte en utilisant l'énumération typeCompte

    // Méthodes générées par Lombok pour accéder et modifier les attributs

    // Méthodes pour accéder et modifier l'identifiant du compte
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // Méthodes pour accéder et modifier le solde du compte
    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    // Méthodes pour accéder et modifier la date de création du compte
    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    // Méthodes pour accéder et modifier l'état du compte
    public etatCompte getEtat() {
        return etat;
    }

    public void setEtat(etatCompte etat) {
        this.etat = etat;
    }

    // Méthodes pour accéder et modifier le type de compte
    public typeCompte getCompte() {
        return compte;
    }

    public void setCompte(typeCompte compte) {
        this.compte = compte;
    }
}

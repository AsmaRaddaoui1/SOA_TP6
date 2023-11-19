package repositories; // Définition du package repositories

import entities.Compte; // Importation de la classe Compte
import entities.etatCompte; // Importation de l'énumération etatCompte
import entities.typeCompte; // Importation de l'énumération typeCompte
import org.springframework.beans.factory.annotation.Autowired; // Importation d'annotations Spring
import org.springframework.boot.CommandLineRunner; // Interface pour exécuter des actions au démarrage
import org.springframework.boot.SpringApplication; // Pour démarrer l'application Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication; // Annotation pour la configuration automatique de Spring Boot
import org.springframework.context.annotation.Bean; // Annotation pour définir des beans

import java.util.Arrays; // Importation de la classe Arrays pour manipuler des tableaux
import java.util.Date; // Importation de la classe Date pour travailler avec des dates
import java.util.List; // Importation de la classe List pour manipuler des listes

@SpringBootApplication // Annotation pour indiquer que c'est une application Spring Boot
public class Application {

    @Autowired // Injection de dépendance pour le CompteRepository
    private CompteRepository compteRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // Démarrage de l'application Spring Boot
    }

    // Utilisation de l'annotation @Bean pour définir un CommandLineRunner
    @Bean
    public CommandLineRunner demo(CompteRepository compteRepository) {
        return (args) -> {
            // Ajout de comptes initiaux

            // Création de trois objets Compte avec des données initiales
            Compte compte1 = new Compte(0, 2500.0, new Date(), etatCompte.ACTIVE, typeCompte.EPARGNE);
            Compte compte2 = new Compte(1, 500.0, new Date(), etatCompte.ACTIVE, typeCompte.EPARGNE);
            Compte compte3 = new Compte(2, 1500.0, new Date(), etatCompte.ACTIVE, typeCompte.EPARGNE);

            // Enregistrement des comptes dans la base de données en utilisant le CompteRepository
            compteRepository.saveAll(Arrays.asList(compte1, compte2, compte3));

            // Affichage des soldes des comptes récupérés de la base de données
            List<Compte> comptes = compteRepository.findAll();
            for (Compte compte : comptes) {
                System.out.println("Solde du compte #" + compte.getId() + ": " + compte.getSolde());
            }
        };
    }
}

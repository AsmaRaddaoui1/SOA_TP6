package entities; // Package entities contenant l'énumération etatCompte

// Déclaration de l'énumération etatCompte représentant différents états d'un compte
public enum etatCompte {
    CREE, // Premier état possible d'un compte : CREE (créé)

    ACTIVE, // Deuxième état possible d'un compte : ACTIVE (actif)

    SUSPENDU, // Troisième état possible d'un compte : SUSPENDU (suspendu)

    BLOQUE; // Quatrième état possible d'un compte : BLOQUE (bloqué)
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

import java.util.Scanner;

/**
 *
 * @author HP
 */



public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Client client = new Client(1, "Chalhoub", "elio@mail.com");

        // On remplit le magasin avec trois produits
        Magasin magasin = new Magasin();
        magasin.ajouterProduit(new Produit(1, "Clavier", 45.0, 2));
        magasin.ajouterProduit(new Produit(2, "Souris", 20.0, 1));
        magasin.ajouterProduit(new Produit(3, "Ecran", 150.0, 1));

        Panier panier = new Panier();   // panier vide au depart

        int choix = 0;
        int idCommande = 1;

        // La boucle fait revenir le menu tant que l'utilisateur ne tape pas 5
        while (choix != 5) {

            System.out.println("\n--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");

            choix = sc.nextInt();
            sc.nextLine();   // vide le retour a la ligne laisse par nextInt

            if (choix == 1) {
                magasin.afficherProduitsDisponibles();

            } else if (choix == 2) {
                System.out.print("Nom du produit : ");
                String nom = sc.nextLine();
                Produit p = magasin.trouverProduitParNom(nom);
                // On verifie toujours avant d'utiliser sinon le programme plante
                if (p != null) {
                    panier.ajouterProduit(p);
                } else {
                    System.out.println("Produit introuvable");
                }

            } else if (choix == 3) {
                panier.afficherPanier();
                System.out.println("Total : " + panier.calculerTotal() + " euros");

            } else if (choix == 4) {
                Commande commande = new Commande(idCommande, client, panier);
                commande.afficherDetailsCommande();
                idCommande++;   // le numero augmente pour la commande suivante

            } else if (choix == 5) {
                System.out.println("Au revoir");

            } else {
                // Securite si l'utilisateur tape un chiffre qui n'existe pas
                System.out.println("Choix invalide");
            }
        }

        sc.close();   // on ferme le Scanner a la fin du programme
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

import java.util.ArrayList;


public class Commande {
    
    private int idCommande;
    private Client client;
    private ArrayList<Produit> produitsCommandes;
    private double total;
    
 public Commande(int idCommande, Client client, Panier panier) {
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = panier.getProduits();
        this.total = panier.calculerTotal();
    }
public void afficherDetailsCommande(){
    
    System.out.println("=== Commande numero " + idCommande + " ===");
    client.afficherDetails();
    System.out.println("--- Produits commandes ---");
        for (Produit p : produitsCommandes) {
            p.afficherDetails();
        }
        System.out.println("Total a payer : " + total + " euros");
    }


    
    
}



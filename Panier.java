/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gestionMagasin;
import java.util.ArrayList;    // Obligatoire pour utiliser ArrayList
/**
 *
 * @author HP
 */
public class Panier {
    
// ArrayList car on ne sait pas combien de produits a l avance
// Les chevrons disent que la liste accepte uniquement des Produit
    private ArrayList<Produit> produits;
    
public  Panier(){
    produits=new ArrayList<>();// Sans le new la liste vaut null et le programme plante au premier ajout
}

public void ajouterProduit(Produit produit){
    produits.add(produit);// add range le produit a la fin de la liste
    System.out.println(produit.getNom() + " a ete ajoute au panier");
}

public void supprimerProduit(Produit produit){
    produits.remove(produit);
    System.out.println(produit.getNom() + " a ete supprime du panier");
    
}

public void afficherPanier(){
    if (produits.isEmpty()) {
            System.out.println("Le panier est vide");
            return;
        }
    for (Produit p : produits){// for each : pour chaque Produit p dans la liste produits
        p.afficherDetails();
    }
}


public double calculerTotal() {
    double total = 0;
    for (Produit p : produits) {
        total = total + (p.getPrix() * p.getQuantite());
    }
    return total;
}

public ArrayList<Produit> getProduits() {// Getter utilise par la classe Commande pour recuperer les produits
    return produits;
}
}

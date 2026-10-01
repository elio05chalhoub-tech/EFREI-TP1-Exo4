/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gestionMagasin;
import java.util.ArrayList;    
/**
 *
 * @author HP
 */
public class Panier {
    
    private ArrayList<Produit> produits;
    
public  Panier(){
    produits=new ArrayList<>();
}

public void ajouterProduit(Produit produit){
    produits.add(produit);
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
    for (Produit p : produits){
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

public ArrayList<Produit> getProduits() {
    return produits;
}
}

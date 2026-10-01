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
public class Magasin {
    
    private ArrayList<Produit> produits;
 
    
public Magasin(){
    produits=new ArrayList<>();
    
}
public void ajouterProduit(Produit produit){
    
    produits.add(produit);
    
}

public void afficherProduitsDisponibles(){
    if (produits.isEmpty()){
        System.out.println("/Aucun produit disponible/");
    }
    for (Produit p: produits){
        p.afficherDetails();
    }
}

// Entre un String et sort un Produit
public Produit trouverProduitParNom(String nom){
    for (Produit p : produits) {
        if (p.getNom().equalsIgnoreCase(nom)) {
// equalsIgnoreCase ignore les majuscules donc clavier trouve Clavier
// equals serait trop strict et == comparerait les adresses memoire
             return p;     
        }
    }
    return null;  // Apres la boucle : aucun produit ne correspond
}



}

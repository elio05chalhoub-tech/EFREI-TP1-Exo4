/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *//
package gestionMagasin;

/**
 *
 * @author HP
 */
public class Produit {
    
    // Les attributs sont prives : personne ne peut y toucher depuis une autre classe
    private int id;
    private  String nom;
    private double prix;// double car un prix peut avoir des centimes
    private int quantite;
    
// Constructeur : meme nom que la classe et aucun type de retour
// this.nom designe l attribut et nom tout seul designe le parametre
public Produit(int id, String nom, double prix, int quantite){
    
    this.id=id;
    this.nom=nom;
    this.prix=prix;
    this.quantite=quantite;
    
}
    
// Getters : permettent de lire un attribut prive depuis l exterieur
public int getId(){
    return this.id;
}

public String getNom(){
    return this.nom;
}

public double getPrix(){
    return this.prix;
}

public int getQuantite(){
    return this.quantite;
}
    
// Setters : permettent de modifier un attribut prive
public void setId(int id){
    this.id=id;
}

public void setNom(String nom){
    this.nom=nom;
}

public void setPrix(double prix){
    this.prix=prix;
    
}

public void setQuantite(int quantite){
    this.quantite=quantite;
}
    
// void car la methode affiche mais ne renvoie aucune valeur
public void afficherDetails(){
    System.out.println("Id : " + id + "\n Name : "+ nom + "\n Price : " + prix + "\n Quantity : " + quantite);
}

}

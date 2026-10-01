/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author HP
 */
public class Produit {
    
    private int id;
    private  String nom;
    private double prix;
    private int quantite;
    

public Produit(int id, String nom, double prix, int quantite){
    
    this.id=id;
    this.nom=nom;
    this.prix=prix;
    this.quantite=quantite;
    
}

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

public void afficherDetails(){
    System.out.println("Id : " + id + "\n Name : "+ nom + "\n Price : " + prix + "\n Quantity : " + quantite);
}

}

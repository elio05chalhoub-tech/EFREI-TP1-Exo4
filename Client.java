/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author HP
 */
public class Client {
    private int id;
    private String nom;
    private String email;
    
public Client(int id, String nom, String email){
    
    this.id=id;
    this.nom=nom;
    this.email=email;
   
    
}

public int getId(){
    return this.id;
}

public String getNom(){
    return this.nom;
}

public String getEmail(){
    return this.email;
}

public void setId(int id){
    this.id=id;
}

public void setNom(String nom){
    this.nom=nom;
}

public void setEmail(String email){
    this.email=email;
    
}


public void afficherDetails(){
    System.out.println("Id : " + id + "\n Name : "+ nom + "\n Email : " + email );
}




}

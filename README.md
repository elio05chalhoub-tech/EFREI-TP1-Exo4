[README (1).md](https://github.com/user-attachments/files/32896481/README.1.md)
# TP1 – Exercice 4 : Gestion de Magasin en Java

**Elio CHALHOUB** – Programmation Orientée Objet – EFREI – 01/10/2026

> **Message pour Madame**
>1
> Bonjour Madame, je suis désolé de ne pas avoir mis toutes les options dans le rapport. On ne m'a pas laissé entrer dans le bâtiment à cause d'un problème à l'accueil, et je devais rendre le travail à temps. J'explique donc ici les fonctionnalités qui ne sont pas dans le rapport. Merci de votre compréhension.

## Présentation

Programme console qui simule un magasin en ligne : voir les produits, remplir son panier et passer une commande.

## Les classes (package `gestionMagasin`)

| Classe | Rôle et méthodes principales |
|---|---|
| `Produit` | id, nom, prix, quantité en `private`, avec constructeur, getters/setters et `afficherDetails()` |
| `Client` | id, nom, email, avec constructeur, getters/setters et `afficherDetails()` |
| `Panier` | ArrayList de produits : `ajouterProduit()`, `supprimerProduit()`, `afficherPanier()`, `calculerTotal()` (prix × quantité) |
| `Commande` | Récupère le client, les produits du panier et le total, puis les affiche avec `afficherDetailsCommande()` |
| `Magasin` | ArrayList du stock : `ajouterProduit()`, `afficherProduitsDisponibles()`, `trouverProduitParNom()` |
| `Main` | Crée le client, le magasin (Clavier, Souris, Ecran) et le panier, puis affiche le menu en boucle |

**Points importants :**
- `trouverProduitParNom()` utilise `equalsIgnoreCase()`, donc « clavier » trouve « Clavier ».
- Après `nextInt()`, un `sc.nextLine()` évite que la saisie du nom du produit soit sautée.
- Le numéro de commande augmente de 1 à chaque nouvelle commande.


!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

## Cas particuliers

| Situation | Résultat |
|---|---|
| Produit absent du magasin | « Produit introuvable » |
| Panier vide | « Le panier est vide », total 0.0 € |
| Commande avec panier vide | Commande sans produit, total 0.0 € |
| Numéro hors menu | « Choix invalide » |
| Lettre au lieu d'un chiffre | Le programme plante (InputMismatchException) |



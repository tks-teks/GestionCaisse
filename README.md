
# Gestion de Caisse et de Banque

Ce projet est une application Java de gestion de caisses et de banques. 
Il permet aux utilisateurs d'ajouter, supprimer et gérer des caisses et des banques, ainsi que d'enregistrer des transactions d'entrée et de sortie d'argent. 
L'application inclut également des fonctionnalités pour annuler les transactions récentes.

## Fonctionnalités

- **Gestion des Caisses** :
  - Ajouter une nouvelle caisse
  - Supprimer une caisse existante
  - Enregistrer les entrées et sorties d'argent
  - Afficher le solde d'une caisse
  - Annuler la dernière transaction d'une caisse

- **Gestion des Banques** :
  - Ajouter une nouvelle banque
  - Supprimer une banque existante

- **Virements** :
  - Réaliser des virements entre caisses
  

## Prérequis

- Java Development Kit (JDK) 8 ou supérieur
- Un éditeur de texte ou un IDE

## Installation

1. Clonez le dépôt :

   ```bash
   git clone https://github.com/Tsiemi-eude/gestioncaisse.git
   cd gestioncaisse 
2. Compilez les fichiers Java :

    ```bash
     javac Caisse.java Gestion.java Banque.java GestionCaisse.java
   

3. Exécutez le programme :

   ```bash
   java GestionCaisse
   
## Utilisation

Après avoir démarré le programme, un menu apparaîtra avec les options disponibles :

1. Ajouter une caisse
2. Ajouter une banque
3. Associer une caisse a une banque
4. Supprimer une caisse
5. Supprimer une banque
6. Liste des Caisses et Responsables
7. Liste des Banques et leurs Caisses
8. Enregistrer une entrée d'argent
9. Enregistrer une sortie d'argent
10. Réaliser un virement entre caisses
11. Afficher le solde d'une caisse
12. Annuler la dernière transaction d'une caisse
13. Quitter

Pour effectuer une action, saisissez le numéro correspondant à l'option 

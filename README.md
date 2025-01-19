
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
3. Supprimer une caisse
4. Supprimer une banque
5. Enregistrer une entrée d'argent
6. Enregistrer une sortie d'argent
7. Réaliser un virement entre caisses
8. Afficher le solde d'une caisse
9. Annuler la dernière transaction d'une caisse
10. Quitter

Pour effectuer une action, saisissez le numéro correspondant à l'option 

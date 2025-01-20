/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestioncaisse;

import java.util.Scanner;
import com.mycompany.gestioncaisse.*;
/**
 *
 * @author hp
 */




public class GestionCaisse {
    private static Gestion gestionCaisse = new Gestion();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("**************");
            System.out.println("*=== Menu ===*");
            System.out.println("**************");
            System.out.println("1. Ajouter une caisse");
            System.out.println("2. Ajouter une banque");
            System.out.println("3. Associer une caisse a une banque");
            System.out.println("4. Supprimer une caisse");
            System.out.println("5. Supprimer une banque");
            System.out.println("6. Liste des Caisses et Responsables");
            System.out.println("7. Liste des Banques et leurs Caisses");
            System.out.println("8. Enregistrer une entree d'argent");
            System.out.println("9. Enregistrer une sortie d'argent");
            System.out.println("10. Realiser un virement entre caisses");
            System.out.println("11. Afficher le solde d'une caisse");
            System.out.println("12. Annuler la derniere transaction d'une caisse");
            System.out.println("13. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    System.out.print("Nom de la caisse : ");
                    String nomCaisse = scanner.nextLine();
                    System.out.print("Responsable de la caisse : ");
                    String responsable = scanner.nextLine();
                    gestionCaisse.ajouterCaisse(nomCaisse, responsable);
                    break;
                case 2:
                    System.out.print("Nom de la banque : ");
                    String nomBanque = scanner.nextLine();
                    gestionCaisse.ajouterBanque(nomBanque);
                    break;
                case 3:
                    System.out.print("Nom de la banque : ");
                    String nomBanqueAssoc = scanner.nextLine();
                    System.out.print("Nom de la caisse à associer : ");
                    String nomCaisseAssoc = scanner.nextLine();
                    gestionCaisse.ajouterCaisseABanque(nomBanqueAssoc, nomCaisseAssoc);;
                    break;
                case 4:
                    System.out.print("Nom de la caisse à supprimer : ");
                    String caisseASupprimer = scanner.nextLine();
                    gestionCaisse.supprimerCaisse(caisseASupprimer);
                    break;
                case 5:
                    System.out.print("Nom de la banque à supprimer : ");
                    String banqueASupprimer = scanner.nextLine();
                    gestionCaisse.supprimerBanque(banqueASupprimer);
                    break;
                case 6:
                    gestionCaisse.listerCaisses();
                    break;
                case 7:
                    gestionCaisse.listerBanquesEtCaisses();
                    break;
                case 8:
                    System.out.print("Nom de la caisse : ");
                    String caisseEntrerNom = scanner.nextLine();
                    Caisse caisseEntrer = gestionCaisse.trouverCaisse(caisseEntrerNom);
                    if (caisseEntrer != null) {
                        System.out.print("Montant à entrer : ");
                        double montantEntrer = scanner.nextDouble();
                        caisseEntrer.entrerArgent(montantEntrer);
                    } else {
                        System.out.println("Caisse non trouvée.");
                    }
                    break;
                case 9:
                    System.out.print("Nom de la caisse : ");
                    String caisseSortirNom = scanner.nextLine();
                    Caisse caisseSortir = gestionCaisse.trouverCaisse(caisseSortirNom);
                    if (caisseSortir != null) {
                        System.out.print("Montant à sortir : ");
                        double montantSortir = scanner.nextDouble();
                        caisseSortir.sortirArgent(montantSortir);
                    } else {
                        System.out.println("Caisse non trouvée.");
                    }
                    break;
                case 10:
                    System.out.print("Nom de la caisse source : ");
                    String caisseSourceNom = scanner.nextLine();
                    Caisse caisseSource = gestionCaisse.trouverCaisse(caisseSourceNom);
                    System.out.print("Nom de la caisse destination : ");
                    String caisseDestinationNom = scanner.nextLine();
                    Caisse caisseDestination = gestionCaisse.trouverCaisse(caisseDestinationNom);
                    if (caisseSource != null && caisseDestination != null) {
                        System.out.print("Montant à transférer : ");
                        double montantVirement = scanner.nextDouble();
                        gestionCaisse.virementCaisseVersCaisse(caisseSource, caisseDestination, montantVirement);
                    } else {
                        System.out.println("Caisses non trouvées.");
                    }
                    break;
                case 11:
                    System.out.print("Nom de la caisse : ");
                    String caisseSoldeNom = scanner.nextLine();
                    Caisse caisseSolde = gestionCaisse.trouverCaisse(caisseSoldeNom);
                    if (caisseSolde != null) {
                        System.out.println("Le solde de la caisse " + caisseSolde.getNom() + " est : " + caisseSolde.getSolde());
                    } else {
                        System.out.println("Caisse non trouvée.");
                    }
                    break;
                case 12:
                    System.out.print("Nom de la caisse : ");
                    String caisseAnnulerNom = scanner.nextLine();
                    Caisse caisseAnnuler = gestionCaisse.trouverCaisse(caisseAnnulerNom);
                    if (caisseAnnuler != null) {
                        caisseAnnuler.annulerDernièreTransaction();
                    } else {
                        System.out.println("Caisse non trouvée.");
                    }
                    break;
                case 13:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
                    break;
            }
        }
    }
}

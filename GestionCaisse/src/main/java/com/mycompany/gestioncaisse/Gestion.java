/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioncaisse;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.List;

public class Gestion {
    private List<Caisse> caisses = new ArrayList<>();
    private List<Banque> banques = new ArrayList<>();

    // Ajouter une caisse
    public void ajouterCaisse(String nom, String responsable) {
        caisses.add(new Caisse(nom, responsable));
        System.out.println("Caisse : " + nom + " ajoutee avec succès.");
    }

    // Ajouter une banque
    public void ajouterBanque(String nom) {
        banques.add(new Banque(nom));
        System.out.println("Banque : " + nom + " ajoutee avec succès.");
    }

    // Associer une caisse à une banque
    public void ajouterCaisseABanque(String nomBanque, String nomCaisse) {
        Banque banque = trouverBanque(nomBanque);
        Caisse caisse = trouverCaisse(nomCaisse);

        if (banque != null && caisse != null) {
            banque.ajouterCaisse(caisse);
            System.out.println("Caisse " + nomCaisse + " associee à la banque " + nomBanque + ".");
        } else {
            if (banque == null) {
                System.out.println("Banque " + nomBanque + " introuvable.");
            }
            if (caisse == null) {
                System.out.println("Caisse " + nomCaisse + " introuvable.");
            }
        }
    }

    public void supprimerCaisse(String nom) {
        Caisse caisseASupprimer = trouverCaisse(nom);
        if (caisseASupprimer != null) {
            caisses.remove(caisseASupprimer);
            System.out.println("Caisse " + nom + " supprimée avec succes.");
        } else {
            System.out.println("Caisse " + nom + " non trouvee.");
        }
    }

    // Supprimer une banque
    public void supprimerBanque(String nom) {
        Banque banqueASupprimer = trouverBanque(nom);
        if (banqueASupprimer != null) {
            banques.remove(banqueASupprimer);
            System.out.println("Banque " + nom + " supprimee avec succes.");
        } else {
            System.out.println("Banque " + nom + " non trouvee.");
        }
    }

    public void listerCaisses() {
        if (caisses.isEmpty()) {
            System.out.println("Aucune caisse disponible.");
        } else {
            System.out.println("Liste des caisses et leurs responsables :");
            for (Caisse caisse : caisses) {
                System.out.println("- Caisse : " + caisse.getNom() + " | Responsable : " + caisse.getResponsable() + " | Solde : " + caisse.getSolde());
            }
        }
    }

    // Lister les banques et leurs caisses associées
    public void listerBanquesEtCaisses() {
        if (banques.isEmpty()) {
            System.out.println("Aucune banque disponible.");
        } else {
            System.out.println("Liste des banques et leurs caisses associees :");
            for (Banque banque : banques) {
                System.out.println("- Banque : " + banque.getNom());
                if (banque.getCaissesAssociees().isEmpty()) {
                    System.out.println("  Aucun caisse associee à cette banque.");
                } else {
                    for (Caisse caisse : banque.getCaissesAssociees()) {
                        System.out.println("  - Caisse : " + caisse.getNom() + " | Responsable : " + caisse.getResponsable());
                    }
                }
            }
        }
    }

    // Trouver une caisse par son nom
    public Caisse trouverCaisse(String nom) {
        for (Caisse caisse : caisses) {
            if (caisse.getNom().equalsIgnoreCase(nom)) {
                return caisse;
            }
        }
        return null;
    }

    // Trouver une banque par son nom
    public Banque trouverBanque(String nom) {
        for (Banque banque : banques) {
            if (banque.getNom().equalsIgnoreCase(nom)) {
                return banque;
            }
        }
        return null;
    }
    
        public void virementCaisseVersCaisse(Caisse source, Caisse destination, double montant) {
        if (source.getSolde() >= montant) {
            source.sortirArgent(montant);
            destination.entrerArgent(montant);
            System.out.println("Virement de " + montant + " de " + source.getNom() + " a " + destination.getNom()+"effectuer avec succes");
        } else {
            System.out.println("Fonds insuffisants pour le virement.");
        }
    }

}

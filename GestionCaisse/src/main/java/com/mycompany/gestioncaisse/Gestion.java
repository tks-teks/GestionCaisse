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

    public void ajouterCaisse(String nom, String responsable) {
        caisses.add(new Caisse(nom, responsable));
        System.out.println("Caisse " + nom + " ajoutee avec succes.");
    }

    public void ajouterBanque(String nom) {
        banques.add(new Banque(nom));
        System.out.println("Banque " + nom + " ajoutee avec succes.");
    }

    public void supprimerCaisse(String nom) {
        Caisse caisseASupprimer = trouverCaisse(nom);
        if (caisseASupprimer != null) {
            caisses.remove(caisseASupprimer);
            System.out.println("Caisse " + nom + " supprimee avec succes");
        } else {
            System.out.println("Caisse non trouvee.");
        }
    }

    public void supprimerBanque(String nom) {
        Banque banqueASupprimer = trouverBanque(nom);
        if (banqueASupprimer != null) {
            banques.remove(banqueASupprimer);
            System.out.println("Banque " + nom + " supprimee avec succes.");
        } else {
            System.out.println("Banque non trouvee.");
        }
    }

    public void virementCaisseVersCaisse(Caisse source, Caisse destination, double montant) {
        if (source.getSolde() >= montant) {
            source.sortirArgent(montant);
            destination.entrerArgent(montant);
            System.out.println("Virement de " + montant + " de " + source.getNom() + " à " + destination.getNom()+"effectuer avec succes");
        } else {
            System.out.println("Fonds insuffisants pour le virement.");
        }
    }

    public Caisse trouverCaisse(String nom) {
        for (Caisse caisse : caisses) {
            if (caisse.getNom().equalsIgnoreCase(nom)) {
                return caisse;
            }
        }
        return null;
    }

    public Banque trouverBanque(String nom) {
        for (Banque banque : banques) {
            if (banque.getNom().equalsIgnoreCase(nom)) {
                return banque;
            }
        }
        return null;
    }
}
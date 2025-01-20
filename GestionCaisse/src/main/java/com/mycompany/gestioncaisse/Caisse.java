/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioncaisse;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hp
 */


public class Caisse {
    private String nom;
    private String responsable;
    private double solde;
    private List<String> historiqueTransactions;

    public Caisse(String nom, String responsable) {
        this.nom = nom;
        this.responsable = responsable;
        this.solde = 0.0;
        this.historiqueTransactions = new ArrayList<>();
    }

    public void entrerArgent(double montant) {
        solde += montant;
        historiqueTransactions.add("Entrée : " + montant);
        System.out.println("Entree de " + montant + " dans la caisse " + nom);
    }

    public void sortirArgent(double montant) {
        if (montant <= solde) {
            solde -= montant;
            historiqueTransactions.add("Sortie : " + montant);
            System.out.println("Sortie de " + montant + " de la caisse " + nom);
        } else {
            System.out.println("Fonds insuffisants dans la caisse " + nom);
        }
    }

    public double getSolde() {
        return solde;
    }

    public String getNom() {
        return nom;
    }

    public String getResponsable() {
        return responsable;
    }

    public List<String> getHistoriqueTransactions() {
        return historiqueTransactions;
    }

    public void annulerDernièreTransaction() {
        if (!historiqueTransactions.isEmpty()) {
            String dernièreTransaction = historiqueTransactions.remove(historiqueTransactions.size() - 1);
            String[] parts = dernièreTransaction.split(" : ");
            String type = parts[0];
            double montant = Double.parseDouble(parts[1]);

            if (type.equals("Entrée")) {
                solde -= montant;
                System.out.println("Annulation de l'entree de " + montant + " dans la caisse " + nom);
            } else {
                solde += montant;
                System.out.println("Annulation de la sortie de " + montant + " de la caisse " + nom);
            }
        } else {
            System.out.println("Aucune transaction a annuler.");
        }
    }
}

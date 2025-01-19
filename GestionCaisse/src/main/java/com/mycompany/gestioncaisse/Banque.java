/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioncaisse;

/**
 *
 * @author hp
 */
public class Banque {
    private String nom;
    private double solde;

    public Banque(String nom) {
        this.nom = nom;
        this.solde = 0.0;
    }

    public void virerVersBanque(double montant) {
        solde += montant;
        System.out.println("Virement de " + montant + " vers la banque " + nom+"effectuer avec succes");
    }

    public double getSolde() {
        return solde;
    }

    public String getNom() {
        return nom;
    }

    public void annulerVirement(double montant) {
        solde -= montant;
        System.out.println("Annulation du virement de " + montant + " de la banque " + nom);
    }
}
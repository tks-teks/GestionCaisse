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
public class Banque {
    private String nom;
    private double solde;
    private List<Caisse> caissesAssociees = new ArrayList<>();

    public Banque(String nom) {
        this.nom = nom;
        this.solde = 0.0;
    }

    public void ajouterCaisse(Caisse caisse) {
        if (!caissesAssociees.contains(caisse)) {
            caissesAssociees.add(caisse);
            System.out.println("Caisse " + caisse.getNom() + " associee à la banque " + nom);
        } else {
            System.out.println("Cette caisse est deja associee à la banque " + nom);
        }
    }

    public List<Caisse> getCaissesAssociees() {
        return caissesAssociees;
    }

    public double getSolde() {
        return solde;
    }

    public String getNom() {
        return nom;
    }
}

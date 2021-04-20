package fr.cesi.ContactManager.domain;

import java.util.regex.Pattern;

/**
 * @author Adrien HAUTOT (adrien.hautot@erudo.fr)
 */
public class Contact {
    private String nom;
    private String prenom;
    private String telephone;

    public Contact(String nom, String prenom, String telephone) throws Exception {
        if (nom == null || nom.equals("") || prenom == null || prenom.equals("") || telephone == null || telephone.equals("")) {
            throw new Exception();
        }

        //^0\d{9}$|^33\d{9}$
        if (!Pattern.matches("^0\\d{9}$", telephone)) {
            throw new Exception();
        }

        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws Exception {
        if (nom == null || nom.equals("")) {
            throw new Exception();
        }
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) throws Exception {
        if (prenom == null || prenom.equals("")) {
            throw new Exception();
        }
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) throws Exception {
        if (telephone == null || telephone.equals("")) {
            throw new Exception();
        }
        if (!Pattern.matches("^0\\d{9}$", telephone)) {
            throw new Exception();
        }
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone=" + telephone +
                '}';
    }
}

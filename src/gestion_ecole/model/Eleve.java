package gestion_ecole.model;

import java.util.Date;
import java.util.Objects;

public class Eleve {
    String nom;
    String prenom;
    int age;
    Date dateNaissance;
    double poids;
    double taille;
    String observation;

    @Override
    public String toString() {
        return "Eleve{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", dateNaissance=" + dateNaissance +
                ", poids=" + poids +
                ", taille=" + taille +
                ", observation='" + observation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (!(o instanceof Eleve eleve))
            return false;

        return age == eleve.age && Double.compare(poids, eleve.poids) == 0 && Double.compare(taille, eleve.taille) == 0 && Objects.equals(nom, eleve.nom) && Objects.equals(prenom, eleve.prenom) && Objects.equals(dateNaissance, eleve.dateNaissance) && Objects.equals(observation, eleve.observation);
    }

    public Eleve(String nom, String prenom, int age, Date dateNaissance, double poids, double taille, String observation) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateNaissance = dateNaissance;
        this.poids = poids;
        this.taille = taille;
        this.observation = observation;
    }
}

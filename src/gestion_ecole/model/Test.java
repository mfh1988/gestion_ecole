package gestion_ecole.model;

import java.util.Date;

public class Test {

    public static boolean rechercheEleve(Eleve eleve,Eleve [] student){

        boolean res = false;

        for ( Eleve e : student){
            if(e.equals(eleve))
                res = true;
        }
        return res;
    }

    public static void main(String[] args) {

        Eleve eleves [] = new Eleve[3];
        System.out.println(eleves[0]);

        Eleve e1 = new Eleve("Hajjej","Med Fateh",35,new Date(1988,5,5),95,173,"Father");
        Eleve e2 = new Eleve("Nasro","Nasreddine",24,new Date(1999,3,10),60,178,"cours de soir");
        Eleve e3 = new Eleve("Hayouni","Dhafer",34,new Date(1989,1,20),100,178,"cours de soir");

        eleves[0]= e1;
        eleves[1]=e2;
        eleves[2]=e3;
        // All
        for ( Eleve e : eleves) {
            System.out.println(e.toString());
        }

        // Q9.a
        for ( Eleve e : eleves) {
            if (e.nom.startsWith(("haj")) || (e.nom.startsWith("Haj")))
            System.out.println(e.toString());
        }

        for ( Eleve e : eleves) {
            if (e.observation.contains(("Father")) || (e.observation.contains("cours")))
                System.out.println(e.toString());
        }

        Eleve temp = new Eleve("Hajjej","Med Fateh",35,new Date(1988,5,5),95,173,"Father");
        boolean exist = rechercheEleve(temp, eleves);
        if (exist == true)
            System.out.println("Eleve existe");

    }
}

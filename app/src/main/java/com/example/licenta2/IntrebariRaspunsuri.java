package com.example.licenta2;

public class IntrebariRaspunsuri {
    public static String intrebare[]={
      "Cum se numeste adminul acestui program?",
      "Care este facultatea la care studiaza Adminu?",
      "Care este prenumele adminului?",
      "Cata facultate mai am?"
    };

    public static String variante[][]={
            {"Rus", "Bobo","Crisotf","Unguru"},
            {"Fspac", "FSEGA", "Drept", "Sport"},
            {"Nelu", "Gligor", "Alina", "Ovidiu"},
            {"o zi", "o saptamana", "nu stiu", "nu are importanta"}
    };

    public static String raspunsuriCorecte[]={
            "Rus",
            "FSEGA",
            "Ovidiu",
            "o saptamana"
    };

    public static String raspunsComplet[]={
            "Numele complet este Rus Ovidiu",
            "Studiaza la Fsega din 2020-2023",
            "Adminul are doar un singur prenume",
            "codfisodmfiosdfonso"
    };

    public static String instructiuniAplicatie[]=
            {
              "RASPUNDE CORECT LA CAT MAI MULTE INTREBARI SI ADUNA PUNCTE." +
                      "FIECARE RASPUNS CORECT VALOREAZA UN PUNCT. DUPA FIECARE 3 RASPUNSURI CORECTE CONSECUTIVE VEI PRIMI UN BONUS." +
                      "AI LA DISPOZITIE 20 DE SECUNDE PENTRU A OFERII RASPUNSUL CORECT." +
                      "IN CAZUL IN CARE RASPUNZI GRESIT LA O INTREBARE SI DORESTI SA AFLI RASPUNSUL CORECT, TE VA COSTA 2 PUNCTE." +
                      "PENTRU A INTRA IN PROVOCARE TE VA COSTA 5 PUNCTE, DAR DACA VEI RASPUNDE CORECT VEI CASTIGA 15 PUNCTE ALTFEL VEI PIERDE CELE 5 PUNCTE"
            };

    public static String intrebareProvocare[]={
            "Provocare 1?",
            "Provocare 2?",
            "Provocare 3?",
            "Provocare 4?"
    };
    public static String varianteProvocare[][]={
            {"gsdfgdsfsd", "gsadsdasd","corect1","gresit"},
            {"corect2", "lmaskldin", "sdjeuia", "iiwhidbfusd"},
            {"Ndsfsdgu", "Glisdfsdf", "llkmfds", "corect3"},
            {"sdjngisd", "corect4", "cnedfuidwi", "sdiofusid"}
    };
    public static String raspunsuriCorecteProvocare[]={
            "corect1",
            "corect2",
            "corect3",
            "corect4"
    };
    public static String raspunsCompletProvocare[]={
            "Provocarea1",
            "Provocarea2",
            "Provocarea3",
            "Provocarea4"
    };

    public String intrebareAleatoare()
    {
        int index = (int)(Math.random()* intrebare.length);
        return intrebare[index];
    }

    public String raspunsCorectIntrebare(String intr)
    {
        for (int i =0; i<intrebare.length;i++)
        {
            if (intrebare[i].equals(intr))
                return raspunsuriCorecte[i];
        }
        return null;
    }
}

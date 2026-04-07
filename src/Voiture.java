public class Voiture {
    String marque;
    String modele;
    int annee;
    double prix;

    public Voiture(String marque, String modele, int annee, double prix){
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
    }

    public void afficherDescription(){

        System.out.println("Marque : " + this.marque);
        System.out.println("Modèle : " + this.modele);
        System.out.println("Age : " + calculAge());
        System.out.println("Prix : " + this.prix + "€");
    }

    public int calculAge(){
        int age = 2026 - this.annee;
        return age;
    }

    public void appliquerReduction(double pourcentage){
        this.prix = this.prix - this.prix * (pourcentage * 0.01);
    }
}

public class Produit {
    // 1. Les attributs (Les données)
    String nom;
    double prix;
    int stock;

    // 2. Le Constructeur (Le moule)
    public Produit(String nom, double prix, int stock) {
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
    }
    // 3. La méthode de vente (L'intelligence)
    public void vendre(int quantiteAchetee) {
        if (this.stock >= quantiteAchetee) {
            this.stock -= quantiteAchetee;
            System.out.println("Vente confirmée ! Nouveau stock : " + this.stock);
        } else {
            System.out.println("Erreur : Stock insuffisant pour " + this.nom);
        }
    }
}
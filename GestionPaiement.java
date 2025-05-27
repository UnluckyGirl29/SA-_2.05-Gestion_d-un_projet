import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GestionPaiements {
    private Map<String, Paiement> paiements = new HashMap<>();

    public void ajouterPaiement(Paiement paiement) {
        paiements.put(paiement.getId(), paiement);
    }

    public void modifierDatePaiement(String id, LocalDate nouvelleDate) {
        Paiement p = paiements.get(id);
        if (p != null) p.setDatePaiement(nouvelleDate);
    }


    public void supprimerDatePaiement(String id) {
        Paiement p = paiements.get(id);
        if (p != null) p.setDatePaiement(null);
    }

    public void modifierMontant(String id, double nouveauMontant) {
        Paiement p = paiements.get(id);
        if (p != null) p.setMontant(nouveauMontant);
    }

    public void supprimerMontant(String id) {
        Paiement p = paiements.get(id);
        if (p != null) p.setMontant(0.0);
    }

    public void modifierMembre(String id, String nouveauMembre) {
        Paiement p = paiements.get(id);
        if (p != null) p.setMembre(nouveauMembre);
    }

    public void supprimerMembre(String id) {
        Paiement p = paiements.get(id);
        if (p != null) p.setMembre(null);
    }

    public void genererFactures() {
        System.out.println("=== Factures Générées ===");
        for (Paiement p : paiements.values()) {
            System.out.println(p);
        }
    }
}

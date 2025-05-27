import java.util.*;
import java.time.*;

public class Paiement {
    private LocalDate datePaiement;
    private double montant;
    private String membre;
    private String id;

    public Paiement(String id, LocalDate datePaiement, double montant, String membre) {
        this.id = id;
        this.datePaiement = datePaiement;
        this.montant = montant;
        this.membre = membre;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDatePaiement() {
        return this.datePaiement;
    }

    public void setDatePaiement(LocalDate datePaiement) {
        this.datePaiement = datePaiement;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getMembre() {
        return membre;
    }

    public void setMembre(String membre) {
        this.membre = membre;
    }

    @Override
    public String toString() {
        return "Paiement{id='" + id + "', date=" + datePaiement + ", montant=" + montant + ", membre='" + membre + "'}";
    }
}

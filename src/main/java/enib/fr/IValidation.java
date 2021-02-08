package enib.fr;

public interface IValidation {

    public static String valider(String label, String str) throws Exception {
        if (str == null || str.equals("")) {
            throw new Exception(label + " invalide :" + str);

        }
        return str;
    }

    public static String validerNom(String nom) throws Exception {
        return valider("Numero Inscription", nom);
    }

    public static String validerPrenom(String prenom) throws Exception {
        return valider("Date naissance", prenom);
    }

    public static String validerNumeroEtudiant(String numeroEtudiant) throws Exception {
        return valider("Numero etudiant", numeroEtudiant);
    }

    String valider(Formulaire formulaire) throws Exception;
}

package enib.fr;

public class ValidationParDefaut implements IValidation {
    @Override
    public String valider(Formulaire formulaire) throws Exception {
        try {
            IValidation.validerNom(formulaire.getNumeroInscription());
            IValidation.validerPrenom(formulaire.getDateNaissance());
            IValidation.validerNumeroEtudiant(formulaire.getNumeroEtudiant());
        } catch (Exception e) {
            throw e;
        }
        return "OK";
    }
}

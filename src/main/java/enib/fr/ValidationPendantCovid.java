package enib.fr;

public class ValidationPendantCovid implements IValidation {

    @Override
    public String valider(Formulaire formulaire) throws Exception {
        try {
            IValidation.validerNom(formulaire.getNumeroInscription());
            IValidation.validerPrenom(formulaire.getDateNaissance());
        } catch (Exception e) {
            throw e;
        }
        return "OK";
    }
}

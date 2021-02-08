package enib.fr;

public class ValidationStrategy {
    public static IValidation recupererValidateur(String str) {
        if (str.equals("PAR_DEFAUT")) {
            return new ValidationParDefaut();
        }
        return new ValidationPendantCovid();
    }
}

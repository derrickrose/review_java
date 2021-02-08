package enib.fr;

public class Test {
  
    public static void main(String[] args) {
        IValidation validateur = ValidationStrategy.recupererValidateur("PAR_DEFAUT");
        Formulaire formulaire = new Formulaire("0122", "28-07-2020", "1");
        String message = "KO";
        try {
            message = validateur.valider(formulaire);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Message |" + message + "|");
    }
}

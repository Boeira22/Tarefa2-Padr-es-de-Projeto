
public class emailverifica implements Validador{
    
    public boolean validar(String valor){
        int posA = valor.indexOf('@');
        int posPt = valor.indexOf('.');
            if (posA <= 0 || posPt <= 0){
                return false;
            } else
                return false;
    }
}

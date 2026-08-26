public class matriculaverifica implements Validador {
    public boolean validar(String valor) {
        if (valor == null || valor.length() < 2 || !valor.matches("[0-9]+")) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < valor.length() - 1; i++) {
            soma += Character.getNumericValue(valor.charAt(i));
        }

        int digitoVerificador = soma % 10;
        int ultimoDigito = Character.getNumericValue(valor.charAt(valor.length() - 1));
        return digitoVerificador == ultimoDigito;
    }
}

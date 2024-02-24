package paradigmas;

public class Reajuste {
    public static float gerente(float salario) {
        return salario += salario * 0.2;
    }
    public static float tecnico(float salario) {
        return salario += salario * 0.3;
    }
    public static float funcionario(float salario) {
        return salario += salario * 0.4;
    }
}

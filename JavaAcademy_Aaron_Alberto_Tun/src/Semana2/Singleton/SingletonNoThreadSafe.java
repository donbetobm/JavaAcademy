package Semana2.Singleton;

public class SingletonNoThreadSafe {
    private static SingletonNoThreadSafe instancia;

    private SingletonNoThreadSafe() {
        // Constructor privado
    }

    public static SingletonNoThreadSafe getInstancia() {
        if (instancia == null) {
            instancia = new SingletonNoThreadSafe();
        }
        return instancia;
    }
}


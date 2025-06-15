package Semana2.Singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized instancia;

    private SingletonSynchronized() {}

    public static synchronized SingletonSynchronized getInstancia() {
        if (instancia == null) {
            instancia = new SingletonSynchronized();
        }
        return instancia;
    }
}

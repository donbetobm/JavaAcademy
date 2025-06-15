package Semana2.Singleton;

public class SingletonInitializationOnDemand {

    //Es segura para hilos, eficiente, y no necesita sincronización explícita
    private SingletonInitializationOnDemand() {}

    private static class Holder {
        private static final SingletonInitializationOnDemand INSTANCIA = new SingletonInitializationOnDemand();
    }

    public static SingletonInitializationOnDemand getInstancia() {
        return Holder.INSTANCIA;
    }
}

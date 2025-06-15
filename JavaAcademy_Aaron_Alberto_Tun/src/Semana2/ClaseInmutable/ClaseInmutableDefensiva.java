package Semana2.ClaseInmutable;
import java.util.Date;

public class ClaseInmutableDefensiva {

    public final class Evento {
        private final String titulo;
        private final Date fecha;

        public Evento(String titulo, Date fecha) {
            this.titulo = titulo;
            this.fecha = new Date(fecha.getTime()); // copia defensiva
        }

        public String getTitulo() {
            return titulo;
        }

        public Date getFecha() {
            return new Date(fecha.getTime()); // copia defensiva
        }
    }

}

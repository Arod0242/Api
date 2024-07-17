package forohub.springboot.api;

import org.flywaydb.core.Flyway;

public class FlywayRepairExample {
    public static void main(String[] args) {
        // Configura la conexión a la base de datos
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:mysql://localhost/forohub_api", "root", "ArodSQL0242)")
                .load();

        // Ejecuta Flyway repair
        flyway.repair();

        System.out.println("Flyway repair completed.");
    }
}

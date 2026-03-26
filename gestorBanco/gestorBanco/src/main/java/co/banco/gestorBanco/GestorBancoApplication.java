package co.banco.gestorBanco;
/*
import co.banco.gestorBanco.gui.Ventana;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;

@SpringBootApplication
public class GestorBancoApplication {

	public static void main(String[] args) {
  //      SpringApplication.run(GestorBancoApplication.class, args);
		ConfigurableApplicationContext context = new SpringApplicationBuilder(GestorBancoApplication.class)
				.headless(false)
				.run(args);

		// Lanzamos la ventana en el hilo de eventos de Swing
		EventQueue.invokeLater(() -> {
			Ventana ventana = context.getBean(Ventana.class);
			ventana.setVisible(true);
		});
	}
}


 */




import co.banco.gestorBanco.gui.Ventana;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class GestorBancoApplication {

	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			Ventana ventana = new Ventana();
			ventana.setVisible(true);
		});

	}
}
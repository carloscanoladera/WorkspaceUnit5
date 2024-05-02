package ejercicio.notas.modelo;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.function.BiFunction;

public class AppNotasPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nota n1 = new NotaMarcada( "Conjunción", 40, "Amarillo");

		Nota n2 = new NotaAlarma( "Adelantar reloj", 60, LocalTime.now());

		BlocNotas bloq = new BlocNotas();

		bloq.addNota(n1);
		bloq.addNota(n2);

		Nota n3 = bloq.buscarNotaPorId(0);

		System.out.println(n3);

		Nota[] notas = { n2, n3 };

		bloq.eliminarNota(n1);
		bloq.eliminarNota(n2);

		bloq.listarNotas();

		bloq.addNotas(notas);

		bloq.listarNotas();

		bloq.ordenarNotas(new Comparator<Nota>() {

			@Override
			public int compare(Nota o1, Nota o2) {
				// TODO Auto-generated method stub
				int res = 0;
				if (o1 == null) {

					res = -1;

				} else if (o2 == null) {

					res = 1;
				} else {
					res = (int) (o1.getId() - o2.getId());
				}

				return res;
			}

		});

		bloq.listarNotas();

		bloq.devuelvaNotasOrdenado((o1, o2) -> {
			// TODO Auto-generated method stub
			int res = 0;
			if (o1 == null) {

				res = -1;

			} else if (o2 == null) {

				res = 1;
			} else {
				res = o1.getLineaTexto().compareTo(o2.getLineaTexto());
			}

			return res;
		});

		BiFunction<Double, Integer, Double> bifu = (d, i) -> d * i;

		bifu.apply(5.0, 7);

	}

}

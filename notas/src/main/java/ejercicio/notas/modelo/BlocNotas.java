package ejercicio.notas.modelo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Formatter;



public class BlocNotas {

	private final int MAX_NOTAS = 200;
	private Nota[] notas;
	private int contNotas;

	public BlocNotas() {

		notas = new Nota[MAX_NOTAS];
	}

	public BlocNotas(Nota[] notas) {
		this();
		addNotas(notas);
	}

	public Nota[] getNotas() {

		Nota[] notasRes = new Nota[contNotas];

		int contNot = 0;

		for (int i = 0; i < notas.length && contNot < contNotas; i++) {

			if (notas[i] != null) {

				notasRes[contNot] = notas[i];
				contNot++;
			}

		}

		return notasRes;
	}

	public void addNota(Nota nota) {

		int cont = 0;
		boolean hayHueco = false;

		while (cont < this.notas.length && !hayHueco) {

			if (notas[cont] == null) {

				hayHueco = true;

			} else {
				cont++;
			}

		}

		notas[cont] = nota;
		contNotas++;

	}

	public boolean eliminarNota(Nota nota) {
		// TODO Auto-generated method stub

		boolean encontrado = false;
		for (int i = 0; i < MAX_NOTAS && !encontrado; i++) {

			if (notas[i] != null && notas[i].equals(nota)) {
				encontrado = true;
				notas[i] = null;
				contNotas--;
			}

		}

		return encontrado;

	}

	public void addNotas(Nota[] notasAdd) {
		for (int i = 0; i < notasAdd.length && contNotas < MAX_NOTAS; i++) {

			addNota(notasAdd[i]);

		}

	}

	public boolean hayNotas() {

		return contNotas > 0;
	}

	public Nota buscarNotaPorId(int id) {

		Nota notaRes = null;
		boolean encontrado = false;

		for (int i = 0; i < MAX_NOTAS; i++) {

			if (notas[i] != null && notas[i].getId() == id && !encontrado) {

				notaRes = notas[i];
			}

		}
		return notaRes;

	}

	public void listarNotas() {

		Formatter formatter = new Formatter(Constantes.localeES);
		
		formatter.format("%n%s", Constantes.GUION.repeat(143));
		formatter.format("%n%s%n", Constantes.ASTERISCO.repeat(143));
		formatter.format("%nLISTADO DE NOTAS%n");
		formatter.format("%n%s%n", Constantes.ASTERISCO.repeat(143));
		formatter.format("%s%n", Constantes.GUION.repeat(143));


		formatter.format("%1$-8s %2$-15s %3$-100s %4$-20s", "Id", "Palabra comienzo", "Línea de texto", "TipoNota");

		formatter.format("%n%1$-8s %2$-15s %3$-100s %4$-20s", Constantes.GUION.repeat(8), Constantes.GUION.repeat(15),
				Constantes.GUION.repeat(100), Constantes.GUION.repeat(12));

		for (Nota nota : this.getNotas()) {

			formatter.format("%n%1$-8s %2$-15s %3$-100s %4$-20s", nota.getId(), nota.getNumPalabraComienzo(),
					nota.getLineaTexto(), nota.devuelveTipoNota());
		}

		formatter.format("%n%n");
		System.out.println(formatter);

	}

	public void listarNotasMarcadas() {

		NotaMarcada notaMarc = null;

		Formatter formatter = new Formatter(Constantes.localeES);

		formatter.format("%n%1$-8s %2$-15s %3$-100s %4$-20s %5$-20s", "Id", "Palabra comienzo", "Línea de texto",
				"TipoNota", "Color");

		formatter.format("%n%1$-8s %2$-15s %3$-100s %4$-20s %5$-20s", Constantes.GUION.repeat(8),
				Constantes.GUION.repeat(15), Constantes.GUION.repeat(100), Constantes.GUION.repeat(12),
				Constantes.GUION.repeat(10));

		for (Nota nota : this.getNotas()) {

			if (nota instanceof NotaMarcada) {

				notaMarc = (NotaMarcada) nota;

				formatter.format("%n%1$-8s %2$-15s %3$-100s %4$-20s %5$-20s", notaMarc.getId(),
						notaMarc.getNumPalabraComienzo(), notaMarc.getLineaTexto(), notaMarc.devuelveTipoNota(),
						notaMarc.getColor());

			}

		}

		formatter.format("%n%n");
		System.out.println(formatter);

	}

	public void listarNotasAlarma() {

		NotaAlarma notaAlarm = null;

		Formatter formatter = new Formatter(Constantes.localeES);

		formatter.format("%1$-8s %2$-15s %3$-100s %4$-20s %5$-16s", "Id", "Palabra comienzo", "Línea de texto",
				"TipoNota", "Hora");

		formatter.format("%n%1$-8s %2$-15s %3$-100s %4$-20s %5$-16s", Constantes.GUION.repeat(8),
				Constantes.GUION.repeat(15), Constantes.GUION.repeat(100), Constantes.GUION.repeat(12),
				Constantes.GUION.repeat(10));

		for (Nota nota : this.getNotas()) {

			if (nota instanceof NotaAlarma) {

				notaAlarm = (NotaAlarma) nota;

				formatter.format("%n%1$-8s %2$-15s %3$-100s %4$-20s %5$-16s", notaAlarm.getId(),
						notaAlarm.getNumPalabraComienzo(), notaAlarm.getLineaTexto(), notaAlarm.devuelveTipoNota(),
						notaAlarm.getHora());
			}

		}

		formatter.format("%n%n");
		System.out.println(formatter);

	}

	public void ordenarNotas() {

		Arrays.sort(notas);

	}

	public void ordenarNotas(Comparator<Nota> comp) {

		Arrays.sort(notas, comp);

	}

	public Nota[] devuelvaNotasOrdenado() {

		Nota[] res = this.getNotas();

		Arrays.sort(res);

		return res;

	}

	public Nota[] devuelvaNotasOrdenado(Comparator<Nota> comp) {

		Nota[] res = this.getNotas();

		Arrays.sort(res, comp);

		return res;

	}

}

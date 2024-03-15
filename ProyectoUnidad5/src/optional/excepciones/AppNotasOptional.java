package optional.excepciones;

import java.util.Optional;

public class AppNotasOptional {

	public static void main(String[] args) {

		BlocNotas bloq = new BlocNotas();
		Nota n1 = new Nota(0, "Conjunción", 40);

		Nota n2 = new Nota(1, "Adelantar reloj", 60);

		bloq.addNota(n1);
		bloq.addNota(n2);

		try {
			pintarNotaBloq(bloq, 2);
		} catch (NotaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	public static void pintarNotaBloq(BlocNotas bloq, int id) throws NotaException {

		Optional<Nota> n3 = bloq.buscarNotaPorId(id);

		if (n3.isEmpty()) {
			System.out.println("Nota no encontrada");
			throw new NotaException("Nota no encontrada");
			



		} else {

			System.out.println("La nota es" + n3.get().toString());
		}
	}

}

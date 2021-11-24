package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		CalcolaValutazione[] randomValutazione = new CalcolaValutazione[20];
		Random randomGenerator = new Random();

		int percentualeAssenze;
		float mediaVoti;
		float max = 5;
		boolean esito = true;

		// array
		for (int i = 0; i < randomValutazione.length; i++) {

			percentualeAssenze = randomGenerator.nextInt(100) + 1;
			mediaVoti = randomGenerator.nextFloat() * max;

			randomValutazione[i] = new CalcolaValutazione(i + 1, percentualeAssenze, mediaVoti);
			esito = randomValutazione[i].esito();
			if (esito == true) {

				System.out.println("ID studente: " + randomValutazione[i].idStudente + " \ncon un totale di "
						+ randomValutazione[i].percentualeAssenze + " assenze" + " e una media voti pari a "
						+ randomValutazione[i].mediaVoti + " è stato: PROMOSSO");
			} else {
				System.out.println("ID studente: " + randomValutazione[i].idStudente + " \ncon un totale di "
						+ randomValutazione[i].percentualeAssenze + " assenze" + " e una media voti pari a "
						+ randomValutazione[i].mediaVoti + " è stato: BOCCIATO");
			}

		}

	}

}

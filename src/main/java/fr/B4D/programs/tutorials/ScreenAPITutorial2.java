package fr.B4D.programs.tutorials;

import fr.B4D.bot.B4D;
import fr.B4D.bot.B4DException;
import fr.B4D.bot.Person;
import fr.B4D.program.Category;
import fr.B4D.program.Place;
import fr.B4D.program.Program;
import fr.B4D.utils.PointF;

/**
 * The {@code ScreenAPI} class contains all the tutorials relative to the screen API.
 * 
 * Ce tutoriel à pour objectif de mieux comprendre le fonctionnement et l'utilisation de l'API de l'écran.<br>
 *  <br>
 *  Fonctionnement :
 *  <ul>
 *  	<li>Attend que "hello world" soit affiché à l'écran.</li>
 *  </ul>
 *
 * @author Lucas
 *
 */
public final class ScreenAPITutorial2 extends Program {	

	/**
	 * Constructor of the screen API tutorial 2.
	 */
	public ScreenAPITutorial2() {
		super(Place.Tous, Category.Tutorial, "Screen API", "Tutorial 2", null, null);
	}

	@Override
	public void intro(Person person) {}

	@Override
	public void outro(Person person) {}
	
	@Override
	public void cycle(Person person) throws B4DException {
		B4D.screen.waitForOCR(new PointF(0.4, 0.4), new PointF(0.6, 0.6), "hello world", 10000);
	}
}

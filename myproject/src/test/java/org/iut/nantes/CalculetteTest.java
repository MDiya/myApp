/**
 * 
 */
package org.iut.nantes;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author mdiya
 *
 */
public class CalculetteTest {

	/**
	 * Test method for {@link org.iut.nantes.Calculette#addition(int, int)}.
	 */
	@Test
	public void testAddition() {
		Calculette c = new Calculette();
		assertEquals("Addition de 5 et 3", 8, c.addition(5, 3));
	}

}

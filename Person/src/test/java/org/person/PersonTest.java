package org.person;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	/**
	 * Simple test for the constructor with 4 arguments.
	 */
	@Test
	public void testConstructeur4() {
		Personne p = new Personne("Richard", "Stallman", "Américain", 1953);

		assertEquals("Stallman", p.getNom(), "Problem in the surname !");
		assertEquals("Richard", p.getPrenom(), "Problem in the first name !");
		assertEquals("Américain", p.getNationalite(), "Problem in the nationality !");
		assertEquals(1953, p.getAnneeDeNaissance(), "Problem in the year of birth !");
	}

	/**
	 * Simple test for the constructor with 0 argument.
	 */
	@Test
	public void testConstructeur0() {
		Personne p = new Personne();

		assertEquals("???", p.getNom(), "Problem in the surname !");
		assertEquals("???", p.getPrenom(), "Problem in the first name !");
		assertEquals("French", p.getNationalite(), "Problem in the nationality !");
		assertEquals(0, p.getAnneeDeNaissance(), "Problem in the year of birth !");
	}

	@Test
	public void testUserIdNominal() {
		Personne p = new Personne("Richard", "Stallman", 1953);
		assertEquals("stallric53", p.userId(), " Bad uid !");
	}// assertEquals(expected, actual,messageIfTestFail)

	@Test
	public void testUserIdNomLong5() {
		Personne p = new Personne("Bill", "Gates", 1955);
		assertEquals("gatesbil55", p.userId(), " Bad uid !");
	}

	@Test
	public void testUserIdNomLongInf5() {
		Personne p = new Personne("Steve", "Jobs", 1955);
		assertEquals("jobsste55", p.userId(), " Bad uid !");
	}
}

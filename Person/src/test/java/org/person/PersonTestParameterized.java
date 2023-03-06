package org.person;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import utils.EnumDt;


class PersonTestParameterized {

	/**
	 * Test userId() method of class "Personne" using an enumeration as dataSet
	 */
	@ParameterizedTest
	@EnumSource()
	public void testuserId1(EnumDt dt) {
		Personne personne = new Personne(dt.prenom, dt.nom, dt.anneeDeNaissance);
		assertEquals(dt.idAttendu, personne.userId(), "Test userId()");
	}

	///////////////////////////////////////////////////////////////////
	/**
	 * Test userId() method of class "Personne" using a csv file as dataSet
	 */
	@ParameterizedTest
	@CsvFileSource(resources = "/person/dt", delimiter = ' ')
	public void testuserId2(String prenom, String nom, int anneeNaissance, String id) {
		Personne personne = new Personne(prenom, nom, anneeNaissance);
		assertEquals(id, personne.userId(), "Test userId()");
	}

	///////////////////////////////////////////////////////////////////
	private static Collection<Object[]> dt() {
		Object[][] data = new Object[][] {
				// Cas nominal
				{ "richard", "stallman", 1953, "stallric53" },
				// Longueur du nom
				{ "steve", "jobs", 1955, "jobsste55" }, { "bill", "gates", 1955, "gatesbil55" },
				// Format du nom - majuscule
				{ "richard", "Stallman", 1953, "stallric53" }, { "richard", "stalLman", 1953, "stallric53" },
				{ "richard", "stallMan", 1953, "stallric53" }, { "richard", "stallmaN", 1953, "stallric53" },
				// Format du nom - apostrophe
				{ "richard", "'stallman", 1953, "stallric53" }, { "richard", "s'tallman", 1953, "stallric53" },
				{ "richard", "stal'lman", 1953, "stallric53" }, { "richard", "stall'man", 1953, "stallric53" },
				{ "richard", "stallman'", 1953, "stallric53" },
				// Format du nom - lettres accentuées
				{ "richard", "éèêëeman", 1953, "eeeeeric53" }, { "richard", "staéèêëe", 1953, "staeeric53" },
				{ "richard", "stàâälmàâän", 1953, "staaaric53" }, { "richard", "staïîlman", 1953, "staiiric53" },
				{ "richard", "çtalçmanç", 1953, "ctalcric53" },
				// Format du nom - caractères spéciaux
				{ "leonard", "de vinci", 1452, "devinleo52" }, { "richard", "stallman ", 1953, "stallric53" },
				{ "richard", "0stallman", 1953, "0stalric53" }, { "richard", "@stallman", 1953, "@stalric53" },
				{ "richard", "st,allman", 1953, "st,alric53" }, { "richard", "st.allman", 1953, "st.alric53" },
				{ "richard", "st:allman", 1953, "st:alric53" }, { "richard", "st[allman", 1953, "st[alric53" },
				{ "richard", " ", 1953, "ric53" },
				// Format du nom - lettre accentuée majuscule
				{ "richard", "Éstallman", 1953, "estalric53" }, { "richard", "stÇllman", 1953, "stcllric53" },
				// Longueur du prénom
				{ "roy", "mustang", 1885, "mustaroy85" }, { "ai", "kisugi", 1965, "kisugai65" },
				// Format du prénom - majuscule
				{ "Richard", "stallman", 1953, "stallric53" }, { "riChard", "stallman", 1953, "stallric53" },
				// Format du prénom - caractères
				{ "kathleen joan toelle", "reichs", 1948, "reichkat48" },
				{ "kathleen joan toelle", "reichs", 1948, "reichkat48" },
				{ "kat joan toelle", "reichs", 1948, "reichkat48" }, { "ri'chard", "stallman", 1953, "stallric53" },
				{ "jean-jacques", "goldman", 1951, "goldmjea51" }, { "ri-chard", "stallman", 1953, "stallri-53" },
				{ "éôùhard", "stallman", 1953, "stalleou53" }, { "àïçhard", "stallman", 1953, "stallaic53" },
				{ "richàrd", "stallman", 1953, "stallric53" }, { "ri0chard", "stallman", 1953, "stallri053" },
				{ "ri&hard", "stallman", 1953, "stallri&53" },
				// Année de naissance
				{ "richard", "stallman", -1953, "stallric53" }, { "jesus", "christ", 0, "chrisjes00" },
				{ "richard", "stallman", 5, "stallric05" }, { "richard", "stallman", 19, "stallric19" },
				{ "richard", "stallman", 195, "stallric95" }, { "richard", "stallman", 2000, "stallric00" },
				{ "richard", "stallman", 11953, "stallric53" }, { "richard", "stallman", -5, "stallric05" },
				{ "ryo", "saeba", 1959, "saebaryo59" }, { "jules", "cesar", -100, "cesarjul00" },
				{ "antonio", "canova", 1757, "canovant57" },
				// Nom ou prénom vide.
				{ "john", "", 1955, "???joh55" }, { "", "doe", 1955, "doe???55" } };
		return Arrays.asList(data);
	}

	/**
	 * Test userId() using a collection of data from a method
	 */
	@ParameterizedTest
	@MethodSource("dt")
	public void testuserId(String prenom, String nom, int anneeNaissance, String idAttendu) {
		Personne personne = new Personne(prenom, nom, anneeNaissance);
		assertEquals(idAttendu, personne.userId(), "Test userId()");
	}

}

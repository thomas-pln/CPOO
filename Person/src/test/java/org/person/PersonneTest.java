package org.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {

    @Test
    void testConstructeur4() {
        Personne p = new Personne("Richard", "Stallman", "americain", 1953);
        assertEquals("Richard", p.getPrenom());
        assertEquals("Stallman", p.getNom());
        assertEquals("americain", p.getNationalite());
        assertEquals(1953, p.getAnneeDeNaissance());
    }

    @Test
    void testConstructor0() {
        Personne p = new Personne();
        assertEquals("???", p.getPrenom());
        assertEquals("???", p.getNom());
        assertEquals("French", p.getNationalite());
        assertEquals(0, p.getAnneeDeNaissance());
    }

    @Test
    void testUserIdNominal() {
        Personne p = new Personne("Richard", "Stallman", "americain", 1953);
        assertEquals("stallric53", p.userId());
    }

    @Test
    void testUserIdNomLong5() {
        Personne p = new Personne("Bill", "Gates", "americain", 1955);
        assertEquals("gatesbil55", p.userId());
    }

    @Test
    void testUserIdNomLongInf5() {
        Personne p = new Personne("Steve", "Jobs", "americain", 1955);
        assertEquals("jobsste55", p.userId());
    }
}
package org.person;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EnumSource;
import utils.EnumDt;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestParameterized {

    @ParameterizedTest
    @EnumSource()
    void userId(EnumDt dt) {
        Personne p = new Personne(dt.prenom, dt.nom, dt.anneeDeNaissance);
        assertEquals(dt.idAttendu, p.userId());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dt.csv", delimiter = ',', numLinesToSkip = 1)
    void userId2(String prenom, String nom, int anneeDeNaissance, String idAttendu) {
        Personne p = new Personne(prenom, nom, anneeDeNaissance);
        assertEquals(idAttendu, p.userId());
    }



}
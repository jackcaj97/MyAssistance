/*
Project: MyAssistance
Author: Andrea
Date: 23/12/2018
*/
package model.segnalazione;

import java.util.List;

import model.ufficiotecnico.UfficioTecnico;
import model.utente.Utente;

// TODO: Auto-generated Javadoc
/**
 * The Class SegnalazioneBL.
 */
public final class SegnalazioneBL {

    /**
     * This is an utility class. So no constructor should be used.
     */
    private SegnalazioneBL() {

    }

    /**
     * Effettua segnalazione.
     *
     * @param aTitolo      the titolo
     * @param aDescrizione the descrizione
     * @param aTipologia   the tipologia
     * @param aAutore      the autore
     * @return true, if successful
     */
    public static boolean insertSegnalazione(final String aTitolo,
            final String aDescrizione, final Tipologia aTipologia,
            final Utente aAutore) {
        return false;

    }

    /**
     * Ottieni segnalazioni effettuate.
     *
     * @param aUtente the utente
     * @return the list
     */
    public static List<Segnalazione> getSegnalazioniEffettuate(
            final Utente aUtente) {
        return null;

    }

    /**
     * Modifica segnalazione.
     *
     * @param aCod         the cod
     * @param atitolo      the atitolo
     * @param adescrizione the adescrizione
     * @param atipologia   the atipologia
     * @return true, if successful
     */
    public static boolean updateSegnalazione(final int aCod,
            final String atitolo, final String adescrizione,
            final Tipologia atipologia) {
        return true;

    }

    /**
     * Elimina segnalazione.
     *
     * @param aCod the cod
     * @return true, if successful
     */
    public static boolean deleteSegnalazione(final int aCod) {
        return false;

    }

    /**
     * Inoltra segnalazione.
     *
     * @param aCod     the cod
     * @param aTecnico the tecnico
     * @return true, if successful
     */
    public static boolean inoltraSegnalazione(final int aCod,
            final UfficioTecnico aTecnico) {
        return false;
    }

    /**
     * Ottieni segnalazioni ricevute.
     *
     * @return the list
     */
    public static List<Segnalazione> getSegnalazioniRicevute() {
        return null;

    }

    /**
     * Rifiuta segnalazione.
     *
     * @param aCod                the cod
     * @param aMotivazioneRifiuto the motivazione rifiuto
     * @return true, if successful
     */
    public static boolean rifiutaSegnalazione(final int aCod,
            final String aMotivazioneRifiuto) {
        return false;

    }

    /**
     * Segna come risolta.
     *
     * @param aCod the cod
     * @return true, if successful
     */
    public static boolean segnaRisolta(final int aCod) {
        return false;

    }

}

package deluppgift2;

/**
 * I denna klass så skapas ett presentkort utifrån instruktion från
 * PresentkortDriver. När man skapar ett nytt objekt så ger man objektet ett
 * kortnummer och saldo. Därefter så hanterar denna klass ett antal olika
 * metoder som sker under uppgiftens "händelseförlopp". Dessa består av ett köp
 * (ifall saldot täcker kostnaden), insättning av mer pengar på kortet och
 * returnering av information om kortet. Dessa beskrivs nedan.
 *
 * @author Jonas Borgström
 */

public class Presentkort {

    private static String kortnummer;
    private int saldo;

    /**
     * Skapar ett nytt presentkort med specifierat kortnummer
     *
     * @param kortnummer Presentkortets kortnummer
     */
    public Presentkort(String kortnummer) {
        this.kortnummer = kortnummer;
    }

    /**
     * Visar kortets saldo.
     *
     * @return En integer som visar presentkortets nuvarande saldo.
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Anger hur stort belopp ett nytt presentkort har.
     *
     * @param nyttSaldo En integer som innehåller beloppet som presentkortet
     * startar med.
     */
    public void setSaldo(int nyttSaldo) {
        this.saldo = nyttSaldo;
    }

    /**
     * Visar presentkortets kortnummer.
     *
     * @return En string som innehåller presentkortets kortnummer.
     */
    public String getKortnummer() {
        return kortnummer;
    }

    /**
     * En metod som ökar presentkortets saldo med beloppet som anges av
     * parametern okning. Efter ökningen ges en utskriftet som visar att kortet
     * fyllts på och skriver ut det nya saldot.
     *
     * @param okning En integer som innehåller beloppet som ska fyllas på
     * presentkortet.
     */
    public void okaSaldo(int okning) {
        saldo = saldo + okning;
        System.out.println("Kortet fylldes på med " + okning + "kr. Det nya saldot är " + saldo + " kr.");
    }

    /**
     * En if-sats som kontrollerar ifall kortets saldo täcker ett köp. Ifall
     * saldot är större än/lika med inköpssumman så går köpet igenom. Detta
     * medför att beloppet dras från kortet och kunden får en utskrift på att
     * köpet gått igenom. Ifall saldot är mindre än inköpssumman så nekas köpet.
     * I detta fall får kunden endast en utskrift att köpet ej gått igenom.
     *
     * @param inkopssumma En integer som innehåller summan på köpet som ska
     * genomförs.
     * @return En boolean som anger om köpet lyckas (true) eller misslyckats
     * (false).
     */
    public boolean kontrolleraInkop(int inkopssumma) {
        if (saldo >= inkopssumma) {
            saldo = saldo - inkopssumma;
            return true;
        } else {
            return false;
        }

    }

    /**
     * Återger information om kortnummer och kortets saldo.
     *
     * @return En string innehållande information om presentkortets kortnummer
     * och dess saldo.
     */
    @Override
    public String toString() {
        return "Kortnummer " + kortnummer + " har ett nuvarande saldo på "
                + saldo + " kr.";
    }
}

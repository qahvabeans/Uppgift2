/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deluppgift2;

/**
 *
 * @author Jonas
 */
public class PresentkortDriver {

    public static void main(String[] args) {
        Presentkort kort = new Presentkort("12345");
        kort.setSaldo(1000);

        String intro = kort.toString();
        System.out.println(intro);
        genomforInkop(kort, 350);
        genomforInkop(kort, 700);
        kort.okaSaldo(800);
        genomforInkop(kort, 700);

    }

    public static void genomforInkop(Presentkort kort, int inkopssumma) {
        if (kort.kontrolleraInkop(inkopssumma)) {
            System.out.println("Inköpet på " + inkopssumma + " godkändes. Det återstående saldot på presentkort " + kort.getKortnummer() + " är " + kort.getSaldo() + " kr.");

        } else {
            System.out.println("Inköpet på " + inkopssumma + " godkändes INTE. Det återstående saldot på presentkort " + kort.getKortnummer() + " (" + kort.getSaldo() + " kr) är lägre än inköpssumman.");

        }
    }

}

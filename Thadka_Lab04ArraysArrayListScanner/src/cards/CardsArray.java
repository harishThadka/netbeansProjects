/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 * Cards of Array class
 * @author Harish Thadka
 */
public class CardsArray {

    private Card[] clubs;
    private Card[] diamonds;
    private Card[] hearts;
    private Card[] spades;
    private static final int DECK_SIZE = 5;
    private int clubsCount;
    private int diamondsCount;
    private int heartsCount;
    private int spadesCount;

    /**
     * Constructor sets values for private attributes
     */
    public CardsArray() {

        clubs = new Card[DECK_SIZE];
        diamonds = new Card[DECK_SIZE];
        hearts = new Card[DECK_SIZE];
        spades = new Card[DECK_SIZE];
        clubsCount = 0;
        diamondsCount = 0;
        heartsCount = 0;
        spadesCount = 0;

    }

    /**
     * Returns the clubs count
     * @return clubs count
     */
    public int getClubsCount() {
        return clubsCount;
    }

    /**
     * Returns the diamonds count
     * @return diamonds count
     */
    public int getDiamondsCount() {
        return diamondsCount;
    }

    /**
     * Returns the hearts count
     * @return hearts count
     */
    public int getHeartsCount() {
        return heartsCount;
    }

    /**
     * Returns the spades count
     * @return spadesCount
     */
    public int getSpadesCount() {
        return spadesCount;
    }

    /**
     * sets card specified suit type into arrays
     * @param c object of card
     */
    public void addCardToArray(Card c) {

        if ("club".equals(c.getSuit())) {
            if (clubsCount < DECK_SIZE) {
                clubs[clubsCount] = c;
                clubsCount++;
            } else {
                removeCardFromArray(0, "club");
                addCardToArray(c);

            }

        } else if ("diamond".equals(c.getSuit())) {
            if (diamondsCount < DECK_SIZE) {
                diamonds[diamondsCount] = c;
                diamondsCount++;
            } else {
                removeCardFromArray(0, "diamond");
                addCardToArray(c);

            }

        } else if ("heart".equals(c.getSuit())) {
            if (heartsCount < DECK_SIZE) {
                hearts[heartsCount] = c;
                heartsCount++;
            } else {
                removeCardFromArray(0, "heart");
                addCardToArray(c);

            }

        } else {
            if (spadesCount < DECK_SIZE) {
                spades[spadesCount] = c;
                spadesCount++;
            } else {
                removeCardFromArray(0, "spade");
                addCardToArray(c);

            }

        }

    }

    /**
     * Removes the element in particular array
     * @param position position of array
     * @param suit suit of card
     */
    public void removeCardFromArray(int position, String suit) {
        if (position < DECK_SIZE) {
            if ("club".equals(suit)) {
                for (int i = position; i < DECK_SIZE - 1; i++) {
                    clubs[i] = clubs[i + 1];
                }
                clubs[DECK_SIZE - 1] = null;
                clubsCount--;
            } else if ("diamond".equals(suit)) {
                for (int i = position; i < DECK_SIZE - 1; i++) {
                    diamonds[i] = diamonds[i + 1];
                }
                diamonds[DECK_SIZE - 1] = null;
                diamondsCount--;
            } else if ("heart".equals(suit)) {
                for (int i = position; i < DECK_SIZE - 1; i++) {
                    hearts[i] = hearts[i + 1];
                }
                hearts[DECK_SIZE - 1] = null;
                heartsCount--;
            } else {
                for (int i = position; i < DECK_SIZE - 1; i++) {
                    spades[i] = spades[i + 1];
                }
                spades[DECK_SIZE - 1] = null;
                spadesCount--;
            }
        }

    }

    @Override
    public String toString() {
        String c = clubs[0].toString();
        String d = diamonds[0].toString();
        String h = hearts[0].toString();
        String s = spades[0].toString();

        for (int i = 1; i < clubs.length; i++) {
            if (clubs[i] != null) {
                c += ", " + clubs[i].toString();
            } else {
                break;
            }
        }
        for (int i = 1; i < hearts.length; i++) {
            if (hearts[i] != null) {
                h += ", " + hearts[i].toString();
            } else {
                break;
            }
        }
        for (int i = 1; i < diamonds.length; i++) {
            if (diamonds[i] != null) {
                d += ", " + diamonds[i].toString();
            } else {
                break;
            }

        }
        for (int i = 1; i < spades.length; i++) {
            if (spades[i] != null) {
                s += ", " + spades[i].toString();
            } else {
                break;
            }
        }
        String res = "Hearts Array: [" + h
                + "]\nDiamonds Array: [" + d
                + "]\nSpades Array: [" + s
                + "]\nClubs Array: [" + c + "]";
        return res;

    }

}

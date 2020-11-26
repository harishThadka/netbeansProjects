/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapws;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Harish Thadka
 */
public class MapDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        TreeMap<String, String> stateCodes = new TreeMap<>();
//
//        stateCodes.put("Missouri", "MO");
//        stateCodes.put("Texas", "TX");
//        stateCodes.put("California", "CA");
//        stateCodes.put("New York", "NY");
//
//        System.out.println("State code for texas " + stateCodes.get("Texas"));
//        System.out.println("States " + stateCodes.keySet());
//        System.out.println("values " + stateCodes.values());
//        System.out.println("Mappings: " + stateCodes.entrySet());
////        System.out.println(stateCodes.remove("New York"));
//stateCodes.put("Missouri", "check");
//        System.out.println("Mappings: " + stateCodes.entrySet());
        Thesaurus t = new Thesaurus();

        t.addWord("rapid");
        t.addWord("slow");
        System.out.println(t);
        t.addSynonym("rapid", "fast");
        t.addSynonym("rapid", "quick");
        t.addSynonym("rapid", "swift");
        t.addSynonym("slow", "leisurely");
        t.addSynonym("slow", "sluggish");
        System.out.println(t);
        System.out.println(t.getSynonyms("rapid"));
        t.addSynonym("fun", "enjoyable");
                System.out.println(t);

}

}

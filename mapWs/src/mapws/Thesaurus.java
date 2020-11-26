/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapws;

import java.util.LinkedList;
import java.util.TreeMap;

/**
 *
 * @author Harish Thadka
 */
public class Thesaurus {

    private TreeMap<String, LinkedList<String>> thesaurus;

    public Thesaurus() {
        thesaurus = new TreeMap<>();
    }

    public void addWord(String word) {
        thesaurus.put(word, new LinkedList<>());
    }

    public void addSynonym(String word, String synonym) {
        LinkedList<String> synonyms = thesaurus.get(word);
        if (synonyms == null) {
            addWord(word);
        }
        thesaurus.get(word).add(synonym);
    }
    
    
    public LinkedList<String> getSynonyms(String word){
        return thesaurus.get(word);
    }
    
    public String toString(){
        return thesaurus.toString();
    }

}

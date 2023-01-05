package com.company;

public class Main {

    public static void main(String[] args) {
        //test code
        String[] dictionaryEspWords = {"El perro",
                "El cachorro",
                "El gato",
                "El hámster",
                "La cobaya",
                "El pez",
                "El pájaro",
                "El perico",
                "La tortuga",
                "La serpiente"};
        String[] dictionaryEspDefs = {"The dog","The puppy","The gato","The hamster","The guinea pig","The fish","The bird","The parakeet","The turtle","The snake"};
        Dictionary dictionaire = new Dictionary();
        fillDictionary(dictionaire,dictionaryEspWords,dictionaryEspDefs);
        dictionaire.randomFlashCard();
    }
    public static void fillDictionary(Dictionary d, String[] words, String[] defs){
        for(int i=0; i<words.length; i++){
            d.add(words[i],defs[i]);
        }
    }
}

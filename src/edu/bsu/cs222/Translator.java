package edu.bsu.cs222;

/**
 * Created by JR on 09/06/2016.
 */
public class Translator {
    public static String translate(String translatorType, String input) {
        input = cleanse(input);
        if (!input.isEmpty()) {
            return input + getValue(translatorType);
        }
        else{
            return input;
        }
    }
    public static String getValue(String translatorType){
        if(translatorType.equals("Identity")){
            return "";
        }
        if(translatorType.equals("Pirate")){
            return ", arr.";
        }
        if(translatorType.equals("Canadian")){
            return ", eh?";
        }
        if(translatorType.equals("Minnesotian")){
            return ", doncha know?";
        }
        if(translatorType.equals("So. Cal.")){
            return ", dudebro.";
        }
        return "";
    }
    public static String cleanse(String input){
        if(input.isEmpty()){
            return input;
        }
        Boolean clean = false;
        while(!clean) {
            clean = true;
            if (input.endsWith(" ") || input.endsWith(".") || input.endsWith("!") || input.endsWith("?")
                    || input.endsWith(",") || input.endsWith(";") || input.endsWith(":")) {
                input.substring(0, input.length() - 1);
                clean = false;
            }
        }
        return input;
    }
}

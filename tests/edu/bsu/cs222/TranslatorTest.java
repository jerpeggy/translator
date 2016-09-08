package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

import static edu.bsu.cs222.Translator.translate;

/**
 * Created by JR on 09/06/2016.
 */
public class TranslatorTest {
    @Test
    public void testEmptyStringIdentity(){
        String input = "";
        String result = translate("Identity",input);
        Assert.assertTrue(result.equals(""));
    }
    @Test
    public void testEmptyStringPirate(){
        String input = "";
        String result = translate("Pirate",input);
        Assert.assertTrue(result.equals(""));
    }
    @Test
    public void testTranslatorPirate(){
        String input = "foob";
        String result = translate("Pirate",input);
        Assert.assertTrue(result.equals("foob, arr."));
    }
}

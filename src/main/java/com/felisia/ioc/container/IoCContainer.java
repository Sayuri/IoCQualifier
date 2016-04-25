package com.felisia.ioc.container;

import com.felisia.ioc.Main;
import com.felisia.ioc.generator.NameGenerator;
import com.felisia.ioc.transformer.TransformerToAllUppercaseLetters;
import com.felisia.ioc.transformer.TransformerToFirstUppercaseLetter;

public class IoCContainer {


    public static Main getEntryPoint() {
        NameGenerator nameGenerator = new NameGenerator();
        TransformerToAllUppercaseLetters transformerToAllUpperLetters = new TransformerToAllUppercaseLetters(nameGenerator);
        TransformerToFirstUppercaseLetter transformerToFirstUpperLetter = new TransformerToFirstUppercaseLetter(nameGenerator);

        return new Main(transformerToAllUpperLetters, transformerToFirstUpperLetter);
    }
}

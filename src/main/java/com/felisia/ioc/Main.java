package com.felisia.ioc;

import com.felisia.ioc.container.IoCContainer;
import com.felisia.ioc.transformer.Transformer;
import com.felisia.ioc.transformer.TransformerToAllUppercaseLetters;
import com.felisia.ioc.transformer.TransformerToFirstUppercaseLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

    @Qualifier("transformerToAllUpperLetters")
    private Transformer transformerToAllUpperLetters;

    @Qualifier("transformerToFirstUpperLetter")
    private Transformer transformerToFirstUpperLetter;

    @Autowired
    public Main(TransformerToAllUppercaseLetters transformerToAllUpperLetters, TransformerToFirstUppercaseLetter transformerToFirstUpperLetter) {
        this.transformerToAllUpperLetters = transformerToAllUpperLetters;
        this.transformerToFirstUpperLetter = transformerToFirstUpperLetter;
    }


    private void demo() {
        String result1 = transformerToAllUpperLetters.transform();
        String result2 = transformerToFirstUpperLetter.transform();
        System.out.println("Results: " + result1 + " " + result2);
    }


    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Main main = context.getBean(Main.class);
        main.demo();
    }
}

package com.felisia.ioc.transformer;

import com.felisia.ioc.generator.NameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("transformerToAllUppercaseLetters")
public class TransformerToAllUppercaseLetters implements Transformer{
    private NameGenerator nameGenerator;

    @Autowired
    public TransformerToAllUppercaseLetters(NameGenerator nameGenerator) {
        this.nameGenerator = nameGenerator;
    }

    public String transform() {
        return nameGenerator.generate().toUpperCase();
    }
}

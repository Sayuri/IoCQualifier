package com.felisia.ioc.transformer;

import com.felisia.ioc.generator.NameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("transformerToFirstUppercaseLetter")
public class TransformerToFirstUppercaseLetter implements Transformer{
    private NameGenerator nameGenerator;

    @Autowired
    public TransformerToFirstUppercaseLetter(NameGenerator nameGenerator) {
        this.nameGenerator = nameGenerator;
    }

    public String transform() {
        return nameGenerator.generate().substring(0, 1).toUpperCase() + nameGenerator.generate().substring(1);
    }
}

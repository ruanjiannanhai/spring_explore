package com.justbon.different;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("soft")
public class Cake implements Dessert {
    @Override
    public String getName() {
        return "soft";
    }
}

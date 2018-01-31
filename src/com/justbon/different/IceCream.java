package com.justbon.different;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class IceCream implements Dessert {
    @Override
    public String getName() {
        return "cold";
    }
}

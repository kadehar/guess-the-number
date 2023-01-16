package com.github.kadehar.guessthenumber.greetings;

import com.github.kadehar.guessthenumber.title.Title;

public class BaseGreeting implements Greeting {

    private final Title title;
    private final Title subtitle;

    public BaseGreeting(Title title, Title subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    @Override
    public void show() {
        System.out.println(title.asMessage());
        System.out.println(subtitle.asMessage());
        System.out.println();
    }
}

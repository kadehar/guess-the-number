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
    public String message() {
        return String.format("%s\n%s\n", title.asMessage(), subtitle.asMessage());
    }
}

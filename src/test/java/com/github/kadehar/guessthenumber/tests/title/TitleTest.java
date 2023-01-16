package com.github.kadehar.guessthenumber.tests.title;

import com.github.kadehar.guessthenumber.fakes.title.FakeSubtitleImpl;
import com.github.kadehar.guessthenumber.fakes.title.FakeTitleImpl;
import com.github.kadehar.guessthenumber.title.Title;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitleTest {

    @Test
    public void titleMessageTest() {
        Title title = new FakeTitleImpl();
        Title subtitle = new FakeSubtitleImpl();

        assertEquals("\tFake Game Title!", title.asMessage());
        assertEquals("\tFake Game Subtitle!", subtitle.asMessage());
    }
}

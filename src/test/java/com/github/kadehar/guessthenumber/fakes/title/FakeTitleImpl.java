package com.github.kadehar.guessthenumber.fakes.title;

import com.github.kadehar.guessthenumber.title.Title;

public class FakeTitleImpl implements Title {
    @Override
    public String asMessage() {
        return "\tFake Game Title!";
    }
}

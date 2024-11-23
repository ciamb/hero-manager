package com.ciamb.domain.model;

import com.ciamb.domain.model.level.Level;

public class Hero {

    private String name;
    private Level level = new Level();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

}

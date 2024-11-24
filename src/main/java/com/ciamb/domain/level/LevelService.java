package com.ciamb.domain.level;

import java.util.logging.Logger;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LevelService {
    private final Logger log = Logger.getLogger(getClass().getSimpleName());

    private static final int MULTIPLIER = 33;

    public void addExperience(Level level, int experience) {
        if (experience < 0) {
            throw new IllegalArgumentException("You can't earn negative experience!");
        }

        log.info(() -> "current level : %d . adding %d experience".formatted(level.getCurrentLevel(), experience));
        level.setCurrentExperience(level.getCurrentExperience() + experience);

        while (level.getCurrentExperience() >= level.getExperienceToNextLevel()) {
            levelUp(level);
        }
    }

    private int calculateExperienceForNextLevel(int level) {
        return (int) Math.pow(level, 2) * MULTIPLIER;
    }

    private void levelUp(Level level) {
        level.setCurrentExperience(level.getCurrentExperience() - level.getExperienceToNextLevel());
        level.setCurrentLevel(level.getCurrentLevel() + 1);
        log.info(() -> "level up!! new level: %d".formatted(level.getCurrentLevel()));
        level.setExperienceToNextLevel(calculateExperienceForNextLevel(level.getCurrentLevel()));
    }
}

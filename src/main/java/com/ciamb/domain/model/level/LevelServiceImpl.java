package com.ciamb.domain.model.level;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LevelServiceImpl implements LevelService {

    private static final int MULTIPLIER = 33;

    @Override
    public void addExperience(Level level, int experience) {
        if (experience < 0) {
            throw new IllegalArgumentException("You can't earn negative experience!");
        }

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
        level.setExperienceToNextLevel(calculateExperienceForNextLevel(level.getCurrentLevel()));
    }

}

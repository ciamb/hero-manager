package com.ciamb.domain.model.level;

public class Level {
    private Integer currentLevel;
    private Integer currentExperience;
    private Integer experienceToNextLevel;

    public Level() {
        this.currentLevel = 1;
        this.currentExperience = 0;
        this.experienceToNextLevel = 50;
    }

    public Integer getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(Integer currentLevel) {
        this.currentLevel = currentLevel;
    }

    public Integer getCurrentExperience() {
        return currentExperience;
    }

    public void setCurrentExperience(Integer currentExperience) {
        this.currentExperience = currentExperience;
    }

    public Integer getExperienceToNextLevel() {
        return experienceToNextLevel;
    }

    public void setExperienceToNextLevel(Integer experienceToNextLevel) {
        this.experienceToNextLevel = experienceToNextLevel;
    }

}

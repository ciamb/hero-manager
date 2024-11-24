package com.ciamb.domain.level;

import jakarta.persistence.Embeddable;

@Embeddable
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

    @Override
    public String toString() {
        return "Level [currentLevel=" + currentLevel + ", currentExperience=" + currentExperience
                + ", experienceToNextLevel=" + experienceToNextLevel + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((currentLevel == null) ? 0 : currentLevel.hashCode());
        result = prime * result + ((currentExperience == null) ? 0 : currentExperience.hashCode());
        result = prime * result + ((experienceToNextLevel == null) ? 0 : experienceToNextLevel.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Level other = (Level) obj;
        if (currentLevel == null) {
            if (other.currentLevel != null)
                return false;
        } else if (!currentLevel.equals(other.currentLevel))
            return false;
        if (currentExperience == null) {
            if (other.currentExperience != null)
                return false;
        } else if (!currentExperience.equals(other.currentExperience))
            return false;
        if (experienceToNextLevel == null) {
            if (other.experienceToNextLevel != null)
                return false;
        } else if (!experienceToNextLevel.equals(other.experienceToNextLevel))
            return false;
        return true;
    }

}

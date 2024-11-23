package com.ciamb.domain;

import com.ciamb.domain.model.Hero;
import com.ciamb.domain.model.level.ExperienceRequest;
import com.ciamb.domain.model.level.LevelService;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/hero")
public class HeroController {

    private final LevelService levelService;

    public HeroController(LevelService levelService) {
        this.levelService = levelService;
    }

    @POST
    @Path("/addExperience")
    public Integer addExperience(ExperienceRequest request) {
        var hero = new Hero();
        levelService.addExperience(hero.getLevel(), request.getExperience());
        return hero.getLevel().getCurrentLevel();
    }
}

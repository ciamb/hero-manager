package com.ciamb.domain.level;

import com.ciamb.domain.hero.Hero;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/level")
public class LevelController {
    private final LevelService levelService;

    public LevelController(LevelService levelService) {
        this.levelService = levelService;
    }

    @POST
    @Path("/addExperience")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String addExperience(ExperienceRequest experienceRequest) {
        var hero = new Hero();
        levelService.addExperience(hero.getLevel(), experienceRequest.getExperience());
        return "%d".formatted(hero.getLevel().getCurrentLevel());
    }
}
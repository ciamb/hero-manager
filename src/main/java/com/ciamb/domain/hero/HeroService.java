package com.ciamb.domain.hero;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class HeroService {

    private EntityManager em;

    public HeroService(EntityManager em) {
        this.em = em;
    }

    @Transactional
    public Hero save(String name) {
        Hero hero = new Hero();
        hero.setName(name);
        em.persist(hero);
        return hero;
    }

}

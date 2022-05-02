package com.frst.repository;

import com.frst.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {
    public List<Jedi> jedi = new ArrayList<>();
    public List<Jedi> getAllJedi(){
        return jedi;
    }

    public void add(Jedi jedi) {
        this.jedi.add(jedi);
    }
}

package com.telusko.demo.repository;

import com.telusko.demo.model.Alien;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ALienDao {

    public void save(Alien alien) {
//        added
    }

    public List<Alien> findAll() {
        return new ArrayList<>();
    }
}

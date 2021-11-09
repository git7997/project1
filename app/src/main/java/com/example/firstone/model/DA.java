package com.example.firstone.model;

import java.util.ArrayList;
import java.util.List;

public class DA  implements interfaceClass{
    ArrayList<Data> data =new ArrayList<>();

    public DA() {
        data.add(new Data("Back workout"));
        data.add(new Data("Chest workout"));
        data.add(new Data("Legs workout"));
        data.add(new Data("Arms workout"));

    }

    @Override
    public List<Data> getAllData() {
        return data;
    }
}

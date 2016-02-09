package com.anna.databaseconnection.domain.services;

import com.anna.databaseconnection.domain.entity.Steps;
import java.util.List;

public interface StepsServices {
    public int          addSteps(Steps s);
    public boolean      updateSteps(Steps s);
    public Steps        getSteps(int id);
    public int          deleteSteps(int id);
    public List<Steps>  stepsList();
}

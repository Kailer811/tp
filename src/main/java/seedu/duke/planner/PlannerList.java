package seedu.duke.planner;

import java.sql.Array;
import java.util.ArrayList;

public class PlannerList {
    private ArrayList<Module>[] semester;

    public PlannerList() {
        semester = new ArrayList[8];
        for (int i = 0; i < semester.length; i++) {
            semester[i] = new ArrayList<Module>();
        }
    }

/**
 public addModule(Module module) {
    public findModule();
    public editModule();
    public removeModule();
 **/
}

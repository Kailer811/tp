package seedu.duke.command;

import seedu.duke.appState.AppState;
import seedu.duke.module.ModuleList;
import seedu.duke.planner.PlannerList;

public class AddToPlannerCommand extends Command {
    private final String moduleCode;
    private final String semester;

    public AddToPlannerCommand(String moduleCode, String semester) {
        this.moduleCode = moduleCode;
        this.semester = semester;
    }

    public String execute(AppState appState) {
        return ("work in progress, planner coming soon !!");
    }
}

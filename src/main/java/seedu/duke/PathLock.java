package seedu.duke;

import java.util.ArrayList;
import java.util.Scanner;

import seedu.duke.command.Command;
import seedu.duke.module.Module;
import seedu.duke.module.ModuleList;
import seedu.duke.parser.Parser;

public class PathLock {
    /**
     * Main entry-point for the PathLock application.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ModuleList modules = new ModuleList(new ArrayList<Module>());

        System.out.println("Welcome to the CEG Module Planner!");
        System.out.println("Type a command:");

        while (true) {

            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("bye")) {
                System.out.println("Goodbye!");
                break;
            }

            Command command = Parser.parseCommand(input);

            if (command == null) {
                System.out.println("Unknown command.");
                continue;
            }

            try {
                String result = command.execute(modules);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}

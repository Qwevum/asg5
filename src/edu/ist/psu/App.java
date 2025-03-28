package edu.ist.psu;

import edu.ist.psu.controller.SplitListController;
import edu.ist.psu.model.ISplittableList;
import edu.ist.psu.model.UtilListImpl;
import edu.ist.psu.view.SplitListView;

/**
 * This is the app class which houses the main method which runs the program
 */

public class App {

    public static void main(String[] args) { // in App.java

        ISplittableList<String> model = new UtilListImpl<>();

        SplitListView view = new SplitListView();
        SplitListController controller =
                new SplitListController(model, view);
        view.setVisible(true);
    }

}

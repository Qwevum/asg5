package edu.ist.psu.controller;

import edu.ist.psu.model.ISplittableList;
import edu.ist.psu.view.SplitListView;

import javax.swing.*;

/**
 * This class contains the controller logic with each lambda expression for each button in the application
 */

public class SplitListController {

    private ISplittableList<String> listModel;
    private SplitListView view;

    public SplitListController(ISplittableList<String> m,
                               SplitListView v) {
        this.listModel = m;
        this.view = v;

        // first thing we'll do in the constructor
        // (remember: this runs only once per run of the app) is set the initial
        // text rendering the (empty) list
        view.form.getListValueLabel().setText(listModel.toString());
        view.form.getLeftLenValue().setText("0");
        view.form.getRightLenValue().setText("0");
        view.form.getLastRemovedValueLabel().setText("N/A");

        // TODO: (Start this only once the form is built --
        //        and the App class runs and displays your form)
        //   add action listeners to the various buttons and manipulate the listModel,
        //   updating the various components on the view when needed

        view.form.getAddToRightButton().addActionListener(e -> {
            listModel.addToRightAtFront(view.form.getInputTextField().getText());
            view.form.getListValueLabel().setText(listModel.toString());
            view.form.getRightLenValue().setText(String.valueOf(listModel.rightLength()));
        });

        view.form.getRemoveFromRightButton().addActionListener(e -> {
            String dataRemove = listModel.removeFromRightAtFront();
            view.form.getListValueLabel().setText(listModel.toString());
            view.form.getLastRemovedValueLabel().setText(dataRemove);
            view.form.getRightLenValue().setText(String.valueOf(listModel.rightLength()));
            view.form.getLeftLenValue().setText(String.valueOf(listModel.leftLength()));

        });

        view.form.getMoveToBeginningButton().addActionListener(e -> {
            listModel.moveToVeryBeginning();
            view.form.getListValueLabel().setText(listModel.toString());
            view.form.getLeftLenValue().setText("0");
            view.form.getRightLenValue().setText(String.valueOf(listModel.rightLength()));
        });

        view.form.getCountOfButton().addActionListener(e -> {
            JOptionPane.showMessageDialog(view, listModel.countOf(view.form.getInputTextField().getText()));
        });

        view.form.getClearButton().addActionListener(e -> {
            listModel.clear();
            view.form.getListValueLabel().setText(listModel.toString());
            view.form.getLeftLenValue().setText("0");
            view.form.getRightLenValue().setText("0");
            view.form.getLastRemovedValueLabel().setText("N/A");
        });

        view.form.getMoveForwardButton().addActionListener(e -> {
            listModel.moveForward();
            view.form.getListValueLabel().setText(listModel.toString());
            view.form.getLeftLenValue().setText(String.valueOf(listModel.leftLength()));
            view.form.getRightLenValue().setText(String.valueOf(listModel.rightLength()));
        });


    }
}

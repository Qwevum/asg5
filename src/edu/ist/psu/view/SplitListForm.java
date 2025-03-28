package edu.ist.psu.view;

import javax.swing.*;

/**
 * This class contains all the fields required in the GUI
 */

public class SplitListForm {
    private JPanel myPanel;
    private JLabel lastRemovedLabel;
    private JButton addToRightButton;
    private JButton removeFromRightButton;
    private JButton moveForwardButton;
    private JTextField inputTextField;
    private JLabel lastRemovedValueLabel;
    private JLabel listValueLabel;
    private JPanel displayPanel;
    private JPanel leftLenLabel;
    private JPanel rightLenLabel;
    private JLabel leftLenValue;
    private JLabel rightLenValue;
    private JButton moveToBeginningButton;
    private JButton clearButton;
    private JButton countOfButton;


    public JPanel getMyPanel() {
        return myPanel;
    }

    public JLabel getLastRemovedLabel() {
        return lastRemovedLabel;
    }

    public JButton getAddToRightButton() {
        return addToRightButton;
    }

    public JButton getRemoveFromRightButton() {
        return removeFromRightButton;
    }

    public JButton getMoveForwardButton() {
        return moveForwardButton;
    }

    public JTextField getInputTextField() {
        return inputTextField;
    }

    public JLabel getLastRemovedValueLabel() {
        return lastRemovedValueLabel;
    }

    public JLabel getListValueLabel() {
        return listValueLabel;
    }

    public JPanel getDisplayPanel() {
        return displayPanel;
    }

    public JPanel getLeftLenLabel() {
        return leftLenLabel;
    }

    public JPanel getRightLenLabel() {
        return rightLenLabel;
    }

    public JLabel getLeftLenValue() {
        return leftLenValue;
    }

    public JLabel getRightLenValue() {
        return rightLenValue;
    }

    public JButton getMoveToBeginningButton() {
        return moveToBeginningButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JButton getCountOfButton() {
        return countOfButton;
    }
}

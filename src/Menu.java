import javax.swing.*;
public class Menu extends JFrame {
    static QuestionLinkedList survey = new QuestionLinkedList();
    Menu(){

    }
    public static void main(String[] args) {
        QuestionMakerWindow thiswindow = new QuestionMakerWindow(0);
        thiswindow.setVisible(true);
    }

}

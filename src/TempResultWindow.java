import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempResultWindow extends JFrame implements ActionListener {
    JLabel heading;
    JLabel Qtitle;
    JLabel eachRes;
    String eachNum = new String("");
    JButton next;
    QuestionNode Q;
    TempResultWindow(QuestionNode Q){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.Q = Q;
        Question a=Q.getQuestion();
        heading = new JLabel("    Question "+a.ID);
        heading.setFont(new Font("Serif", Font.BOLD,30));
        Qtitle = new JLabel("   "+ a.getQuestionText());
        Qtitle.setFont(Menu.PLAINFont);
        next = new JButton("Next");
        next.addActionListener(this);

        for(int i = 0; i<a.optNum; i++){
            eachNum += a.qOptions.get(i) + ": " + a.respCounter[i]+"\n";
        }
        eachRes = new JLabel("   " + eachNum);

        setLayout(new GridLayout(4,1));
        add(heading);
        add(Qtitle);
        add(eachRes);
        if (Q.getNext()!=null){
            add(next);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TempResultWindow TRW = new TempResultWindow(Q.getNext());
        TRW.setVisible(true);
        dispose();
    }
}

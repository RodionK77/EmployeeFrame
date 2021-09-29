import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {
    JTextField jName = new JTextField(10);
    JTextField jAge = new JTextField(10);
    JTextField jPosition = new JTextField(10);
    Label lName = new Label("Set name:");
    Label lAge = new Label("Set age:");
    Label lPosition = new Label("Set position:");
    JLabel sName = new JLabel("Name:");
    JLabel sAge = new JLabel("Age:");
    JLabel sPosition = new JLabel("Position:");
    JButton show = new JButton("Show");
    JButton exit = new JButton("Exit");
    JPanel panel= new JPanel();
    BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

    public Main(){
        super("Employee");
        setLayout(new FlowLayout());
        setSize(250, 250);
        add(lName);
        add(jName);
        add(lAge);
        add(jAge);
        add(lPosition);
        add(jPosition);
        add(show,BorderLayout.WEST);
        add(exit,BorderLayout.EAST);
        panel.setLayout(boxlayout);
        panel.add(sName);
        panel.add(sAge);
        panel.add(sPosition);
        add(panel);
        sName.setVisible(false);
        sAge.setVisible(false);
        sPosition.setVisible(false);

        Employee person = new Employee();
        jName.addActionListener(ae-> {
            person.setName(jName.getText());
        });
        jAge.addActionListener(ae-> {
            person.setAge(jAge.getText());
        });
        jPosition.addActionListener(ae-> {
            person.setPosition(jPosition.getText());
        });
        show.addActionListener(ae-> {
            sName.setText("Name: " + person.getName());
            sAge.setText("Age: " + person.getAge());
            sPosition.setText("Position: " + person.getPosition());
            sName.setVisible(true);
            sAge.setVisible(true);
            sPosition.setVisible(true);
        });
        exit.addActionListener(ae-> {
            setSize(0,0);
        });
    }

    public static void main(String[] args){
        new Main().setVisible(true);
    }
}

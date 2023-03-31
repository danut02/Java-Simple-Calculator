import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.*;
import java.awt.event.*;
import javax.lang.model.util.ElementScanner6;
import javax.swing.AbstractButton;

public class Arithmetic {

    public static void main(String[] args) {
        String result = "Here is the result!";
        JTextField input1 = new JTextField(16);
        JTextField input2 = new JTextField(16);
        JFrame frame1 = new JFrame("Calculator");
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel(result);
        JCheckBox check1 = new JCheckBox("Plus");
        JCheckBox check2 = new JCheckBox("Minus");
        JButton button1 = new JButton("=");

        ActionListener actionListener1 = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String inp1 = input1.getText();
                String inp2 = input2.getText();
                AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                boolean selected = abstractButton.getModel().isSelected();

                int result1 = Integer.parseInt(inp1) + Integer.parseInt(inp2);
                if (selected) {

                    check2.setVisible(false);

                    button1.addActionListener(
                            new ActionListener() {

                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    // TODO Auto-generated method stub

                                    label1.setText(Integer.toString(result1));

                                    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");

                                }
                            }

                    );
                } else
                    check2.setVisible(true);
            }
        };
        check1.addActionListener(actionListener1);
        ActionListener actionListener2 = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String inp1 = input1.getText();
                String inp2 = input2.getText();
                AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                boolean selected = abstractButton.getModel().isSelected();

                System.out.println(selected);

                int result1 = Integer.parseInt(inp1) - Integer.parseInt(inp2);
                if (selected)

                {
                    check1.setVisible(false);
                    button1.addActionListener(
                            new ActionListener() {

                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    // TODO Auto-generated method stub

                                    label1.setText(Integer.toString(result1));

                                    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");

                                }
                            });
                } else
                    check1.setVisible(true);

            }
        };
        check2.addActionListener(actionListener2);

        label1.setText(result);

        panel1.add(input1);
        panel1.add(check1);
        panel1.add(check2);
        panel1.add(input2);
        panel1.add(button1);
        panel1.add(label1);
        panel1.setSize(400, 50);
        frame1.add(panel1);
        frame1.setSize(800, 200);

        frame1.setVisible(true);
    }
};

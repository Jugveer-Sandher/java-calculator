package calculatorPackage;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Calculator GUI
 * @author Jugveer Sandher
 */
public class CalculatorFrame
        implements ActionListener
{
    JFrame jFram = new JFrame("Calc");
    JTextField textField;
    JButton addB, subB, mulB, divB, equalB, delB, clrB;
    JButton[] nums = new JButton[10];
    JButton[] operators = new JButton[7];
    JPanel panel = new JPanel();
    Calculator calc = new Calculator();

    int operand1 = 0;
    int operand2 = 0;
    int result;
    String operator;

    /**
     * Initializes the GUI
     */
    public void init()
    {
        jFram.setDefaultCloseOperation(jFram.EXIT_ON_CLOSE);
        jFram.setSize(420, 550);
        jFram.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setEditable(false);

        addB = new JButton("+");
        subB = new JButton("-");
        mulB = new JButton("*");
        divB = new JButton("/");
        equalB = new JButton("=");
        delB = new JButton("Delete");
        clrB = new JButton("Clear");

        operators[0] = addB;
        operators[1] = subB;
        operators[2] = mulB;
        operators[3] = divB;
        operators[4] = equalB;
        operators[5] = delB;
        operators[6] = clrB;

        for (int i = 0; i < 7; i++) {
            operators[i].addActionListener(this);
        }

        for (int i = 0; i < 10; i++) {
            nums[i] = new JButton(String.valueOf(i));
            nums[i].addActionListener(this);
        }
        delB.setBounds(50,430,145,50);
        clrB.setBounds(205,430,145,50);
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));

        panel.add(nums[1]);
        panel.add(nums[2]);
        panel.add(nums[3]);
        panel.add(addB);
        panel.add(nums[4]);
        panel.add(nums[5]);
        panel.add(nums[6]);
        panel.add(subB);
        panel.add(nums[7]);
        panel.add(nums[8]);
        panel.add(nums[9]);
        panel.add(mulB);
        panel.add(nums[0]);
        panel.add(equalB);
        panel.add(divB);
        panel.add(new JButton());

        jFram.add(delB);
        jFram.add(clrB);
        jFram.add(panel);
        jFram.add(textField);
        jFram.setVisible(true);
    }

    /**
     * Handles the calculation event
     * @param ev is the event/button pressed
     */
    @Override
    public void actionPerformed(ActionEvent ev) {

        AdditionOperator additionOperator = new AdditionOperator();
        SubtractionOperator subtractionOperator = new SubtractionOperator();
        MultiplicationOperator multiplicationOperator = new MultiplicationOperator();
        DivisionOperator divisionOperator = new DivisionOperator();

        for (int i = 0; i < 10; i++) {
            if (ev.getSource() == nums[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (ev.getSource() == addB) {
            operand1 = Integer.parseInt(textField.getText());
            operator = "+";
            textField.setText("");
        }
        if (ev.getSource() == subB) {
            operand1 = Integer.parseInt(textField.getText());
            operator = "-";
            textField.setText("");
        }
        if (ev.getSource() == mulB) {
            operand1 = Integer.parseInt(textField.getText());
            operator = "*";
            textField.setText("");
        }
        if (ev.getSource() == divB) {
            operand1 = Integer.parseInt(textField.getText());
            operator = "/";
            textField.setText("");
        }

        if (ev.getSource() == equalB) {
            operand2 = Integer.parseInt(textField.getText());
                switch (operator) {
                    case"+":
                        result = additionOperator.calculate(operand1, operand2);
                        break;
                    case"-":
                        result = subtractionOperator.calculate(operand1, operand2);
                        break;
                    case"*":
                        result = multiplicationOperator.calculate(operand1, operand2);
                        break;
                    case"/":
                        result = divisionOperator.calculate(operand1, operand2);
                        break;
                }
                textField.setText(String.valueOf(result));
                operand1 = result;
        }

        if(ev.getSource()==delB) {
            String string = textField.getText();
            textField.setText("");
            for(int i=0;i<string.length()-1;i++) {
                textField.setText(textField.getText()+string.charAt(i));
            }
        }

        if (ev.getSource() == clrB) {
            textField.setText("");
        }
    }
}
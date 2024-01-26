import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.BOLD;
        /*IMPORTANT: For all the trig formulas, you will need to press your number before the specific formula.
        For example if you want sin(1) you will need to press 1 and sin then equal (1 sin =)
        or if you want log(2) you will need to press 2 then log and equal to get the result (2 log =)*/
public class MP3 {
    public static void main(String[] args) {
        // create a string pi that holds pi value
        final String π = "3.14159";


        //create a new frame and set it visibility to true
        JFrame myFrame = new JFrame("Major Program3");
        myFrame.setVisible(true);
        //set the size of the frame, even though it is not necessary
        // because we will pack the frame to fit perfectly
        myFrame.setSize(200, 300);
        //Use GridBagLayout to get our rows and columns as we want
        //Use a background color "Blue"
        myFrame.setLayout(new GridBagLayout());
        myFrame.setBackground(Color.BLUE);

        //create a new object that we will use for layouts
        GridBagConstraints myConst = new GridBagConstraints();
        myConst.fill = GridBagConstraints.HORIZONTAL;

        //use insets to get gaps between buttons
        myConst.insets = new Insets(2, 3, 2, 3);
        //create a new text field that will print the user choices
        JTextField topText = new JTextField();
        myConst.gridx = 0;//initial position
        myConst.gridy = 0;//initial position
        myConst.gridwidth = 5; // span across 3 columns
        myConst.fill = GridBagConstraints.HORIZONTAL; // fill horizontally
        myConst.weightx = 1.0; // take up available horizontal space
        topText.setPreferredSize(new Dimension(200, 30)); // set the preferred size
        topText.setBackground(Color.LIGHT_GRAY);
        //we add the text field created to our frame
        myFrame.add(topText, myConst);

        //We create a text field that will print operations sign such as (+, -, *, /)
        // or trigonometry signs
        JTextField topTextSign = new JTextField();
        topTextSign.setFont(new Font("Arial", BOLD, 20));
        myConst.gridx = 5;
        myConst.gridy = 0;
        myConst.gridwidth = 1; // span across 3 columns
        myConst.fill = GridBagConstraints.HORIZONTAL; // fill horizontally
        myConst.weightx = 1.0; // take up available horizontal space
        topTextSign.setPreferredSize(new Dimension(30, 30));
        topTextSign.setBackground(Color.LIGHT_GRAY);
        myFrame.add(topTextSign, myConst);

        //We create a new Label that prints the word "Result"
        //To specify that the line prints the final result
        JLabel resultOutput = new JLabel("Result:");
        myConst.gridx=0;
        myConst.gridy=1;
        resultOutput.setBackground(Color.LIGHT_GRAY);
        myFrame.add(resultOutput, myConst);

        //Our text field that will print our final result after an operation is performed
        JTextField bottomText = new JTextField();
        bottomText.setFont(new Font("Arial", BOLD, 20));
        myConst.gridx=1;
        myConst.gridy=1;
        myConst.gridwidth = 5; // span across 3 columns
        myConst.fill = GridBagConstraints.HORIZONTAL; // fill horizontally
        myConst.weightx = 1.0; // take up available horizontal space
        bottomText.setPreferredSize(new Dimension(200, 40));
        bottomText.setBackground(Color.LIGHT_GRAY);
        bottomText.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        myFrame.add(bottomText, myConst);

        //The following labels have no information, they are used to create
        //the space between my numerical values and results printing fields
        JLabel label = new JLabel("");
        myConst.gridwidth=6;
        myConst.gridx=0;
        myConst.gridy=2;
        myFrame.add(label, myConst);
        JLabel label2 = new JLabel("");
        myConst.gridwidth=6;
        myConst.gridx=0;
        myConst.gridy=3;
        myFrame.add(label2, myConst);
        JLabel label3 = new JLabel("");
        myConst.gridwidth=6;
        myConst.gridx=0;
        myConst.gridy=4;
        myFrame.add(label3, myConst);

        //We have our "C" button that will clear our text fields
        JButton CButton = new JButton("C");
        CButton.setFont(new Font("Arial", BOLD, 20));
        myConst.gridx=5;
        myConst.gridy=5;
        myConst.gridwidth=1;
        CButton.setBackground(Color.DARK_GRAY);

        myFrame.add(CButton, myConst);
        myConst.insets = new Insets(3, 2, 3, 2);

        //Numerical button and added to the frame
        JButton SevenButton = new JButton("7");
        myConst.gridx=0;
        myConst.gridy=7;

        myFrame.add(SevenButton, myConst);

        //Numerical button and added to the frame
        JButton EightButton = new JButton("8");
        myConst.gridx=1;
        myConst.gridy=7;
        myFrame.add(EightButton, myConst);

        //Numerical button and added to the frame
        JButton NineButton = new JButton("9");
        myConst.gridx=2;
        myConst.gridy=7;
        myFrame.add(NineButton, myConst);

        //Multiplication sign button and added to the frame
        JButton multButton = new JButton("*");
        myConst.gridx=3;
        myConst.gridy=7;
        myFrame.add(multButton, myConst);

        //division sign button and added to the frame
        JButton divButton = new JButton("÷");
        myConst.gridx=4;
        myConst.gridy=7;
        myFrame.add(divButton, myConst);

        //Number squared button and added to the frame
        JButton sqrButton = new JButton("x²");
        myConst.gridx=5;
        myConst.gridy=7;
        myFrame.add(sqrButton, myConst);

        //Numerical button and added to the frame
        JButton fourButton = new JButton("4");
        myConst.gridx=0;
        myConst.gridy=8;
        myFrame.add(fourButton, myConst);

        //Numerical button and added to the frame
        JButton fiveButton = new JButton("5");
        myConst.gridx=1;
        myConst.gridy=8;
        myFrame.add(fiveButton, myConst);

        //Numerical button and added to the frame
        JButton sixButton = new JButton("6");
        myConst.gridx=2;
        myConst.gridy=8;
        myFrame.add(sixButton, myConst);

        //plus sign button and added to the frame
        JButton plusButton = new JButton("+");
        myConst.gridx=3;
        myConst.gridy=8;
        myFrame.add(plusButton, myConst);

        //minus sign button and added to the frame
        JButton minusButton = new JButton("-");
        myConst.gridx=4;
        myConst.gridy=8;
        myFrame.add(minusButton, myConst);

        //number to power 3 button and added to the frame
        JButton cubeButton = new JButton("X³");
        myConst.gridx=5;
        myConst.gridy=8;
        myFrame.add(cubeButton, myConst);

        //Numerical button and added to the frame
        JButton oneButton = new JButton("1");
        myConst.gridx=0;
        myConst.gridy=9;
        myFrame.add(oneButton, myConst);

        //Numerical button and added to the frame
        JButton twoButton = new JButton("2");
        myConst.gridx=1;
        myConst.gridy=9;
        myFrame.add(twoButton, myConst);

        //Numerical button and added to the frame
        JButton threeButton = new JButton("3");
        myConst.gridx=2;
        myConst.gridy=9;
        myFrame.add(threeButton, myConst);

        //equal sign button and added to the frame
        JButton equButton = new JButton("=");
        equButton.setFont(new Font("Arial", BOLD, 16));
        myConst.gridx=3;
        myConst.gridy=9;
        myConst.gridwidth=2;
        equButton.setBackground(Color.WHITE);
        myFrame.add(equButton, myConst);

        //modular button and added to the frame
        JButton modButton = new JButton("Mod");
        myConst.gridx=5;
        myConst.gridy=9;
        modButton.setFont(new Font("Arial", BOLD, 16));
        myConst.gridwidth=1;
        myFrame.add(modButton, myConst);

        //Numerical button and added to the frame
        JButton zeroButton = new JButton("0");
        myConst.gridx=0;
        myConst.gridy=10;
        myConst.gridwidth=1;
        myFrame.add(zeroButton, myConst);

        //division point button and added to the frame
        JButton ptButton = new JButton(".");
        myConst.gridx=1;
        myConst.gridy=10;
        myConst.gridwidth=1;
        myFrame.add(ptButton, myConst);

        //plus or minus button and added to the frame
        JButton plusMinButton = new JButton("±");
        myConst.gridx=2;
        myConst.gridy=10;
        myConst.gridwidth=1;
        myFrame.add(plusMinButton, myConst);

        //1 over a number button and added to the frame
        JButton overNButton = new JButton("1/n");
        myConst.gridx=3;
        myConst.gridy=10;
        myConst.gridwidth=1;
        myFrame.add(overNButton, myConst);

        //percentage button and added to the frame
        JButton percentButton = new JButton("%");
        myConst.gridx=4;
        myConst.gridy=10;
        myConst.gridwidth=1;
        myFrame.add(percentButton, myConst);

        //square root button and added to the frame
        JButton sqRouteButton = new JButton("√");
        myConst.gridx=5;
        myConst.gridy=10;
        myConst.gridwidth=1;
        myFrame.add(sqRouteButton, myConst);

        //label to separate numerical buttons and trigonometry signs
        JLabel label1 =new  JLabel(" ");
        myConst.gridx=0;
        myConst.gridy=11;
        myConst.gridwidth=6;
        label1.setBackground(Color.GRAY);
        myFrame.add(label1, myConst);

        //trigonometry button and added to the frame
        JButton sinButton = new JButton("sin");
        myConst.gridx=0;
        myConst.gridy=12;
        myConst.gridwidth=1;
        sinButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(sinButton, myConst);

        //trigonometry button and added to the frame
        JButton cosButton = new JButton("cos");
        myConst.gridx=1;
        myConst.gridy=12;
        myConst.gridwidth=1;
        cosButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(cosButton, myConst);

        //trigonometry button and added to the frame
        JButton tanButton = new JButton("tan");
        myConst.gridx=2;
        myConst.gridy=12;
        myConst.gridwidth=1;
        tanButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(tanButton, myConst);

        //log button and added to the frame
        JButton logButton = new JButton("log");
        myConst.gridx=3;
        myConst.gridy=12;
        myConst.gridwidth=1;
        logButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(logButton, myConst);

        //ln button and added to the frame
        JButton lnButton = new JButton("ln");
        myConst.gridx=4;
        myConst.gridy=12;
        myConst.gridwidth=3;
        lnButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(lnButton, myConst);

        //trigonometry button and added to the frame
        JButton asinButton = new JButton("asin");
        myConst.gridx=0;
        myConst.gridy=13;
        myConst.gridwidth=1;
        asinButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(asinButton, myConst);

        //trigonometry button and added to the frame
        JButton acosButton = new JButton("acos");
        myConst.gridx=1;
        myConst.gridy=13;
        myConst.gridwidth=1;
        acosButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(acosButton, myConst);

        //trigonometry button and added to the frame
        JButton atanButton = new JButton("atan");
        myConst.gridx=2;
        myConst.gridy=13;
        myConst.gridwidth=1;
        atanButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(atanButton, myConst);

        //trigonometry button and added to the frame
        JButton tenNButton = new JButton("10ⁿ");
        myConst.gridx=3;
        myConst.gridy=13;
        myConst.gridwidth=1;
        tenNButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(tenNButton, myConst);

        //absolute value button and added to the frame
        JButton absButton = new JButton("|n|");
        myConst.gridx=4;
        myConst.gridy=13;
        myConst.gridwidth=2;
        absButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(absButton, myConst);

        //trigonometry button and added to the frame
        JButton hsinButton = new JButton("sinh");
        myConst.gridx=0;
        myConst.gridy=14;
        myConst.gridwidth=1;
        hsinButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(hsinButton, myConst);

        //trigonometry button and added to the frame
        JButton hcosButton = new JButton("cosh");
        myConst.gridx=1;
        myConst.gridy=14;
        myConst.gridwidth=1;
        hcosButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(hcosButton, myConst);

        //trigonometry button and added to the frame
        JButton htanButton = new JButton("tanh");
        myConst.gridx=2;
        myConst.gridy=14;
        myConst.gridwidth=1;
        htanButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(htanButton, myConst);

        //trigonometry button (pi) )and added to the frame
        JButton piButton = new JButton("π");
        myConst.gridx=3;
        myConst.gridy=14;
        myConst.gridwidth=1;
        piButton.setFont(new Font("Arial", Font.PLAIN, 20));
        myFrame.add(piButton, myConst);

        //exit button and added to the frame with red color background
        JButton exitButton = new JButton("EXIT");
        myConst.gridx=4;
        myConst.gridy=14;
        myConst.gridwidth=3;
        exitButton.setBackground(Color.red);
        exitButton.setFont(new Font("Arial", BOLD, 20));
        myFrame.add(exitButton, myConst);

        JLabel lastGap = new JLabel("");
        myConst.gridx=1;
        myConst.gridy=15;
        myConst.gridwidth=6;
        myFrame.add(lastGap, myConst);
        JLabel lastGap1 = new JLabel("");
        myConst.gridx=1;
        myConst.gridy=20;
        myConst.gridwidth=6;
        myConst.gridheight=2;
        myFrame.add(lastGap1, myConst);


        //the following lines are for action performing for the prvious buttons created
        //C to clear the text fields
        CButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                topText.setText("0");
                bottomText.setText("0");
                topTextSign.setText("");


            }
        });
        //exit to exit the program
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                System.exit(0);



            }
        });

        //Buttons from 0-9
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = topText.getText() + oneButton.getText();
                topText.setText(s1);

            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = topText.getText() + twoButton.getText();
                topText.setText(s1);

            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = topText.getText() + threeButton.getText();
                topText.setText(s1);

            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = topText.getText() + fourButton.getText();
                topText.setText(s1);

            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = topText.getText() + fiveButton.getText();
                topText.setText(s1);
            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = topText.getText() + sixButton.getText();
                topText.setText(s1);
            }
        });
        SevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = topText.getText() + SevenButton.getText();
                topText.setText(s1);
            }
        });
        EightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = topText.getText() + EightButton.getText();
                topText.setText(s1);

            }
        });
        NineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = topText.getText() + NineButton.getText();
                topText.setText(s1);

            }
        });
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = topText.getText() + zeroButton.getText();
                topText.setText(s1);

            }
        });

        //decimal point
        ptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = topText.getText() + ptButton.getText();
                topText.setText(s1);

            }
        });

        //pi button (it has a value)
        piButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = topText.getText() + piButton.getText();
                topText.setText(π);

            }
        });

        //Buttons +, -, *, /
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = plusButton.getText();
                double res1;
                    res1= Double.parseDouble(topText.getText());

                    bottomText.setText(""+ res1);
                    topText.setText("");
                    topTextSign.setText("+");
                }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = minusButton.getText();
                double res1;
                res1= Double.parseDouble(topText.getText());

                bottomText.setText(""+ res1);
                topText.setText("");
                topTextSign.setText("-");
            }
        });
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = multButton.getText();
                double res1;
                res1= Double.parseDouble(topText.getText());

                bottomText.setText(""+ res1);
                topText.setText("");
                topTextSign.setText("*");
            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = divButton.getText();
                double res1;
                res1= Double.parseDouble(topText.getText());

                bottomText.setText(""+ res1);
                topText.setText("");
                topTextSign.setText("÷");
            }
        });
        //a number to the power 2
        sqrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = sqrButton.getText();
                double res1;
                res1= Double.parseDouble(topText.getText());

                bottomText.setText(""+ res1);
                topText.setText("");
                topTextSign.setText("X²");
            }
        });
        //a number to the power 3
        cubeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = cubeButton.getText();
                double res1;
                res1= Double.parseDouble(topText.getText());

                bottomText.setText(""+ res1);
                topText.setText("");
                topTextSign.setText("X³");
            }
        });
        //modular button
        modButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = modButton.getText();
                String res1;
                res1= topText.getText();

                bottomText.setText(""+ res1);
                topText.setText("");
                topTextSign.setText("Mod");
            }
        });
        //plus or minus sign to make a number negative is positive
        plusMinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = plusMinButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topText.setText("");
                topTextSign.setText("±");
            }
        });
        //1 over a number
        overNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = overNButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topText.setText("");
                topTextSign.setText("1/n");
            }
        });
        //percentage calculator button
        percentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = percentButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topText.setText("");
                topTextSign.setText("%");
            }
        });
        //square root calculator
        sqRouteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = sqRouteButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("√");
                topText.setText("");

            }
        });
        //trigonometry button sin
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = sinButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("sin");
                topText.setText("");

            }
        });
        //trigonometry button cos
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = cosButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("cos");
                topText.setText("");

            }
        });
        //trigonometry button tan
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = tanButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("tan");
                topText.setText("");

            }
        });
        //trigonometry button log
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = logButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("log");
                topText.setText("");

            }
        });
        //trigonometry button ln
        lnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = lnButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("ln");
                topText.setText("");

            }
        });
        //trigonometry button asin
        asinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = asinButton.getText();

                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("asin");
                topText.setText("");

            }
        });
        //trigonometry button acos
        acosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = acosButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("acos");
                topText.setText("");

            }
        });
        //trigonometry button atan
        atanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = atanButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("atan");
                topText.setText("");

            }
        });
        //10 to the power n button
        tenNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = tenNButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("10ⁿ");
                topText.setText("");

            }
        });
        //absolute value
        absButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = absButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("|n|");
                topText.setText("");

            }
        });
        //trigonometry button sinh
        hsinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = hsinButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("sinh");
                topText.setText("");

            }
        });
        //trigonometry button cosh
        hcosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = hcosButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("cosh");
                topText.setText("");

            }
        });
        //trigonometry button tanh
        htanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = htanButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("tanh");
                topText.setText("");

            }
        });
        //exit button
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seq = exitButton.getText();
                String res1;
                res1= (topText.getText());

                bottomText.setText(""+ res1);
                topTextSign.setText("EXIT");
                topText.setText("");

            }
        });

        //after pressing the equal button, an operation will be performed depending
        //on the sign or trigo sign
            equButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String seq = equButton.getText();
                    double res1 = 0;
                    double res2 = 0;


                    if (topTextSign.getText().equals("+")) {
                        res1 = Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = res2 + res1;

                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");

                    }
                    if (topTextSign.getText().equals("-")) {
                        res1 = Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = res2 - res1;

                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("*")) {
                        res1 = Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = res2 * res1;

                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("÷")) {
                        res1 = Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = res2 / res1;

                        // topText.setText(topText.getText());
                        if( res1 ==0 && res2 ==0){
                            bottomText.setText("Error (0/0)");
                        }
                        else {
                            bottomText.setText("" + result);
                        }
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("X²")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = res2 * res2;

                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");

                    }
                    if (topTextSign.getText().equals("X³")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = res2 * res2 * res2;

                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("Mod")) {
                        res1 = Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = res2 % res1;
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("±")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = res2 * (-1);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("1/n")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = 1 / res2;
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("%")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = res2 / 100;
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("√")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.sqrt(res2);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("sin")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.sin(res2);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("cos")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.cos(res2);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("tan")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.tan(res2);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("log")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.log10(res2);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("ln")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.log(res2);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("asin")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.asin(res2);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("acos")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.acos(res2);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("atan")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.atan(res2);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("10ⁿ")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.pow(10, res2);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("|n|")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.abs(res2);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("sinh")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.sinh(res2);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("cosh")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.cosh(res2);

                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                    if (topTextSign.getText().equals("tanh")) {
                        //res1= Double.parseDouble(topText.getText());
                        res2 = Double.parseDouble(bottomText.getText());
                        double result = Math.tanh(res2);
                        // topText.setText(topText.getText());
                        bottomText.setText("" + result);
                        topText.setText("");
                    }
                }
            });
            //pack our frame to fit based on the buttons and text fields
        myFrame.pack();
    }
}

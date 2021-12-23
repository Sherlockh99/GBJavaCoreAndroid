package lesson3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumber extends JFrame {

    private int randomNumber;
    private static final int NUMBERATTEMPTS = 3;
    private JTextField textField;
    private int attempts = 0;
    boolean end = false;
    private JButton[] jButtons;

    private int GetRandomNumber(){
        return (int)(Math.random() * 10) + 1; // [1 ; 10]
    }


    private void newGame(){
        end = false;
        randomNumber = GetRandomNumber();
        for (int i = 1; i <= 10; i++) {
            jButtons[i-1].setBackground(Color.LIGHT_GRAY);
        }
        textField.setText("Программа загадала число от 1 до 10");
        attempts = 0;
    }

    public GuessNumber() {
        jButtons = new JButton[10];

        randomNumber = GetRandomNumber();

        setTitle("Guess the number");
        setBounds(600, 300, 600, 140);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        textField.setText("Программа загадала число от 1 до 10");

        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 18);
        textField.setFont(font);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(end){
                    newGame();
                }
            }
        });

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 10; i++) {
            jButtons[i-1] = new JButton(String.valueOf(i));
            JButton button = jButtons[i-1];
            //JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);
            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex, button);
                }
            });
        }

        setVisible(true);
    }

    public void tryToAnswer(int answer, JButton button) {
        if(end){
            newGame();
            return;
        }
        attempts++;
        if(answer == randomNumber) {
            textField.setText("Вы угадали! Ответ: " + randomNumber + ". Число попыток: " + attempts);
            button.setBackground(Color.GREEN);
            end = true;
        } else {
            if(answer > randomNumber) {
                textField.setText("Не угадали! Загаданное число меньше");
            } else {
                textField.setText("Не угадали! Загаданное число больше");
            }
            button.setBackground(Color.RED);
            if (attempts==NUMBERATTEMPTS){
                textField.setText("Не угадали! Загаданное число: " + randomNumber + ". Игра окончена.");
                end = true;
            }
        }
    }
}

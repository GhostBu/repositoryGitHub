package com.marcofontana.foodlymaven.view;

import com.marcofontana.foodlymaven.view.jpanels.Cerca;
import com.marcofontana.foodlymaven.view.jpanels.InserisciProdotto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel menuPanel;
    private JPanel contentPanel;

    public MainFrame() {
        // create the menu panel with buttons
        menuPanel = new JPanel();
        JButton buttonInserisciProdotto = new JButton("Inserisci prodotto");
        buttonInserisciProdotto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // show option 1 content
                add(new InserisciProdotto(), BorderLayout.CENTER);
            }
        });
        buttonInserisciProdotto.setFont(new Font("Arial", Font.PLAIN, 14));
        menuPanel.add(buttonInserisciProdotto);

        JButton buttonCerca = new JButton("<html><b>Cerca<b><html>");
        buttonCerca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // show option 2 content
                add(new Cerca(), BorderLayout.CENTER);
            }
        });
        menuPanel.add(buttonCerca);

        // create the content panel
        contentPanel = new JPanel();

        // add the panels to the frame
        setLayout(new BorderLayout());
        add(menuPanel, BorderLayout.NORTH);


        add(contentPanel, BorderLayout.CENTER);

        // set up the frame
        setSize(800, 600);
        setTitle("Menu and Navigation Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}

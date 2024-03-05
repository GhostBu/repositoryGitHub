package com.marcofontana.foodlymaven.view.jpanels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InserisciProdotto extends JFrame {
    public InserisciProdotto() {
        JButton buttonNomeProdotto = new JButton("Inserisci nome prodotto");
        JButton buttonDataConfezionamento = new JButton("Inserisci data confezionamento");

        buttonNomeProdotto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setLayout(new BorderLayout());
        add(new JLabel("Label"), BorderLayout.NORTH);
        add(new JButton("Button"), BorderLayout.SOUTH);
    }
}

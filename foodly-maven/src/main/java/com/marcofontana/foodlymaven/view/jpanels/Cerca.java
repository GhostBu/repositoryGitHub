package com.marcofontana.foodlymaven.view.jpanels;

import javax.swing.*;
import java.awt.*;

public class Cerca extends JFrame {
    public Cerca() {
        setLayout(new BorderLayout());
        add(new JLabel("Label"), BorderLayout.NORTH);
        add(new JButton("Button"), BorderLayout.SOUTH);
    }
}

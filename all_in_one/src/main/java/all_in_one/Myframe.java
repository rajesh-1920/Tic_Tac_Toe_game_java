package all_in_one;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

class active_project extends JFrame {

    void run_clock() {
        SwingUtilities.invokeLater(() -> {

            Clock app = new Clock();
            app.setVisible(true);

        });
    }

    void run_cal() {
        Calculator1 calc = new Calculator1();
    }

    void run_car() {
        Rent_a_car calc = new Rent_a_car();
    }

    void run_game() {
        java.awt.EventQueue.invokeLater(() -> {
            new Tic_Tac_Toe().setVisible(true);
        });
    }

    void run_stop() {
        Stop_watch frame = new Stop_watch();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setVisible(true);
    }

    void run_cgcal() {
        java.awt.EventQueue.invokeLater(() -> {
            new cgcal().setVisible(true);
        });
    }
    JLabel label, project_name, team_name;

    active_project() {

        ImageIcon image = new ImageIcon("C:\\Users\\PC\\Desktop\\mavenproject1\\all_in_one\\src\\main\\java\\all_in_one\\emptyman.jpg");
        label = new JLabel();
        label.setIcon(image);
        label.setBounds(65, 275, 450, 450);

        project_name = new JLabel("");
        project_name.setText("MultyWidgets store");
        project_name.setBounds(240, 10, 500, 300);
        project_name.setVisible(true);

        team_name = new JLabel("");
        team_name.setText("PSTU EmptyBit");
        team_name.setBounds(240, 185, 500, 300);
        team_name.setVisible(true);

        JButton clock = new JButton();
        clock.setBounds(200, 200, 100, 50);
        clock.setText("Clock");
        clock.addActionListener(e -> run_clock());
        clock.setFocusable(false);
        clock.setForeground(Color.WHITE);
        clock.setBackground(Color.GRAY);
        clock.setBorder(BorderFactory.createEtchedBorder());

        JButton calculator = new JButton();
        calculator.setBounds(300, 200, 100, 50);
        calculator.setText("Calculator");
        calculator.addActionListener(e -> run_cal());
        calculator.setFocusable(false);
        calculator.setForeground(Color.WHITE);
        calculator.setBackground(Color.GRAY);
        calculator.setBorder(BorderFactory.createEtchedBorder());

        JButton stop = new JButton();
        stop.setBounds(400, 200, 100, 50);
        stop.setText("Stopwatch");
        stop.addActionListener(e -> run_stop());
        stop.setFocusable(false);
        stop.setForeground(Color.WHITE);
        stop.setBackground(Color.GRAY);
        stop.setBorder(BorderFactory.createEtchedBorder());

        JButton cgcal = new JButton();
        cgcal.setBounds(80, 200, 120, 50);
        cgcal.setText("CGPA Calculator");
        cgcal.addActionListener(e -> run_cgcal());
        cgcal.setFocusable(false);
        cgcal.setForeground(Color.WHITE);
        cgcal.setBackground(Color.GRAY);
        cgcal.setBorder(BorderFactory.createEtchedBorder());

        JButton Game = new JButton();
        Game.setBounds(220, 250, 150, 50);
        Game.setText("Tic Tac Toe");
        Game.addActionListener(e -> run_game());
        Game.setFocusable(false);
        Game.setForeground(Color.WHITE);
        Game.setBackground(Color.GRAY);
        Game.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600, 800);
        this.setVisible(true);
        this.add(clock);
        this.add(calculator);
        this.add(stop);
        this.add(cgcal);
        this.add(Game);
        this.add(project_name);
        this.add(team_name);
        this.add(label);

        //this.setName("PSTU_EmptyBit");
    }

}

public class Myframe {

    public static void main(String[] args) {
        active_project frame = new active_project();
    }
}

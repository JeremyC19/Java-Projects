import javax.swing.*;
import java.time.*;
import java.io.*;
import java.awt.*;
import java.util.logging.Level;

public class GUI extends javax.swing.JFrame {
    private JComboBox<String> Box;
    private javax.swing.JTextField TxtField;

    public GUI() {
        initComponents();
    }

    private void initComponents() {

        Box = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        TxtField = new javax.swing.JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Box.setModel((new javax.swing.DefaultComboBoxModel<>(new String[] {
        "option 1", "option 2", "option 3", "option 4"})));

        Box.addActionListener(this::Action);

        jLabel1.setText("Menu Option");

        TxtField.setText("");
        javax.swing.GroupLayout layout =new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                layout.createSequentialGroup()
                                        .addGap(24,24,24)
                                        .addComponent(jLabel1,javax.swing.GroupLayout.DEFAULT_SIZE,100,
        Short.MAX_VALUE)
                                        .addGap(18,18,18)
                                        .addComponent(Box,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,137,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(133,133,133))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65,65,65)
                                .addComponent(TxtField, GroupLayout.PREFERRED_SIZE,
                                        267, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25,25,25)

                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Box,
                                                GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))

                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 146,
                                        Short.MAX_VALUE)
                                .addComponent((TxtField), GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                        )       .addGap(39,39,39)
                        );

                    pack();

    }

    private void Action(java.awt.event.ActionEvent evt) {

        if(Box.getSelectedItem() == "option 1") {
            ZoneId CLOCK = ZoneId.systemDefault();

            Clock TIMEZONE = Clock.system(CLOCK);

            Instant instant = TIMEZONE.instant();

            ZonedDateTime timeNow = instant.atZone(TIMEZONE.getZone());

            TxtField.setText(timeNow.toString());
        }

        if(Box.getSelectedItem() == "option 2") {

            String FILENAME = "log.txt";
            BufferedWriter bw;
            FileWriter fw;
            try {

                String content = "the option 2 was selected\n";
                fw = new FileWriter(FILENAME);
                bw = new BufferedWriter(fw);
                bw.write(content);

                System.out.println("Done");
                TxtField.setText("text file written");
                bw.close();
                fw.close();
            } catch (IOException e) {

                e.printStackTrace();

            }
        }

        if(Box.getSelectedItem() == "option 3") {
            this.getContentPane().setBackground(Color.ORANGE);


        }
        if(Box.getSelectedItem() == "option 4"){

            System.exit(WIDTH);
        }
    }

    public static void main(String[] args) {

        try {
            for(UIManager.LookAndFeelInfo info:
            javax.swing.UIManager.getInstalledLookAndFeels()) {
                if("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel((info.getClassName()));
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
        | UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(GUI.class.getName()).log(Level.SEVERE,null,ex);
        }

        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }
}

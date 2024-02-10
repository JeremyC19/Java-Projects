import javax.swing.*;
import java.awt.*;

public class BankGUI extends JFrame {
        private Banking myAccount;
        private JButton withdrawButton;
        private JButton depositButton;
        private JLabel amountLabel;
        private JTextField amountTextField;
        private JLabel balanceLabel;
        private JPanel amountPanel;
        private JPanel buttonsPanel;
        private JPanel balancePanel;

        public BankGUI(Banking bankAccount){
            super("Bank Account App");

            myAccount = bankAccount;
            setBounds(300,300,400,150);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            initElements();

            Container container = getContentPane();

            container.add(amountPanel, BorderLayout.NORTH);
            container.add(buttonsPanel);
            container.add(balancePanel, BorderLayout.SOUTH);

            setVisible(true);

        }

        private void initElements(){
            buttonsPanel = new JPanel(new
                    FlowLayout(FlowLayout.CENTER));

            withdrawButton = new JButton("Withdraw");
            depositButton = new JButton("Deposit");

            withdrawButton.addActionListener(action -> {
                if (!validateAmount()) {
                    return;
                }

                myAccount.withdraw(getAmount());
                updateBalanceLabel();
            });

            depositButton.addActionListener(action -> {
                if (!validateAmount()) {
                    return;
                }

                myAccount.deposit(getAmount());
                updateBalanceLabel();
            });

            buttonsPanel.add(depositButton);
            buttonsPanel.add(withdrawButton);

            amountPanel = new JPanel(new
                    FlowLayout(FlowLayout.CENTER));
            amountLabel = new JLabel("Amount");

            amountTextField = new JTextField();
            amountTextField.setColumns(5);

            amountPanel.add(amountLabel);
            amountPanel.add(amountTextField);

            balancePanel = new JPanel(new
                    FlowLayout(FlowLayout.CENTER));
            balanceLabel = new JLabel(
                    "Starting Balance = 0"
            );

            balancePanel.add(balanceLabel);
            ;

        }

        private double getAmount() {
            String amountTxt = amountTextField.getText();
            return Double.parseDouble(amountTxt);
        }

        private void updateBalanceLabel() {
            balanceLabel.setText("New Balance = "
            + myAccount.getBalance());

        }

        private boolean validateAmount() {
            String amountTxt = amountTextField.getText();
            if (amountTxt.length() == 0) {
                JOptionPane.showMessageDialog(null,
                        "Please Enter Amount!",
                        "Message", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }

            try {
                Double.parseDouble(amountTxt);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Enter a positive number",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            double value = Double.parseDouble(amountTxt);

            if (value < 0) {
                JOptionPane.showMessageDialog(null,
                        "Amount must be positive",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true;
        }

}

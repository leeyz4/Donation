import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class DonationApp extends Frame implements ActionListener {
    private TextField fullNameField, emailField, contactField;
    private Label fullNameLabel, emailLabel, contactLabel;
    private Button submitButton;
    private Frame donationFrame;

    public DonationApp() {
        fullNameLabel = new Label("Full Name: ");
        fullNameField = new TextField(25);

        emailLabel = new Label("Email Address: ");
        emailField = new TextField(30);

        contactLabel = new Label("Contact Number: ");
        contactField = new TextField(30);

        submitButton = new Button("Submit");

        add(fullNameLabel);
        add(fullNameField);
        add(emailLabel);
        add(emailField);
        add(contactLabel);
        add(contactField);
        add(submitButton);

        submitButton.addActionListener(this);

        setLayout(new GridLayout(4, 2));
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            donationFrame = new DonationOptions();
        }
    }

    public static void main(String[] args) {
        DonationApp donationApp = new DonationApp();
    }
}

class DonationOptions extends Frame {
    private Button organizationButton, donationButton;

    public DonationOptions() {
        organizationButton = new Button("Organizations");
        donationButton = new Button("Donations");

        add(organizationButton);
        add(donationButton);

        organizationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle organization button click
            }
        });

        donationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle donation button click
            }
        });

        setLayout(new GridLayout(2, 1));
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        DonationOptions donationOptions = new DonationOptions();
    }
}
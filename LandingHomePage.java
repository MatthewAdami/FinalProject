package Main_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class LandingHomePage {

	JFrame LandingHomePageframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandingHomePage window = new LandingHomePage();
					window.LandingHomePageframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LandingHomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LandingHomePageframe = new JFrame();
		LandingHomePageframe.getContentPane().setBackground(new Color(255, 235, 235));
		LandingHomePageframe.setBackground(new Color(255, 235, 235));
		LandingHomePageframe.setBounds(100, 100, 1250, 870);
		LandingHomePageframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LandingHomePageframe.getContentPane().setLayout(null);
		
		// Create a JButton object for the sign-up button
		JButton signUpbutton = new JButton("");
		signUpbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Create a SignUp object and make the sign-up frame visible
				SignUpandSignIn window = new SignUpandSignIn();
				window.signupframe.setVisible(true);
				// Dispose the LandingHomePage frame
				LandingHomePageframe.dispose();
			}
		});
		
		JButton signInbutton = new JButton("Login");
		signInbutton.setFont(new Font("Dialog", Font.BOLD, 21));
		signInbutton.setForeground(new Color(255, 255, 255));
		signInbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpandSignIn window = new SignUpandSignIn();
				window.signupframe.setVisible(true);
				LandingHomePageframe.dispose();
			}
		});
		
		JButton createaccountbutton = new JButton("Get Started");
		createaccountbutton.setBackground(new Color(246, 186, 111));
		createaccountbutton.setFont(new Font("Dialog", Font.BOLD, 20));
		createaccountbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpandSignIn window = new SignUpandSignIn();
				window.signupframe.setVisible(true);
				LandingHomePageframe.dispose();
			}
		});
		
		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(LandingHomePage.class.getResource("/images/SYSTEMLOGO 1.png")));
		Logo.setBounds(48, 11, 190, 96);
		LandingHomePageframe.getContentPane().add(Logo);
		createaccountbutton.setBounds(123, 528, 211, 43);
		LandingHomePageframe.getContentPane().add(createaccountbutton);
		
		signInbutton.setBorder(null);
		signInbutton.setBackground(new Color(19, 0, 90));
		signInbutton.setBounds(990, 35, 63, 23);
		LandingHomePageframe.getContentPane().add(signInbutton);
		
		signUpbutton.setIcon(new ImageIcon(LandingHomePage.class.getResource("/images/Frame 18.png")));
		signUpbutton.setBounds(1063, 25, 122, 39);
		LandingHomePageframe.getContentPane().add(signUpbutton);
		
		JLabel LandingHomePagebg = new JLabel("");
		LandingHomePagebg.setIcon(new ImageIcon(LandingHomePage.class.getResource("/images/LandingPage.png")));
		LandingHomePagebg.setBounds(0, 0, 1250, 870);
		LandingHomePageframe.getContentPane().add(LandingHomePagebg);
	}
}

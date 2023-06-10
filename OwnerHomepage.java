package Main_Project;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class OwnerHomepage extends JFrame {

	JFrame ownerhomepage;
	JPanel MenuPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OwnerHomepage window = new OwnerHomepage();
					window.ownerhomepage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OwnerHomepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ownerhomepage = new JFrame();
		ownerhomepage.setBounds(100, 100, 1250, 898);
		ownerhomepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ownerhomepage.getContentPane().setLayout(null);

		JButton viewpetprofile = new JButton("");
		viewpetprofile.setBackground(new Color(240, 240, 240));
		viewpetprofile.setBorder(null);
		viewpetprofile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PetProfile window = new PetProfile();
				window.petProfileFrame.setVisible(true);
				ownerhomepage.dispose();
			}
		});
		MenuPanel = new JPanel();
		MenuPanel.setBackground(new Color(255, 255, 255));
		MenuPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(23, 23, 23)));
		MenuPanel.setBounds(1027, 122, 197, 195);
		MenuPanel.setVisible(false);
		ownerhomepage.getContentPane().add(MenuPanel, BorderLayout.NORTH);
		MenuPanel.setLayout(null);

		Font MenuButtonFont = null;
		try {
			MenuButtonFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\NunitoSans_7pt_Condensed-Bold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		JButton MyProfileButton = new JButton("My Profile");
		MyProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ownerprofile window = new Ownerprofile();
				window.ownerframe.setVisible(true);
				ownerhomepage.dispose();
			}
		});
		MyProfileButton.setBorderPainted(false);
		MyProfileButton.setHorizontalAlignment(JButton.LEFT);
		MyProfileButton.setFont((MenuButtonFont.deriveFont(Font.BOLD, 16)));
		MyProfileButton.setBackground(new Color(255, 255, 255));
		MyProfileButton.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 0)));
		MyProfileButton
				.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/images/OwnersProfileSign.png")));
		MyProfileButton.setBounds(10, 25, 177, 38);
		MenuPanel.add(MyProfileButton);

		JButton UsersManualButton = new JButton("User's Manual");
		UsersManualButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserManual usermanual = new UserManual();
				UserManual.main(null);
				ownerhomepage.dispose();
			}
		});
		UsersManualButton.setBorderPainted(false);
		UsersManualButton.setHorizontalAlignment(JButton.LEFT);
		UsersManualButton.setFont((MenuButtonFont.deriveFont(Font.BOLD, 16)));
		UsersManualButton.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		UsersManualButton.setBackground(new Color(255, 255, 255));
		UsersManualButton
				.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/images/UserManualSign.png")));
		UsersManualButton.setBounds(20, 74, 177, 38);
		MenuPanel.add(UsersManualButton);

		JButton SignoutButton = new JButton("Sign Out");
		SignoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", "Confirmation",
						JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {

					ownerhomepage.dispose();

				}

			}
		});
		SignoutButton.setBorderPainted(false);
		SignoutButton.setHorizontalAlignment(JButton.LEFT);
		SignoutButton.setFont((MenuButtonFont.deriveFont(Font.BOLD, 16)));
		SignoutButton.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		SignoutButton.setBackground(new Color(255, 255, 255));
		SignoutButton.setIcon(new ImageIcon(KnownConditionandAllergies.class.getResource("/images/SigoutSign.png")));
		SignoutButton.setBounds(10, 127, 177, 38);
		MenuPanel.add(SignoutButton);

		JButton MenuButton = new JButton("");
		MenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean isMenuPanelVisible = MenuPanel.isVisible();
                MenuPanel.setVisible(!isMenuPanelVisible);
			}
		});
		MenuButton.setIcon(new ImageIcon(OwnerHomepage.class.getResource("/images/Signoutmyprofile.png")));
		MenuButton.setBorderPainted(false);
		MenuButton.setBorder(null);
		MenuButton.setBackground(new Color(19, 0, 90));
		MenuButton.setBounds(1054, 41, 135, 54);
		ownerhomepage.getContentPane().add(MenuButton);
		viewpetprofile.setIcon(new ImageIcon(OwnerHomepage.class.getResource("/images/Frame 124.png")));
		viewpetprofile.setBounds(135, 692, 991, 130);
		ownerhomepage.getContentPane().add(viewpetprofile);
		
		

		JButton addpetbutton = new JButton("");
		addpetbutton.setBackground(new Color(240, 240, 240));
		addpetbutton.setBorder(null);
		addpetbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addpets window = new Addpets();
				window.addpetframe.setVisible(true);
				ownerhomepage.dispose();
			}
		});
		addpetbutton.setIcon(new ImageIcon(OwnerHomepage.class.getResource("/images/Frame 123.png")));
		addpetbutton.setBounds(127, 526, 999, 130);
		ownerhomepage.getContentPane().add(addpetbutton);

		JLabel ownerhomepagelbl = new JLabel("");
		ownerhomepagelbl.setIcon(new ImageIcon(OwnerHomepage.class.getResource("/images/ownerrhomepage.png")));
		ownerhomepagelbl.setBounds(0, 0, 1250, 870);
		ownerhomepage.getContentPane().add(ownerhomepagelbl);

		JLabel aboutuslbl = new JLabel("");
		aboutuslbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutUs window = new AboutUs();
				AboutUs.main(null);
				ownerhomepage.dispose();
			}
		});
		aboutuslbl.setBounds(361, 41, 78, 38);
		ownerhomepage.getContentPane().add(aboutuslbl);
		
		JLabel contactus = new JLabel("");
		contactus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ContactUS window = new ContactUS();
				window.contactUs.setVisible(true);
				ownerhomepage.dispose();
			}
		});
		contactus.setBounds(449, 51, 125, 31);
		ownerhomepage.getContentPane().add(contactus);
	}
	
}

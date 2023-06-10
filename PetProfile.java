package Main_Project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PetProfile extends JFrame {

	private ArrayList<String> data;
	JFrame petProfileFrame;
	JLabel nameDisplay, bdayDisplay, ageDisplay, genderDisplay, breedDisplay, colorDisplay, petTypeDisplay,
			MicrochipDisplay, registerednameDisplay;
	private JButton immunizationsdewormingbutton;
	private JButton ConditionAllergies;
	private JPanel HeaderPanel;
	private JLabel Logo;
	private JLabel HomeLabel;
	private JLabel AboutLabel;
	private JLabel ContactUsLabel;
	private JLabel petprofiledisplay;
	private JButton SaveDataButton;
	private JButton FindDatabutton;
	private JLabel dataLabel;
	private JButton clearData;
	private JPanel MenuPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PetProfile window = new PetProfile();
					window.petProfileFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PetProfile() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		petProfileFrame = new JFrame();
		petProfileFrame.setBounds(100, 100, 1250, 870);
		petProfileFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font EditbuttonFont = null;
		try {
			EditbuttonFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\ZenMaruGothic-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(EditbuttonFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		JButton editPetProfilebutton = new JButton("Edit Pet Profile");
		editPetProfilebutton.setBounds(94, 661, 334, 49);
		editPetProfilebutton.setFont(EditbuttonFont.deriveFont(Font.BOLD, 15));
		editPetProfilebutton.setBackground(new Color(21, 1, 90));
		editPetProfilebutton.setForeground(new Color(240, 240, 240));
		editPetProfilebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditPets window = new EditPets();
				window.editpetsframe.setVisible(true);
				petProfileFrame.dispose();
			}
		});

		immunizationsdewormingbutton = new JButton("");
		immunizationsdewormingbutton.setBounds(350, 161, 365, 24);
		immunizationsdewormingbutton.setBackground(new Color(240, 240, 240));
		immunizationsdewormingbutton.setBorder(null);
		immunizationsdewormingbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImmunizationsDeworming immunizationsdeworming = new ImmunizationsDeworming();
				immunizationsdeworming.setVisible(true);
				petProfileFrame.dispose();
			}
		});

		ConditionAllergies = new JButton("");
		ConditionAllergies.setBounds(744, 161, 365, 24);
		ConditionAllergies.setBackground(new Color(240, 240, 240));
		ConditionAllergies.setBorder(null);
		ConditionAllergies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KnownConditionandAllergies window = new KnownConditionandAllergies();
				window.KnownAllergiesAndConditionframe.setVisible(true);
				petProfileFrame.dispose();
			}
		});
		petProfileFrame.getContentPane().setLayout(null);
		Font MenuButtonFont = null;
		try {
			MenuButtonFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\NunitoSans_7pt_Condensed-Bold.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		MenuPanel = new JPanel();
		MenuPanel.setBounds(1037, 114, 197, 195);
		petProfileFrame.getContentPane().add(MenuPanel);
		MenuPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		MenuPanel.setBackground(new Color(255, 255, 255));
		MenuPanel.setLayout(null);

		JButton MyProfileButton = new JButton("Owner's Profile ");
		MyProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ownerprofile window = new Ownerprofile();
				window.ownerframe.setVisible(true);
				petProfileFrame.dispose();
			}
		});
		MyProfileButton.setHorizontalAlignment(JButton.LEFT);
		MyProfileButton.setBackground(new Color(255, 255, 255));
		MyProfileButton.setBorderPainted(false);
		MyProfileButton.setFont((MenuButtonFont.deriveFont(Font.BOLD, 16)));
		MyProfileButton
				.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/images/OwnersProfileSign.png")));
		MyProfileButton.setBounds(10, 44, 177, 38);
		MenuPanel.add(MyProfileButton);

		JButton UsersManualButton = new JButton("User's Manual");
		UsersManualButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserManual usermanual = new UserManual();
				UserManual.main(null);
				petProfileFrame.dispose();
			}
		});
		UsersManualButton.setBackground(new Color(255, 255, 255));
		UsersManualButton.setHorizontalAlignment(JButton.LEFT);
		UsersManualButton.setBorderPainted(false);
		UsersManualButton.setFont((MenuButtonFont.deriveFont(Font.BOLD, 16)));
		UsersManualButton
				.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/images/UserManualSign.png")));
		UsersManualButton.setBounds(10, 85, 177, 40);
		MenuPanel.add(UsersManualButton);

		JButton SignOutButton = new JButton("Sign Out");
		SignOutButton.setHorizontalAlignment(JButton.LEFT);
		SignOutButton.setBackground(new Color(255, 255, 255));
		SignOutButton.setBorderPainted(false);
		SignOutButton.setFont((MenuButtonFont.deriveFont(Font.BOLD, 16)));
		SignOutButton.setIcon(new ImageIcon(ImmunizationsDeworming.class.getResource("/images/SigoutSign.png")));
		SignOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", "Confirmation",
						JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {

					petProfileFrame.dispose();

				}
			}
		});
		SignOutButton.setBounds(10, 136, 177, 33);
		MenuPanel.add(SignOutButton);
		MenuPanel.setVisible(false);

		HeaderPanel = new JPanel();
		HeaderPanel.setBounds(0, 0, 1234, 115);
		HeaderPanel.setBackground(new Color(21, 1, 90));
		HeaderPanel.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(19, 0, 90)));
		petProfileFrame.getContentPane().add(HeaderPanel);
		HeaderPanel.setLayout(null);

		Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(PetProfile.class.getResource("/images/SYSTEMLOGO 1.png")));
		Logo.setBounds(10, 11, 192, 81);
		HeaderPanel.add(Logo);
		Font HeaderFont = null;
		try {
			HeaderFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\ZenMaruGothic-Regular.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(HeaderFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		HomeLabel = new JLabel("Home");
		HomeLabel.setForeground(new Color(240, 240, 240));
		HomeLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OwnerHomepage window = new OwnerHomepage();
				window.ownerhomepage.setVisible(true);
				petProfileFrame.dispose();
			}
		});
		HomeLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
		HomeLabel.setBounds(290, 41, 118, 27);
		HeaderPanel.add(HomeLabel);

		AboutLabel = new JLabel("About");
		AboutLabel.setForeground(new Color(240, 240, 240));
		AboutLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutUs window = new AboutUs();
				AboutUs.main(null);
				petProfileFrame.dispose();
			}
		});
		AboutLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
		AboutLabel.setBounds(402, 41, 118, 27);
		HeaderPanel.add(AboutLabel);

		ContactUsLabel = new JLabel("Contact Us");
		ContactUsLabel.setForeground(new Color(240, 240, 240));
		ContactUsLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ContactUS window = new ContactUS();
				window.contactUs.setVisible(true);
				petProfileFrame.dispose();
			}
		});

		ContactUsLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
		ContactUsLabel.setBounds(530, 41, 118, 27);
		HeaderPanel.add(ContactUsLabel);

		JButton MenuButton = new JButton("");
		MenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MenuPanel != null) {
					boolean isMenuPanelVisible = MenuPanel.isVisible();
					MenuPanel.setVisible(!isMenuPanelVisible);
				}
			}
		});
		MenuButton.setIcon(new ImageIcon(PetProfile.class.getResource("/images/Signoutmyprofile.png")));
		MenuButton.setBorderPainted(false);
		MenuButton.setBorder(null);
		MenuButton.setBackground(new Color(19, 0, 90));
		MenuButton.setBounds(1070, 26, 135, 54);
		HeaderPanel.add(MenuButton);

		registerednameDisplay = new JLabel("");
		registerednameDisplay.setBounds(506, 347, 324, 38);
		registerednameDisplay.setFont(new Font("Dialog", Font.BOLD, 20));
		petProfileFrame.getContentPane().add(registerednameDisplay);
		ConditionAllergies.setIcon(new ImageIcon(PetProfile.class.getResource("/images/knownallergies.png")));
		petProfileFrame.getContentPane().add(ConditionAllergies);
		immunizationsdewormingbutton
				.setIcon(new ImageIcon(PetProfile.class.getResource("/images/RegularDeworming.png")));
		petProfileFrame.getContentPane().add(immunizationsdewormingbutton);
		petProfileFrame.getContentPane().add(editPetProfilebutton);

		Font nameDisplayFont = null;
		try {
			nameDisplayFont = Font.createFont(Font.TRUETYPE_FONT,
					new File("C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\PatuaOne-Regular.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(nameDisplayFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		nameDisplay = new JLabel("");
		nameDisplay.setBounds(492, 245, 698, 64);
		nameDisplay.setFont(nameDisplayFont.deriveFont(Font.BOLD, 48));
		nameDisplay.setBorder(null);
		petProfileFrame.getContentPane().add(nameDisplay);

		Font DisplayFont = null;
		try {
			DisplayFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\ZenMaruGothic-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(DisplayFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		Font DisplayLabelFont = null;
		try {
			DisplayLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\ZenMaruGothic-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(DisplayLabelFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		bdayDisplay = new JLabel("");
		bdayDisplay.setBounds(679, 538, 273, 35);
		petProfileFrame.getContentPane().add(bdayDisplay);
		bdayDisplay.setFont(DisplayFont.deriveFont(Font.BOLD, 20));
		bdayDisplay.setBorder(null);

		Font SaveandFindbuttonFont = null;
		try {
			SaveandFindbuttonFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\ZenMaruGothic-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(SaveandFindbuttonFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		SaveDataButton = new JButton("Save Your Data");
		SaveDataButton.setBounds(982, 693, 175, 31);
		SaveDataButton.setFont(SaveandFindbuttonFont.deriveFont(Font.BOLD, 15));
		SaveDataButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				exportData();

			}
		});
		SaveDataButton.setForeground(new Color(232, 236, 237));
		SaveDataButton.setBackground(new Color(21, 1, 90));
		petProfileFrame.getContentPane().add(SaveDataButton);

		FindDatabutton = new JButton("Find Your Data");
		FindDatabutton.setBounds(777, 693, 175, 31);
		FindDatabutton.setFont(SaveandFindbuttonFont.deriveFont(Font.BOLD, 15));
		FindDatabutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				importData();

			}
		});
		FindDatabutton.setForeground(new Color(255, 255, 255));
		FindDatabutton.setBackground(new Color(246, 186, 111));
		petProfileFrame.getContentPane().add(FindDatabutton);
		ageDisplay = new JLabel("");
		ageDisplay.setBounds(982, 538, 152, 35);
		petProfileFrame.getContentPane().add(ageDisplay);
		ageDisplay.setFont(DisplayFont.deriveFont(Font.BOLD, 20));
		ageDisplay.setBorder(null);

		genderDisplay = new JLabel("");
		genderDisplay.setBounds(496, 538, 159, 35);
		petProfileFrame.getContentPane().add(genderDisplay);
		genderDisplay.setFont(DisplayFont.deriveFont(Font.BOLD, 20));
		genderDisplay.setBorder(null);

		colorDisplay = new JLabel("");
		colorDisplay.setBounds(506, 446, 353, 35);
		petProfileFrame.getContentPane().add(colorDisplay);
		colorDisplay.setFont(DisplayFont.deriveFont(Font.BOLD, 20));
		colorDisplay.setBorder(null);

		breedDisplay = new JLabel("");
		breedDisplay.setBounds(492, 627, 664, 35);
		petProfileFrame.getContentPane().add(breedDisplay);
		breedDisplay.setFont(DisplayFont.deriveFont(Font.BOLD, 20));
		breedDisplay.setBorder(null);

		dataLabel = new JLabel("");
		dataLabel.setBounds(474, 325, 711, 348);
		dataLabel.setIcon(new ImageIcon(PetProfile.class.getResource("/images/Frame 101.png")));
		petProfileFrame.getContentPane().add(dataLabel);

		MicrochipDisplay = new JLabel("");
		MicrochipDisplay.setBounds(861, 347, 295, 38);
		MicrochipDisplay.setFont(new Font("Dialog", Font.BOLD, 20));
		petProfileFrame.getContentPane().add(MicrochipDisplay);

		petTypeDisplay = new JLabel("");
		petTypeDisplay.setBounds(889, 443, 267, 38);
		petTypeDisplay.setFont(new Font("Dialog", Font.BOLD, 20));
		petProfileFrame.getContentPane().add(petTypeDisplay);

		petprofiledisplay = new JLabel("");
		petprofiledisplay.setBounds(96, 245, 332, 335);
		petProfileFrame.getContentPane().add(petprofiledisplay);
		petprofiledisplay.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));

		JButton petprofile = new JButton("Edit Pet Picture");
		petprofile.setBounds(97, 601, 334, 49);
		petprofile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				int option = fileChooser.showOpenDialog(PetProfile.this);
				if (option == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					ImageIcon imageIcon = new ImageIcon(file.getPath());
					Image image = imageIcon.getImage().getScaledInstance(332, 335, Image.SCALE_SMOOTH);
					petprofiledisplay.setIcon(new ImageIcon(image));

				}
			}
		});
		petprofile.setBackground(new Color(246, 186, 111));
		petprofile.setFont(new Font("Dialog", Font.BOLD, 15));
		petProfileFrame.getContentPane().add(petprofile);

		clearData = new JButton("Clear Data");
		clearData.setBackground(new Color(240, 240, 240));
		clearData.setBounds(562, 696, 175, 31);
		clearData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearData();
			}
		});
		clearData.setForeground(new Color(21, 1, 90));
		clearData.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(21, 1, 90)));
		clearData.setFont(new Font("Dialog", Font.BOLD, 20));
		petProfileFrame.getContentPane().add(clearData);

		JLabel lineboarder = new JLabel("");
		lineboarder.setBounds(55, 208, 1140, 617);
		lineboarder.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		petProfileFrame.getContentPane().add(lineboarder);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(246, 186, 111));
		panel.setBounds(117, 145, 192, 64);
		petProfileFrame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton petprofilebutton = new JButton("");
		petprofilebutton.setBounds(28, 11, 131, 29);
		panel.add(petprofilebutton);
		petprofilebutton.setBackground(new Color(246, 186, 111));
		petprofilebutton.setIcon(new ImageIcon(PetProfile.class.getResource("/images/Profile.png")));
		petprofilebutton.setBorder(null);
		getContentPane().setLayout(null);
	}

	private void exportData() {

		String filePath = "C:\\Users\\mateo\\eclipse-workspace\\PetsData";
		String fileName = JOptionPane.showInputDialog(petProfileFrame, "Enter file name:");
		if (fileName == null || fileName.trim().isEmpty()) {
			JOptionPane.showMessageDialog(petProfileFrame, "File name is empty or canceled.");
			return;
		}

		File file = new File(filePath, fileName + ".txt");

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));

			writer.write(nameDisplay.getText());
			writer.newLine();
			writer.write(MicrochipDisplay.getText());
			writer.newLine();
			writer.write(registerednameDisplay.getText());
			writer.newLine();
			writer.write(colorDisplay.getText());
			writer.newLine();
			writer.write("" + genderDisplay.getText());
			writer.newLine();
			writer.write(bdayDisplay.getText());
			writer.newLine();
			writer.write(ageDisplay.getText());
			writer.newLine();
			writer.write(petTypeDisplay.getText());
			writer.newLine();
			writer.write("" + breedDisplay.getText());
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void importData() {

		String fileName = JOptionPane.showInputDialog(petProfileFrame, "Enter file name:");

		if (fileName == null || fileName.trim().isEmpty()) {
			JOptionPane.showMessageDialog(petProfileFrame, "File name is empty or canceled.");
			return;
		}
		String folderPath = "C:\\Users\\mateo\\eclipse-workspace\\PetsData";
		String filePath = folderPath + "\\" + fileName + ".txt";
		File file = new File(filePath);

		if (!file.exists()) {
			JOptionPane.showMessageDialog(petProfileFrame, "File does not exist.");
			return;
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String Petname = reader.readLine();
			String Microchip = reader.readLine();
			String RegisteredName = reader.readLine();
			String Color = reader.readLine();
			String Gender = reader.readLine();
			String Birthday = reader.readLine();
			String Age = reader.readLine();
			String Type = reader.readLine();
			String Breed = reader.readLine();

			// Set the imported data to the corresponding components
			nameDisplay.setText(Petname);
			MicrochipDisplay.setText(Microchip);
			registerednameDisplay.setText(RegisteredName);
			colorDisplay.setText(Color);
			genderDisplay.setText(Gender);
			bdayDisplay.setText(Birthday);
			ageDisplay.setText(Age);
			petTypeDisplay.setText(Type);
			breedDisplay.setText(Breed);

			JOptionPane.showMessageDialog(petProfileFrame, "Data imported successfully.");
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(petProfileFrame, "Error occurred while importing data.");
		}

	}

	private void displayData() {
		StringBuilder sb = new StringBuilder();
		for (String item : data) {
			sb.append(item);
			sb.append("\n");
		}

	}

	private void clearData() {
		nameDisplay.setText("");
		MicrochipDisplay.setText("");
		registerednameDisplay.setText("");
		colorDisplay.setText("");
		genderDisplay.setText("");
		bdayDisplay.setText("");
		ageDisplay.setText("");
		petTypeDisplay.setText("");
		breedDisplay.setText("");
	}
}

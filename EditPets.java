package Main_Project;

import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JComboBox;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.*;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;

public class EditPets extends JFrame {

	JFrame editpetsframe;
	private JTextField editpetnamefield;
	private JTextField editpetagefield;
	private JTextField editpetbreedfield;
	private JTextField editcolortextfield;
	private JTextField editbirthdaytextfield;
	private JComboBox<String> editpetgenderfield, editpettypefield;
	private JLabel Logo;
	private JLabel InpuDataLabel;
	private JLabel colorLAbel;
	private JLabel breedLabel;
	private JLabel sexLabel;
	private JLabel AgeLabel;
	private JLabel bdayLabel;
	private JLabel nameLabel;
	private JButton inputButton;
	private JButton ClearButton;
	private JPanel panel;
	private JButton choosepet;
	private JTextField editmicrochiptextfield;
	private JTextField editregisterednamefield;
	private JLabel petsdisplay;
	private JLabel filloutlbl;
	private JLabel pawlbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditPets window = new EditPets();
					window.editpetsframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditPets() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		editpetsframe = new JFrame();
		editpetsframe.setBounds(100, 100, 830, 797);
		editpetsframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		editpetsframe.getContentPane().setBackground(new Color(240, 240, 240));
		editpetsframe.getContentPane().setLayout(null);

		Font FieldsFont = null;
		try {
			FieldsFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\ZenMaruGothic-Regular.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(FieldsFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		// Create a new JTextField for entering birthday information
		editbirthdaytextfield = new JTextField();
		editbirthdaytextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		editbirthdaytextfield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		editbirthdaytextfield.setColumns(10);
		editbirthdaytextfield.setBackground(new Color(232, 237, 236));
		editbirthdaytextfield.setBounds(276, 464, 296, 38);
		editpetsframe.getContentPane().add(editbirthdaytextfield);
		editbirthdaytextfield.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculateAge();
			}
		});

		editpetnamefield = new JTextField();
		editpetnamefield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		editpetnamefield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		editpetnamefield.setBackground(new Color(232, 237, 236));
		editpetnamefield.setBounds(75, 303, 382, 36);
		editpetsframe.getContentPane().add(editpetnamefield);
		editpetnamefield.setColumns(10);

		editpetagefield = new JTextField();
		editpetagefield.setEditable(false);
		editpetagefield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		editpetagefield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		editpetagefield.setBackground(new Color(232, 237, 236));
		editpetagefield.setBounds(582, 464, 182, 38);
		editpetsframe.getContentPane().add(editpetagefield);
		editpetagefield.setColumns(10);

		editpetgenderfield = new JComboBox<String>();

		editpetgenderfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		editpetgenderfield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		editpetgenderfield.setBackground(new Color(232, 236, 237));
		editpetgenderfield.setBounds(75, 465, 182, 36);
		editpetgenderfield.addItem("Male");
		editpetgenderfield.addItem("Female");
		editpetsframe.getContentPane().add(editpetgenderfield);

		editpetbreedfield = new JTextField();
		editpetbreedfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		editpetbreedfield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		editpetbreedfield.setBackground(new Color(232, 237, 236));
		editpetbreedfield.setBounds(349, 531, 415, 38);
		editpetsframe.getContentPane().add(editpetbreedfield);
		editpetbreedfield.setColumns(10);

		editcolortextfield = new JTextField();
		editcolortextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		editcolortextfield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		editcolortextfield.setBackground(new Color(232, 237, 236));
		editcolortextfield.setBounds(426, 381, 338, 38);
		editpetsframe.getContentPane().add(editcolortextfield);
		editcolortextfield.setColumns(10);

		Font HeaderFont = null;
		try {
			HeaderFont = Font.createFont(Font.TRUETYPE_FONT,
					new File("C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\PTSans-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(HeaderFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		Font LabelsFont = null;
		try {
			LabelsFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\ZenMaruGothic-Medium.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(LabelsFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		colorLAbel = new JLabel("Color");
		colorLAbel.setForeground(new Color(19, 0, 90));
		colorLAbel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		colorLAbel.setBounds(426, 358, 127, 21);
		editpetsframe.getContentPane().add(colorLAbel);

		breedLabel = new JLabel("Breed");
		breedLabel.setForeground(new Color(19, 0, 90));
		breedLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		breedLabel.setBounds(349, 507, 127, 21);
		editpetsframe.getContentPane().add(breedLabel);

		sexLabel = new JLabel("Sex");
		sexLabel.setForeground(new Color(19, 0, 90));
		sexLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		sexLabel.setBounds(75, 442, 127, 21);
		editpetsframe.getContentPane().add(sexLabel);

		AgeLabel = new JLabel("Age");
		AgeLabel.setForeground(new Color(19, 0, 90));
		AgeLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		AgeLabel.setBounds(582, 442, 127, 21);
		editpetsframe.getContentPane().add(AgeLabel);

		bdayLabel = new JLabel("Date of Birth");
		bdayLabel.setForeground(new Color(19, 0, 90));
		bdayLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		bdayLabel.setBounds(276, 442, 127, 21);
		editpetsframe.getContentPane().add(bdayLabel);

		nameLabel = new JLabel("Name");
		nameLabel.setForeground(new Color(19, 0, 90));
		nameLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		nameLabel.setBounds(75, 271, 127, 21);
		editpetsframe.getContentPane().add(nameLabel);

		Font buttonFont = null;
		try {
			buttonFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\ZenMaruGothic-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(buttonFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		inputButton = new JButton("Input all");
		inputButton.setFont((buttonFont.deriveFont(Font.BOLD, 14)));
		inputButton.setBackground(new Color(19, 0, 90));
		inputButton.setForeground(new Color(255, 255, 255));
		inputButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Set the values in the PetProfile instance

				String petname = editpetnamefield.getText();
				String petmicrochip = editmicrochiptextfield.getText();
				String petregistered = editregisterednamefield.getText();
				String petcolor = editcolortextfield.getText();
				String petgender = editpetgenderfield.getSelectedItem().toString();
				String petbday = editbirthdaytextfield.getText();
				String petage = editpetagefield.getText();			
				String pettype = editpettypefield.getSelectedItem().toString();
				String petbreed = editpetbreedfield.getText();
				
				if (petname.isEmpty() || petmicrochip.isEmpty() || petregistered.isEmpty() || petbday.isEmpty()
						|| petage.isEmpty() || petgender.isEmpty() || pettype.isEmpty() || petbreed.isEmpty()
						|| petcolor.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Field Error",
							JOptionPane.ERROR_MESSAGE);
				} else {

					PetProfile petwindow = new PetProfile();
					petwindow.nameDisplay.setText(petname);
					petwindow.MicrochipDisplay.setText(petmicrochip);
					petwindow.registerednameDisplay.setText(petregistered);
					petwindow.colorDisplay.setText(petcolor);
					petwindow.genderDisplay.setText(petgender);
					petwindow.bdayDisplay.setText(petbday);
					petwindow.ageDisplay.setText(petage);				
					petwindow.petTypeDisplay.setText(pettype);
					petwindow.breedDisplay.setText(petbreed);
					
					petwindow.petProfileFrame.setVisible(true);
					editpetsframe.dispose();

				}

			}
		});
		inputButton.setBounds(445, 580, 284, 49);
		editpetsframe.getContentPane().add(inputButton);

		ClearButton = new JButton("Clear Data");
		ClearButton.setFont((buttonFont.deriveFont(Font.BOLD, 14)));
		ClearButton.setForeground(new Color(19, 0, 90));
		ClearButton.setBackground(new Color(246, 186, 111));
		ClearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				clearFields();

			}
		});
		ClearButton.setBounds(96, 580, 284, 49);
		editpetsframe.getContentPane().add(ClearButton);

		panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(19, 0, 90)));
		panel.setBackground(new Color(21, 1, 90));
		panel.setBounds(0, 0, 1233, 116);
		editpetsframe.getContentPane().add(panel);
		panel.setLayout(null);

		Logo = new JLabel("");
		Logo.setBounds(320, 17, 190, 96);
		panel.add(Logo);
		Logo.setIcon(new ImageIcon(Addpets.class.getResource("/images/SYSTEMLOGO 1.png")));

		InpuDataLabel = new JLabel("Edit a Pet Record");
		InpuDataLabel.setBounds(268, 150, 319, 40);
		editpetsframe.getContentPane().add(InpuDataLabel);
		InpuDataLabel.setForeground(new Color(0, 0, 0));
		InpuDataLabel.setFont(new Font("Dialog", Font.PLAIN, 40));

		editmicrochiptextfield = new JTextField();
		editmicrochiptextfield.setFont(new Font("Zen Maru Gothic", Font.BOLD, 13));
		editmicrochiptextfield.setColumns(10);
		editmicrochiptextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		editmicrochiptextfield.setBackground(new Color(232, 237, 236));
		editmicrochiptextfield.setBounds(476, 304, 288, 36);
		editpetsframe.getContentPane().add(editmicrochiptextfield);

		editregisterednamefield = new JTextField();
		editregisterednamefield.setFont(new Font("Zen Maru Gothic", Font.BOLD, 13));
		editregisterednamefield.setColumns(10);
		editregisterednamefield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		editregisterednamefield.setBackground(new Color(232, 237, 236));
		editregisterednamefield.setBounds(75, 381, 341, 38);
		editpetsframe.getContentPane().add(editregisterednamefield);

		JLabel lblRegisteredName = new JLabel("Registered Name");
		lblRegisteredName.setForeground(new Color(19, 0, 90));
		lblRegisteredName.setFont(new Font("Zen Maru Gothic Medium", Font.BOLD, 14));
		lblRegisteredName.setBounds(75, 350, 127, 21);
		editpetsframe.getContentPane().add(lblRegisteredName);

		JLabel lblMicrochipRegistrationNumber = new JLabel("Microchip/ Registration Number");
		lblMicrochipRegistrationNumber.setForeground(new Color(0, 0, 0));
		lblMicrochipRegistrationNumber.setFont(new Font("Zen Maru Gothic Medium", Font.BOLD, 14));
		lblMicrochipRegistrationNumber.setBounds(476, 277, 253, 21);
		editpetsframe.getContentPane().add(lblMicrochipRegistrationNumber);

		editpettypefield = new JComboBox<String>();
		editpettypefield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		editpettypefield.setBounds(75, 534, 253, 36);
		editpettypefield.addItem("Dog");
		editpettypefield.addItem("Cat");
		editpetsframe.getContentPane().add(editpettypefield);

		JLabel petlbl = new JLabel("Pet Type");
		petlbl.setForeground(new Color(19, 0, 90));
		petlbl.setFont(new Font("Zen Maru Gothic Medium", Font.BOLD, 14));
		petlbl.setBounds(75, 513, 127, 21);
		editpetsframe.getContentPane().add(petlbl);
		
		petsdisplay = new JLabel("");
		petsdisplay.setIcon(new ImageIcon(Addpets.class.getResource("/images/pets.png")));
		petsdisplay.setBounds(0, 600, 830, 149);
		editpetsframe.getContentPane().add(petsdisplay);
		
		filloutlbl = new JLabel("Fill out all of the information required below.");
		filloutlbl.setFont(new Font("Dialog", Font.BOLD, 20));
		filloutlbl.setBounds(205, 198, 439, 23);
		editpetsframe.getContentPane().add(filloutlbl);
		
		pawlbl = new JLabel("");
		pawlbl.setIcon(new ImageIcon(Addpets.class.getResource("/images/paw.png")));
		pawlbl.setBounds(189, 250, 449, 339);
		editpetsframe.getContentPane().add(pawlbl);
		JFileChooser fileChooser = new JFileChooser("C:\\Users\\mateo\\eclipse-workspace\\PetsData");
        fileChooser.setDialogTitle("Choose Pet File");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));

        int userSelection = fileChooser.showOpenDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File petFile = fileChooser.getSelectedFile();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(petFile));
                String PetName = reader.readLine();
				String PetMicro = reader.readLine();
				String Petregistered = reader.readLine();
				String PetColor = reader.readLine();
				String PetGender = reader.readLine();
				String PetDate = reader.readLine();
				String PetAge = reader.readLine();		
				String PetType = reader.readLine();
				String PetBreed = reader.readLine();
                reader.close();

                editpetnamefield.setText(PetName);
                editmicrochiptextfield.setText(PetMicro);
                editregisterednamefield.setText(Petregistered);
        		editcolortextfield.setText(PetColor);
        		editpetgenderfield.setSelectedItem(PetGender);
        		editbirthdaytextfield.setText(PetDate);
        		editpetagefield.setText(PetAge);
        		editpettypefield.setSelectedItem(PetType);
        		editpetbreedfield.setText(PetBreed);
               
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }	

	}

	private void clearFields() {
		// Clear the text fields
		editpetnamefield.setText("");
		editmicrochiptextfield.setText("");
		editregisterednamefield.setText("");
		editcolortextfield.setText("");
		editpetgenderfield.setSelectedIndex(0);
		editbirthdaytextfield.setText("");
		editpetagefield.setText("");
		editpettypefield.setSelectedIndex(0);
		editpetbreedfield.setText("");

	}

	private void calculateAge() {
		String birthdayText = editbirthdaytextfield.getText();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date birthday = dateFormat.parse(birthdayText);
			Instant instant = birthday.toInstant();
			ZoneId zone = ZoneId.systemDefault();
			LocalDate birthDate = instant.atZone(zone).toLocalDate();
			LocalDate today = LocalDate.now();
			Period period = Period.between(birthDate, today);
			int age = period.getYears();
			editpetagefield.setText(String.valueOf(age));
		} catch (Exception e) {
			// Handle invalid date format or other exceptions
			editpetagefield.setText("Invalid Date");
		}
	}
}

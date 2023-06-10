package Main_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.border.MatteBorder;
import javax.swing.JPanel;

public class Ownerinfo extends JFrame{

	JFrame ownerinfoframe;
	private JTextField nameJTextfield;
	private JTextField numberJTextfield;
	private JTextField adressJTextfield;
	private JLabel Logo;
	private JLabel FullNameLabel;
	private JLabel PhoneNumberLabel;
	private JLabel AddressLabel;
	private JLabel ownerdatalbl;
	private JButton inputdatabttn;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ownerinfo window = new Ownerinfo();
					window.ownerinfoframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ownerinfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ownerinfoframe = new JFrame();
		ownerinfoframe.getContentPane().setBackground(new Color(240, 240, 240));
		ownerinfoframe.setBounds(100, 100, 615, 729);
		ownerinfoframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ownerinfoframe.getContentPane().setLayout(null);
		
		Font fieldFont = null;
        try {
        	fieldFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\ZenMaruGothic-Regular.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(fieldFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
		
		
		nameJTextfield = new JTextField();
		nameJTextfield.setFont(fieldFont.deriveFont(Font.BOLD, 14));
		nameJTextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		nameJTextfield.setBackground(new Color(232, 237, 236));
		nameJTextfield.setBounds(64, 339, 491, 38);
		ownerinfoframe.getContentPane().add(nameJTextfield);
		nameJTextfield.setColumns(10);

		numberJTextfield = new JTextField();
		numberJTextfield.setFont(fieldFont.deriveFont(Font.BOLD, 14));
		numberJTextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		numberJTextfield.setBackground(new Color(232, 237, 236));
		numberJTextfield.setColumns(10);
		numberJTextfield.setBounds(64, 410, 491, 38);
		ownerinfoframe.getContentPane().add(numberJTextfield);
		numberJTextfield.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) {
                    e.consume(); 
                    return;
                }            
                String currentText = numberJTextfield.getText();

             
                if (currentText.length() >= 11) {
                    e.consume(); 
                    return;
                }
                if (currentText.isEmpty() && c != '0') {
                    e.consume(); 
                }
            }

			
		});
		
		adressJTextfield = new JTextField();
		adressJTextfield.setFont(fieldFont.deriveFont(Font.BOLD, 14));
		adressJTextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		adressJTextfield.setBackground(new Color(232, 237, 236));
		adressJTextfield.setColumns(10);
		adressJTextfield.setBounds(64, 495, 491, 69);
		ownerinfoframe.getContentPane().add(adressJTextfield);
		
		 Font LabelFont = null;
         try {
        	 LabelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\ZenMaruGothic-Medium.ttf"));
             GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
             ge.registerFont(LabelFont);
         } catch (FontFormatException | IOException e) {
             e.printStackTrace();
         }
         
		FullNameLabel = new JLabel("Full Name");
		FullNameLabel.setForeground(new Color(19, 0, 90));
		FullNameLabel.setFont(LabelFont.deriveFont(Font.BOLD, 16));
		FullNameLabel.setBounds(64, 315, 400, 14);
		ownerinfoframe.getContentPane().add(FullNameLabel);
		
		PhoneNumberLabel = new JLabel("Phone Number");
		PhoneNumberLabel.setForeground(new Color(19, 0, 90));
		PhoneNumberLabel.setFont(LabelFont.deriveFont(Font.BOLD, 16));
		PhoneNumberLabel.setBounds(64, 388, 400, 14);
		ownerinfoframe.getContentPane().add(PhoneNumberLabel);
		
		AddressLabel = new JLabel("Address");
		AddressLabel.setForeground(new Color(19, 0, 90));
		AddressLabel.setFont(LabelFont.deriveFont(Font.BOLD, 16));
		AddressLabel.setBounds(64, 470, 105, 14);
		ownerinfoframe.getContentPane().add(AddressLabel);
		
		 Font InputDataLabelFont = null;
         try {
        	 InputDataLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\PatuaOne-Regular.ttf"));
             GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
             ge.registerFont(InputDataLabelFont);
         } catch (FontFormatException | IOException e) {
             e.printStackTrace();
         }
		
		ownerdatalbl = new JLabel("Owner Profile");
		ownerdatalbl.setForeground(new Color(0, 0, 0));
		ownerdatalbl.setFont(InputDataLabelFont.deriveFont(Font.BOLD, 24));
		ownerdatalbl.setBounds(64, 198, 216, 28);
		ownerinfoframe.getContentPane().add(ownerdatalbl);
		
		Font ButtonlFont = null;
        try {
        	ButtonlFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\ZenMaruGothic-Medium.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(ButtonlFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
		inputdatabttn = new JButton("Enter All Data");
		inputdatabttn.setFont(InputDataLabelFont.deriveFont(Font.BOLD, 14));
		inputdatabttn.setBackground(new Color(19, 0, 90));
		inputdatabttn.setForeground(new Color(255, 255, 255));
		inputdatabttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputname = nameJTextfield.getText();
				String inputadress = adressJTextfield.getText();
				String inputnumber = numberJTextfield.getText();
				Ownerprofile window = new Ownerprofile();
				window.ownerframe.setVisible(true);
				window.nameLabel.setText(inputname);
				window.adressLabel.setText(inputadress);
				window.phoneLabel.setText(inputnumber);
				window.ownerframe.setVisible(true);
				ownerinfoframe.dispose();
			}
		});
			
		inputdatabttn.setBounds(315, 607, 240, 49);
		ownerinfoframe.getContentPane().add(inputdatabttn);
		
		JLabel filloutlbl = new JLabel("Fill out all of the information required below.");
		filloutlbl.setFont(new Font("Dialog", Font.BOLD, 17));
		filloutlbl.setForeground(Color.BLACK);
		filloutlbl.setBounds(64, 237, 440, 28);
		ownerinfoframe.getContentPane().add(filloutlbl);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(19, 0, 90));
		header.setBounds(0, 0, 599, 116);
		ownerinfoframe.getContentPane().add(header);
		header.setLayout(null);
		
		
		Logo = new JLabel("");
		Logo.setBounds(200, 11, 190, 96);
		header.add(Logo);
		Logo.setIcon(new ImageIcon(Ownerinfo.class.getResource("/images/SYSTEMLOGO 1.png")));
		
		btnNewButton = new JButton("Clear Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearData();
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(246, 186, 111));
		btnNewButton.setBounds(64, 608, 240, 49);
		ownerinfoframe.getContentPane().add(btnNewButton);
	}
	public void clearData() {
		nameJTextfield.setText("");
		numberJTextfield.setText("");
		adressJTextfield.setText("");
	}
}

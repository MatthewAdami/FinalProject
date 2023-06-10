package Main_Project;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;

public class AddDataForm {
    JFrame AddDataformframe;
    private JTextField medicineField;
    private JTextField conditionField;
    private JTextField allergiesField;
    private KnownConditionandAllergies mainApp;
    private JLabel medicineLabel;
    private JLabel conditionLabel;
    private JLabel allergiesLabel;
    private JLabel logo;
    private JLabel inputNewDataLabel;
    private JPanel HEADERPANEL;
    private JLabel Petpics;
    private AddDataForm addDataForm;

    /**
     * @wbp.parser.constructor
     */
    public AddDataForm(KnownConditionandAllergies app) {
        mainApp = app;
        initialize();
    }

    public AddDataForm(DefaultTableModel model) {
        // TODO Auto-generated constructor stub
    }

    private void initialize() {
        AddDataformframe = new JFrame();
        AddDataformframe.setBounds(100, 100, 1023, 776);
        AddDataformframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        AddDataformframe.getContentPane().setLayout(null);


        Font customFont = loadFont("C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\ZenMaruGothic-Black.ttf");
        Font labelFont = customFont.deriveFont(Font.PLAIN, 14); // Customize the font size and style as needed


       

        medicineField = new JTextField();
        medicineField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        medicineField.setBackground(new Color(232, 237, 236));
        medicineField.setBounds(486, 377, 489, 40);
        medicineField.setFont(labelFont);
        AddDataformframe.getContentPane().add(medicineField);
        medicineField.setColumns(10);

        conditionField = new JTextField();
        conditionField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        conditionField.setBackground(new Color(232, 237, 236));
        conditionField.setBounds(486, 445, 489, 40);
        conditionField.setFont(labelFont);
        AddDataformframe.getContentPane().add(conditionField);
        conditionField.setColumns(10);

        allergiesField = new JTextField();
        allergiesField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        allergiesField.setBackground(new Color(232, 237, 236));
        allergiesField.setBounds(489, 508, 489, 40);
        allergiesField.setFont(labelFont);
        AddDataformframe.getContentPane().add(allergiesField);
        allergiesField.setColumns(10);

        JButton addDataButton = new JButton("Input all");
        addDataButton.setForeground(new Color(255, 255, 255));
        addDataButton.setBackground(new Color(19, 0, 90));
        addDataButton.setBounds(805, 573, 170, 40);
        addDataButton.setFont(labelFont);
        AddDataformframe.getContentPane().add(addDataButton);
        addDataButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        
 
                String Illnes = medicineField.getText();
                String Description = conditionField.getText();
                String Drugstaken = allergiesField.getText();

                mainApp.addInfoFromForm( Illnes, Description, Drugstaken);
                
                AddDataformframe.dispose();
            }
        });

        JButton clearButton = new JButton("Clear Data");
        clearButton.setBackground(new Color(246, 186, 111));
        clearButton.setForeground(new Color(0, 0, 0));
        clearButton.setBounds(576, 573, 170, 40);
        clearButton.setFont(labelFont);
        AddDataformframe.getContentPane().add(clearButton);

        medicineLabel = new JLabel("Pet's Illness: ");
        medicineLabel.setBounds(486, 351, 106, 25);
        medicineLabel.setFont(labelFont); // Set the custom font
        AddDataformframe.getContentPane().add(medicineLabel);

        conditionLabel = new JLabel("Pet's Description: ");
        conditionLabel.setBounds(486, 414, 230, 25);
        conditionLabel.setFont(labelFont); // Set the custom font
        AddDataformframe.getContentPane().add(conditionLabel);

        allergiesLabel = new JLabel("Drugs Takken: ");
        allergiesLabel.setBounds(486, 484, 106, 25);
        allergiesLabel.setFont(labelFont); // Set the custom font
        AddDataformframe.getContentPane().add(allergiesLabel);

        Font inputFont = loadFont("C:\\Users\\mateo\\eclipse-workspace\\PROJECT\\src\\Main_Project\\PatuaOne-Regular.ttf");
        inputNewDataLabel = new JLabel("");
        inputNewDataLabel.setIcon(new ImageIcon(AddDataForm.class.getResource("/images/Group 114.png")));
        inputNewDataLabel.setForeground(new Color(19, 0, 90));
        inputNewDataLabel.setFont((inputFont.deriveFont(Font.BOLD, 36))); // Set the custom font
        inputNewDataLabel.setBounds(484, 196, 491, 117);
        AddDataformframe.getContentPane().add(inputNewDataLabel);
        
        HEADERPANEL = new JPanel();
        HEADERPANEL.setBackground(new Color(19, 0, 90));
        HEADERPANEL.setBounds(0, 0, 1007, 116);
        AddDataformframe.getContentPane().add(HEADERPANEL);
                HEADERPANEL.setLayout(null);
        
                logo = new JLabel("");
                logo.setBounds(410, 11, 190, 96);
                HEADERPANEL.add(logo);
                logo.setIcon(new ImageIcon(AddDataForm.class.getResource("/images/SYSTEMLOGO 1.png")));
                
                Petpics = new JLabel("");
                Petpics.setIcon(new ImageIcon(AddDataForm.class.getResource("/images/Group 115.png")));
                Petpics.setBounds(7, 115, 469, 572);
                AddDataformframe.getContentPane().add(Petpics);

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
    }

    private Font loadFont(String fontPath) {
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            return font;
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void clearFields() {
     
        medicineField.setText("");
        conditionField.setText("");
        allergiesField.setText("");
    }

    public void show() {
    	AddDataformframe.setVisible(true);
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
    

}
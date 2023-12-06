package cl.inacap.jtableconpopupswingapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class StartFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartFrame() {
		setTitle("JTableConPopUpSwingApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 614, 339);
		contentPane.add(table);
		popUpTable(); //Finalmente se llama al m�todo aqu� (De esta forma queda reconocido el PopUp).
	}
	
	public void popUpTable(){
		JPopupMenu pm = new JPopupMenu(); //Aca se crea el PopUp (La ventana).
		JMenuItem mi = new JMenuItem("Agregar", new ImageIcon("Imagenes/add.png")); //Aca se crea un JMenuItem (Para luego a�adirlo al PopUp).
		mi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { //Aca va el c�digo que se ejecuta cuando se selecciona este JMenuItem (Ac� se podr�a tomar los datos de la celda seleccinada y realizar una acci�n).
				JOptionPane.showMessageDialog(null, "Seleccionaste el mensaje");	
			}
		});
		pm.add(mi); //Aca se le a�ade el JMenuItem al PopUp.
		table.setComponentPopupMenu(pm); //Aca se le a�ade el PopUp al JTable.
	}
}

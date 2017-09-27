package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import org.apache.commons.lang3.ArrayUtils;
import java.util.Map;
import java.util.HashMap;
import java.awt.Toolkit;
import java.awt.Canvas;
import javax.swing.JSpinner;

@SuppressWarnings("unused")
public class ui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6788127232277162765L;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui frame = new ui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public ui() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ui.class.getResource("/src/logo_notext.png")));
		String[] elements = {"H", "He", "Li", "Be", "B", "C", "O", "N", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K","Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pa", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Eb", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Rd", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og"};
		Map<String, String> bond_cations = new HashMap<String, String>();
		Map<String, String> bond_anions = new HashMap<String, String>();
		String[] cation_names = {"Lithium", "Beryllium", "Sodium", "Magnesium", "Silicon", "Germanium", "Potassium", "Calcium", "Rubidium", "Strontium", "Cesium", "Barium", "Francium", "Radium", "Boron"};
		String[] anion_names = {" Nitride", " Phosphide", " Arsenide", " Antimonide", " Oxide", " Sulfide", " Selenide", " Polonide", " Fluoride", " Chloride", " Bromide", " Iodide", " Astatide", " Tennesside"};
		double[] elneg = {2.20, 0.00, 0.98, 1.57, 2.04, 2.55, 3.04, 3.44, 3.98, 0.00, 0.93, 1.31, 1.61, 1.90, 2.19, 2.58, 3.16, 0.00, 0.82, 1.00, 1.36, 1.54, 1.63, 1.66, 1.55, 1.83, 1.88, 1.91, 1.90, 1.65, 1.81, 2.01, 2.18, 2.55, 2.96, 3.00, 0.82, 0.95, 1.22, 1.33, 1.60, 2.16, 1.90, 2.20, 2.28, 2.20, 1.93, 1.69, 1.78, 1.96, 2.05, 2.10, 2.66, 2.60, 0.79, 0.89, 1.10, 1.12, 1.13, 1.14, 1.13, 1.17, 1.20, 1.20, 1.22, 1.23, 1.24, 1.24, 1.25, 1.10, 1.27, 1.30, 1.50, 2.36, 1.90, 2.20, 2.20, 2.28, 2.54, 2.00, 1.62, 2.33, 2.02, 2.00, 2.20, 0.00, 0.70, 0.89, 1.10, 1.30, 1.50, 1.38, 1.36, 1.28, 1.30, 1.30, 1.30, 1.30, 1.30, 1.30, 1.30, 1.30, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00};
		String[] anions = {"N", "P", "As", "Sb", "O", "S", "Se", "Po", "F", "Cl", "Br", "I", "At", "Ts"};
		String[] cations = {"Li", "Be", "Na", "Mg", "Si", "Ge", "K", "Ca", "Rb", "Sr", "Cs", "Ba", "Fr", "Ra", "B"};
		for (int x = 0; x < anions.length; x++){
			bond_anions.put(anions[x], anion_names[x]);
		}
		for (int x = 0; x < cations.length; x++){
			bond_cations.put(cations[x], cation_names[x]);
		}
		int[] aox = {-3, -3, -3, -3, -2, -2, -2, -2, -2, -1, -1, -1, -1, -1, -1};
		int[] caox = {1, 2, 1, 2, 4, 4, 1, 2, 1, 2, 1, 2, 1, 2, 3};
		setTitle("JBOND v0.4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1121, 732);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());	
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("H");
		btnNewButton.setBounds(38, 78, 58, 58);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setToolTipText("<html>Hydrogen<br>Atomic Number: 1<br>Electronegativity Value: 2.20</html>");
		contentPane.add(btnNewButton);
		
		JButton btnLi = new JButton("Li");
		btnLi.setBounds(38, 136, 58, 58);
		btnLi.setBackground(Color.RED);
		btnLi.setToolTipText("<html>Lithium<br>Atomic Number: 3<br>Electronegativity Value: 0.98</html>");
		contentPane.add(btnLi);
		
		JButton btnNa = new JButton("Na");
		btnNa.setBounds(38, 194, 58, 58);
		btnNa.setBackground(Color.RED);
		btnNa.setToolTipText("<html>Sodium<br>Atomic Number: 11<br>Electronegativity Value: 0.93</html>");
		contentPane.add(btnNa);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(38, 252, 58, 58);
		btnK.setBackground(Color.RED);
		btnK.setToolTipText("<html>Potassium<br>Atomic Number: 19<br>Electronegativity Value: 0.82</html>");
		contentPane.add(btnK);
		
		JButton btnRb = new JButton("Rb");
		btnRb.setBounds(38, 310, 58, 58);
		btnRb.setBackground(Color.RED);
		btnRb.setToolTipText("<html>Rubidium<br>Atomic Number: 37<br>Electronegativity Value: 0.82</html>");
		contentPane.add(btnRb);
		
		JButton btnCs = new JButton("Cs");
		btnCs.setBounds(38, 368, 58, 58);
		btnCs.setBackground(Color.RED);
		btnCs.setToolTipText("<html>Cesium<br>Atomic Number: 55<br>Electronegativity Value: 0.79</html>");
		contentPane.add(btnCs);
		
		JButton btnFr = new JButton("Fr");
		btnFr.setBounds(38, 426, 58, 58);
		btnFr.setBackground(Color.RED);
		btnFr.setToolTipText("<html>Francium<br>Atomic Number: 87<br>Electronegativity Value: 0.70</html>");
		contentPane.add(btnFr);
		
		JButton btnBe = new JButton("Be");
		btnBe.setBounds(96, 136, 58, 58);
		btnBe.setBackground(new Color(0, 0, 0));
		btnBe.setToolTipText("<html>Beryllium<br>Atomic Number: 4<br>Electronegativity Value: 1.57</html>");
		contentPane.add(btnBe);
		
		JButton btnRa = new JButton("Ra");
		btnRa.setBounds(96, 426, 58, 58);
		btnRa.setBackground(new Color(0, 0, 0));
		btnRa.setToolTipText("<html>Radium<br>Atomic Number: 88<br>Electronegativity Value: 0.89</html>");
		contentPane.add(btnRa);
		
		JButton btnRf = new JButton("Rf");
		btnRf.setBounds(212, 426, 58, 58);
		btnRf.setBackground(Color.YELLOW);
		btnRf.setToolTipText("<html>Rutherfordium<br>Atomic Number: 104<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnRf);
		
		JButton btnDb = new JButton("Db");
		btnDb.setBounds(270, 426, 58, 58);
		btnDb.setBackground(Color.YELLOW);
		btnDb.setToolTipText("<html>Dubnium<br>Atomic Number: 105<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnDb);
		
		JButton btnSg = new JButton("Sg");
		btnSg.setBounds(328, 426, 58, 58);
		btnSg.setBackground(Color.YELLOW);
		btnSg.setToolTipText("<html>Seaborgium<br>Atomic Number: 106<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnSg);
		
		JButton btnBh = new JButton("Bh");
		btnBh.setBounds(386, 426, 58, 58);
		btnBh.setBackground(Color.YELLOW);
		btnBh.setToolTipText("<html>Bohrium<br>Atomic Number: 107<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnBh);
		
		JButton btnHs = new JButton("Hs");
		btnHs.setBounds(444, 426, 58, 58);
		btnHs.setBackground(Color.YELLOW);
		btnHs.setToolTipText("<html>Hassium<br>Atomic Number: 108<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnHs);
		
		JButton btnMt = new JButton("Mt");
		btnMt.setBounds(502, 426, 58, 58);
		btnMt.setBackground(Color.YELLOW);
		btnMt.setToolTipText("<html>Meitnerium<br>Atomic Number: 109<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnMt);
		
		JButton btnDs = new JButton("Ds");
		btnDs.setBounds(560, 426, 58, 58);
		btnDs.setBackground(Color.YELLOW);
		btnDs.setToolTipText("<html>Darmstadtium<br>Atomic Number: 110<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnDs);
		
		JButton btnRg = new JButton("Rg");
		btnRg.setBounds(618, 426, 58, 58);
		btnRg.setBackground(Color.YELLOW);
		btnRg.setToolTipText("<html>Roentgenium<br>Atomic Number: 111<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnRg);
		
		JButton btnCn = new JButton("Cn");
		btnCn.setBounds(676, 426, 58, 58);
		btnCn.setBackground(Color.YELLOW);
		btnCn.setToolTipText("<html>Copernicium<br>Atomic Number: 112<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnCn);
		
		JButton btnNh = new JButton("Nh");
		btnNh.setBounds(734, 426, 58, 58);
		btnNh.setBackground(Color.GREEN);
		btnNh.setToolTipText("<html>Nihonium<br>Atomic Number: 113<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnNh);
		
		JButton btnFl = new JButton("Fl");
		btnFl.setBounds(792, 426, 58, 58);
		btnFl.setBackground(Color.GREEN);
		btnFl.setToolTipText("<html>Flerovium<br>Atomic Number: 114<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnFl);
		
		JButton btnMc = new JButton("Mc");
		btnMc.setBounds(850, 426, 58, 58);
		btnMc.setBackground(Color.GREEN);
		btnMc.setToolTipText("<html>Moscovium<br>Atomic Number: 115<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnMc);
		
		JButton btnLv = new JButton("Lv");
		btnLv.setBounds(908, 426, 58, 58);
		btnLv.setBackground(Color.GREEN);
		btnLv.setToolTipText("<html>Livermorium<br>Atomic Number: 116<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnLv);
		
		JButton btnTs = new JButton("Ts");
		btnTs.setBounds(966, 426, 58, 58);
		btnTs.setBackground(Color.CYAN);
		btnTs.setToolTipText("<html>Tennessine<br>Atomic Number: 117<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnTs);
		
		JButton btnOg = new JButton("Og");
		btnOg.setBounds(1024, 426, 58, 58);
		btnOg.setBackground(new Color(128, 0, 128));
		btnOg.setToolTipText("<html>Oganesson<br>Atomic Number: 118<br>Electronegativity Value: N/A</html>");
		contentPane.add(btnOg);
		
		JButton btnBa = new JButton("Ba");
		btnBa.setBounds(96, 368, 58, 58);
		btnBa.setBackground(new Color(0, 0, 0));
		btnBa.setToolTipText("<html>Barium<br>Atomic Number: 56<br>Electronegativity Value: 0.89</html>");
		contentPane.add(btnBa);
		
		JButton btnMg = new JButton("Mg");
		btnMg.setBounds(96, 194, 58, 58);
		btnMg.setBackground(new Color(0, 0, 0));
		btnMg.setToolTipText("<html>Magnesium<br>Atomic Number: 12<br>Electronegativity Value: 1.31</html>");
		contentPane.add(btnMg);
		
		JButton btnCa = new JButton("Ca");
		btnCa.setBounds(96, 252, 58, 58);
		btnCa.setBackground(new Color(0, 0, 0));
		btnCa.setToolTipText("<html>Calcium<br>Atomic Number: 20<br>Electronegativity Value: 1.00</html>");
		contentPane.add(btnCa);
		
		JButton btnSr = new JButton("Sr");
		btnSr.setBounds(96, 310, 58, 58);
		btnSr.setBackground(new Color(0, 0, 0));
		btnSr.setToolTipText("<html>Strontium<br>Atomic Number: 38<br>Electronegativity Value: 0.95</html>");
		contentPane.add(btnSr);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(154, 310, 58, 58);
		btnY.setBackground(Color.YELLOW);
		btnY.setToolTipText("<html>Yttrium<br>Atomic Number: 39<br>Electronegativity Value: 1.22</html>");
		contentPane.add(btnY);
		
		JButton btnSc = new JButton("Sc");
		btnSc.setBounds(154, 252, 58, 58);
		btnSc.setBackground(Color.YELLOW);
		btnSc.setToolTipText("<html>Scandium<br>Atomic Number: 21<br>Electronegativity Value: 1.36</html>");
		contentPane.add(btnSc);
		
		JButton btnTi = new JButton("Ti");
		btnTi.setBounds(212, 252, 58, 58);
		btnTi.setBackground(Color.YELLOW);
		btnTi.setToolTipText("<html>Titanium<br>Atomic Number: 22<br>Electronegativity Value: 1.54</html>");
		contentPane.add(btnTi);
		
		JButton btnZr = new JButton("Zr");
		btnZr.setBounds(212, 310, 58, 58);
		btnZr.setBackground(Color.YELLOW);
		btnZr.setToolTipText("<html>Zirconium<br>Atomic Number: 40<br>Electronegativity Value: 1.33</html>");
		contentPane.add(btnZr);
		
		JButton btnHf = new JButton("Hf");
		btnHf.setBounds(212, 368, 58, 58);
		btnHf.setBackground(Color.YELLOW);
		btnHf.setToolTipText("<html>Hafnium<br>Atomic Number: 72<br>Electronegativity Value: 1.30</html>");
		contentPane.add(btnHf);
		
		JButton btnV = new JButton("V");
		btnV.setBounds(270, 252, 58, 58);
		btnV.setBackground(Color.YELLOW);
		btnV.setToolTipText("<html>Vanadium<br>Atomic Number: 23<br>Electronegativity Value: 1.63</html>");
		contentPane.add(btnV);
		
		JButton btnNb = new JButton("Nb");
		btnNb.setBounds(270, 310, 58, 58);
		btnNb.setBackground(Color.YELLOW);
		btnNb.setToolTipText("<html>Niobium<br>Atomic Number: 41<br>Electronegativity Value: 1.60</html>");
		contentPane.add(btnNb);
		
		JButton btnCr = new JButton("Cr");
		btnCr.setBounds(328, 252, 58, 58);
		btnCr.setBackground(Color.YELLOW);
		btnCr.setToolTipText("<html>Chromium<br>Atomic Number: 24<br>Electronegativity Value: 1.66</html>");
		contentPane.add(btnCr);
		
		JButton btnMn = new JButton("Mn");
		btnMn.setBounds(386, 252, 58, 58);
		btnMn.setBackground(Color.YELLOW);
		btnMn.setToolTipText("<html>Manganese<br>Atomic Number: 25<br>Electronegativity Value: 1.55</html>");
		contentPane.add(btnMn);
		
		JButton btnFe = new JButton("Fe");
		btnFe.setBounds(444, 252, 58, 58);
		btnFe.setBackground(Color.YELLOW);
		btnFe.setToolTipText("<html>Iron<br>Atomic Number: 26<br>Electronegativity Value: 1.83</html>");
		contentPane.add(btnFe);
		
		JButton btnRn = new JButton("Rn");
		btnRn.setBounds(1024, 368, 58, 58);
		btnRn.setBackground(new Color(128, 0, 128));
		btnRn.setToolTipText("<html>Radon<br>Atomic Number: 86<br>Electronegativity Value: N/A</html>");
		contentPane.add(btnRn);
		
		JButton btnXe = new JButton("Xe");
		btnXe.setBounds(1024, 310, 58, 58);
		btnXe.setBackground(new Color(128, 0, 128));
		btnXe.setToolTipText("<html>Xenon<br>Atomic Number: 54<br>Electronegativity Value: 2.60</html>");
		contentPane.add(btnXe);
		
		JButton btnKr = new JButton("Kr");
		btnKr.setBounds(1024, 252, 58, 58);
		btnKr.setBackground(new Color(128, 0, 128));
		btnKr.setToolTipText("<html>Krypton<br>Atomic Number: 36<br>Electronegativity Value: 3.00</html>");
		contentPane.add(btnKr);
		
		JButton btnAr = new JButton("Ar");
		btnAr.setBounds(1024, 194, 58, 58);
		btnAr.setBackground(new Color(128, 0, 128));
		btnAr.setToolTipText("<html>Argon<br>Atomic Number: 18<br>Electronegativity Value: N/A</html>");
		contentPane.add(btnAr);
		
		JButton btnNe = new JButton("Ne");
		btnNe.setBounds(1024, 136, 58, 58);
		btnNe.setBackground(new Color(128, 0, 128));
		btnNe.setToolTipText("<html>Neon<br>Atomic Number: 10<br>Electronegativity Value: N/A</html>");
		contentPane.add(btnNe);
		
		JButton btnHe = new JButton("He");
		btnHe.setBounds(1024, 78, 58, 58);
		btnHe.setBackground(new Color(128, 0, 128));
		btnHe.setToolTipText("<html>Helium<br>Atomic Number: 2<br>Electronegativity Value: N/A</html>");
		contentPane.add(btnHe);
		
		JButton btnCo = new JButton("Co");
		btnCo.setBounds(502, 252, 58, 58);
		btnCo.setBackground(Color.YELLOW);
		btnCo.setToolTipText("<html>Cobalt<br>Atomic Number: 27<br>Electronegativity Value: 1.88</html>");
		contentPane.add(btnCo);
		
		JButton btnNi = new JButton("Ni");
		btnNi.setBounds(560, 252, 58, 58);
		btnNi.setBackground(Color.YELLOW);
		btnNi.setToolTipText("<html>Nickel<br>Atomic Number: 28<br>Electronegativity Value: 1.91</html>");
		contentPane.add(btnNi);
		
		JButton btnCu = new JButton("Cu");
		btnCu.setBounds(618, 252, 58, 58);
		btnCu.setBackground(Color.YELLOW);
		btnCu.setToolTipText("<html>Copper<br>Atomic Number: 29<br>Electronegativity Value: 1.90</html>");
		contentPane.add(btnCu);
		
		JButton btnZn = new JButton("Zn");
		btnZn.setBounds(676, 252, 58, 58);
		btnZn.setBackground(Color.YELLOW);
		btnZn.setToolTipText("<html>Zinc<br>Atomic Number: 30<br>Electronegativity Value: 1.65</html>");
		contentPane.add(btnZn);
		
		JButton btnGa = new JButton("Ga");
		btnGa.setBounds(734, 252, 58, 58);
		btnGa.setBackground(Color.GREEN);
		btnGa.setToolTipText("<html>Gallium<br>Atomic Number: 31<br>Electronegativity Value: 1.81</html>");
		contentPane.add(btnGa);
		
		JButton btnGe = new JButton("Ge");
		btnGe.setBounds(792, 252, 58, 58);
		btnGe.setBackground(new Color(255, 20, 147));
		btnGe.setToolTipText("<html>Germanium<br>Atomic Number: 32<br>Electronegativity Value: 2.01</html>");
		contentPane.add(btnGe);
		
		JButton btnAs = new JButton("As");
		btnAs.setBounds(850, 252, 58, 58);
		btnAs.setBackground(new Color(255, 20, 147));
		btnAs.setToolTipText("<html>Arsenic<br>Atomic Number: 33<br>Electronegativity Value: 2.81</html>");
		contentPane.add(btnAs);
		
		JButton btnSe = new JButton("Se");
		btnSe.setBounds(908, 252, 58, 58);
		btnSe.setBackground(Color.BLUE);
		btnSe.setToolTipText("<html>Selenium<br>Atomic Number: 34<br>Electronegativity Value: 2.55</html>");
		contentPane.add(btnSe);
		
		JButton btnBr = new JButton("Br");
		btnBr.setBounds(966, 252, 58, 58);
		btnBr.setBackground(Color.CYAN);
		btnBr.setToolTipText("<html>Bromine<br>Atomic Number: 35<br>Electronegativity Value: 2.96</html>");
		contentPane.add(btnBr);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(966, 136, 58, 58);
		btnF.setBackground(Color.CYAN);
		btnF.setToolTipText("<html>Fluorine<br>Atomic Number: 9<br>Electronegativity Value: 3.98</html>");
		contentPane.add(btnF);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(908, 136, 58, 58);
		btnO.setBackground(Color.BLUE);
		btnO.setToolTipText("<html>Oxygen<br>Atomic Number: 8<br>Electronegativity Value: 3.44</html>");
		contentPane.add(btnO);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(850, 136, 58, 58);
		btnN.setBackground(Color.BLUE);
		btnN.setToolTipText("<html>Nitrogen<br>Atomic Number: 7<br>Electronegativity Value: 3.04</html>");
		contentPane.add(btnN);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(792, 136, 58, 58);
		btnC.setBackground(Color.BLUE);
		btnC.setToolTipText("<html>Carbon<br>Atomic Number: 6<br>Electronegativity Value: 2.55</html>");
		contentPane.add(btnC);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(734, 136, 58, 58);
		btnB.setBackground(new Color(255, 20, 147));
		btnB.setToolTipText("<html>Boron<br>Atomic Number: 5<br>Electronegativity Value: 2.04</html>");
		contentPane.add(btnB);
		
		JButton btnAl = new JButton("Al");
		btnAl.setBounds(734, 194, 58, 58);
		btnAl.setBackground(Color.GREEN);
		btnAl.setToolTipText("<html>Aluminum<br>Atomic Number: 13<br>Electronegativity Value: 1.61</html>");
		contentPane.add(btnAl);
		
		JButton btnSi = new JButton("Si");
		btnSi.setBounds(792, 194, 58, 58);
		btnSi.setBackground(new Color(255, 20, 147));
		btnSi.setToolTipText("<html>Silicon<br>Atomic Number: 14<br>Electronegativity Value: 1.90</html>");
		contentPane.add(btnSi);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(850, 194, 58, 58);
		btnP.setBackground(Color.BLUE);
		btnP.setToolTipText("<html>Phosphorus<br>Atomic Number: 15<br>Electronegativity Value: 2.19</html>");
		contentPane.add(btnP);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(908, 194, 58, 58);
		btnS.setBackground(Color.BLUE);
		btnS.setToolTipText("<html>Sulfur<br>Atomic Number: 16<br>Electronegativity Value: 2.58</html>");
		contentPane.add(btnS);
		
		JButton btnCl = new JButton("Cl");
		btnCl.setBounds(966, 194, 58, 58);
		btnCl.setBackground(Color.CYAN);
		btnCl.setToolTipText("<html>Chlorine<br>Atomic Number: 17<br>Electronegativity Value: 3.16</html>");
		contentPane.add(btnCl);
		
		JButton btnTa = new JButton("Ta");
		btnTa.setBounds(270, 368, 58, 58);
		btnTa.setBackground(Color.YELLOW);
		btnTa.setToolTipText("<html>Tantalum<br>Atomic Number: 73<br>Electronegativity Value: 1.50</html>");
		contentPane.add(btnTa);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(328, 368, 58, 58);
		btnW.setBackground(Color.YELLOW);
		btnW.setToolTipText("<html>Tungsten<br>Atomic Number: 74<br>Electronegativity Value: 2.36</html>");
		contentPane.add(btnW);
		
		JButton btnMo = new JButton("Mo");
		btnMo.setBounds(328, 310, 58, 58);
		btnMo.setBackground(Color.YELLOW);
		btnMo.setToolTipText("<html>Molybdenum<br>Atomic Number: 42<br>Electronegativity Value: 2.16</html>");
		contentPane.add(btnMo);
		
		JButton btnTc = new JButton("Tc");
		btnTc.setBounds(386, 310, 58, 58);
		btnTc.setBackground(Color.YELLOW);
		btnTc.setToolTipText("<html>Technetium<br>Atomic Number: 43<br>Electronegativity Value: 1.90</html>");
		contentPane.add(btnTc);
		
		JButton btnOs = new JButton("Os");
		btnOs.setBounds(444, 368, 58, 58);
		btnOs.setBackground(Color.YELLOW);
		btnOs.setToolTipText("<html>Osmium<br>Atomic Number: 76<br>Electronegativity Value: 2.20</html>");
		contentPane.add(btnOs);
		
		JButton btnIr = new JButton("Ir");
		btnIr.setBounds(502, 368, 58, 58);
		btnIr.setBackground(Color.YELLOW);
		btnIr.setToolTipText("<html>Iridium<br>Atomic Number: 77<br>Electronegativity Value: 2.20</html>");
		contentPane.add(btnIr);
		
		JButton btnRu = new JButton("Ru");
		btnRu.setBounds(444, 310, 58, 58);
		btnRu.setBackground(Color.YELLOW);
		btnRu.setToolTipText("<html>Ruthenium<br>Atomic Number: 44<br>Electronegativity Value: 2.20</html>");
		contentPane.add(btnRu);
		
		JButton btnRh = new JButton("Rh");
		btnRh.setBounds(502, 310, 58, 58);
		btnRh.setBackground(Color.YELLOW);
		btnRh.setToolTipText("<html>Rhodium<br>Atomic Number: 45<br>Electronegativity Value: 2.28</html>");
		contentPane.add(btnRh);
		
		JButton btnPt = new JButton("Pt");
		btnPt.setBounds(560, 368, 58, 58);
		btnPt.setBackground(Color.YELLOW);
		btnPt.setToolTipText("<html>Platinum<br>Atomic Number: 78<br>Electronegativity Value: 2.28</html>");
		contentPane.add(btnPt);
		
		JButton btnAu = new JButton("Au");
		btnAu.setBounds(618, 368, 58, 58);
		btnAu.setBackground(Color.YELLOW);
		btnAu.setToolTipText("<html>Gold<br>Atomic Number: 79<br>Electronegativity Value: 2.54</html>");
		contentPane.add(btnAu);
		
		JButton btnPd = new JButton("Pd");
		btnPd.setBounds(560, 310, 58, 58);
		btnPd.setBackground(Color.YELLOW);
		btnPd.setToolTipText("<html>Paladium<br>Atomic Number: 46<br>Electronegativity Value: 2.20</html>");
		contentPane.add(btnPd);
		
		JButton btnHg = new JButton("Hg");
		btnHg.setBounds(676, 368, 58, 58);
		btnHg.setBackground(Color.YELLOW);
		btnHg.setToolTipText("<html>Mercury<br>Atomic Number: 80<br>Electronegativity Value: 2.00</html>");
		contentPane.add(btnHg);
		
		JButton btnAg = new JButton("Ag");
		btnAg.setBounds(618, 310, 58, 58);
		btnAg.setBackground(Color.YELLOW);
		btnAg.setToolTipText("<html>Silver<br>Atomic Number: 47<br>Electronegativity Value: 1.93</html>");
		contentPane.add(btnAg);
		
		JButton btnCd = new JButton("Cd");
		btnCd.setBounds(676, 310, 58, 58);
		btnCd.setBackground(Color.YELLOW);
		btnCd.setToolTipText("<html>Cadmium<br>Atomic Number: 48<br>Electronegativity Value: 1.69</html>");
		contentPane.add(btnCd);
		
		JButton btnTl = new JButton("Tl");
		btnTl.setBounds(734, 368, 58, 58);
		btnTl.setBackground(Color.GREEN);
		btnTl.setToolTipText("<html>Thallium<br>Atomic Number: 81<br>Electronegativity Value: 1.62</html>");
		contentPane.add(btnTl);
		
		JButton btnIn = new JButton("In");
		btnIn.setBounds(734, 310, 58, 58);
		btnIn.setBackground(Color.GREEN);
		btnIn.setToolTipText("<html>Indium<br>Atomic Number: 49<br>Electronegativity Value: 1.78</html>");
		contentPane.add(btnIn);
		
		JButton btnPb = new JButton("Pb");
		btnPb.setBounds(792, 368, 58, 58);
		btnPb.setBackground(Color.GREEN);
		btnPb.setToolTipText("<html>Lead<br>Atomic Number: 82<br>Electronegativity Value: 2.33</html>");
		contentPane.add(btnPb);
		
		JButton btnBi = new JButton("Bi");
		btnBi.setBounds(850, 368, 58, 58);
		btnBi.setBackground(Color.GREEN);
		btnBi.setToolTipText("<html>Bismuth<br>Atomic Number: 83<br>Electronegativity Value: 2.02</html>");
		contentPane.add(btnBi);
		
		JButton btnSn = new JButton("Sn");
		btnSn.setBounds(792, 310, 58, 58);
		btnSn.setBackground(Color.GREEN);
		btnSn.setToolTipText("<html>Tin<br>Atomic Number: 50<br>Electronegativity Value: 1.96</html>");
		contentPane.add(btnSn);
		
		JButton btnPo = new JButton("Po");
		btnPo.setBounds(908, 368, 58, 58);
		btnPo.setBackground(new Color(255, 20, 147));
		btnPo.setToolTipText("<html>Polonium<br>Atomic Number: 84<br>Electronegativity Value: 2.00</html>");
		contentPane.add(btnPo);
		
		JButton btnSb = new JButton("Sb");
		btnSb.setBounds(850, 310, 58, 58);
		btnSb.setBackground(new Color(255, 20, 147));
		btnSb.setToolTipText("<html>Antimony<br>Atomic Number: 51<br>Electronegativity Value: 2.05</html>");
		contentPane.add(btnSb);
		
		JButton btnAt = new JButton("At");
		btnAt.setBounds(966, 368, 58, 58);
		btnAt.setBackground(Color.CYAN);
		btnAt.setToolTipText("<html>Astatine<br>Atomic Number: 85<br>Electronegativity Value: 2.20</html>");
		contentPane.add(btnAt);
		
		JButton btnTe = new JButton("Te");
		btnTe.setBounds(908, 310, 58, 58);
		btnTe.setBackground(new Color(255, 20, 147));
		btnTe.setToolTipText("<html>Telerium<br>Atomic Number: 52<br>Electronegativity Value: 2.10</html>");
		contentPane.add(btnTe);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(966, 310, 58, 58);
		btnI.setBackground(Color.CYAN);
		btnI.setToolTipText("<html>Iodine<br>Atomic Number: 53<br>Electronegativity Value: 2.66</html>");
		contentPane.add(btnI);
		
		JButton btnRe = new JButton("Re");
		btnRe.setBounds(386, 368, 58, 58);
		btnRe.setBackground(Color.YELLOW);
		btnRe.setToolTipText("<html>Rhenium<br>Atomic Number: 75<br>Electronegativity Value: 1.9</html>");
		contentPane.add(btnRe);
		
		JLabel label = new JLabel("*");
		label.setBounds(164, 390, 28, 14);
		label.setToolTipText("Lanthinides");
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("**");
		label_1.setBounds(164, 448, 28, 14);
		label_1.setToolTipText("Actinides");
		contentPane.add(label_1);
		
		JButton btnLa = new JButton("La");
		btnLa.setBounds(212, 510, 58, 58);
		btnLa.setBackground(new Color(173, 255, 47));
		btnLa.setToolTipText("<html>Lanthinum<br>Atomic Number: 57<br>Electronegativity Value: 1.10</html>");
		contentPane.add(btnLa);
		
		JButton btnAc = new JButton("Ac");
		btnAc.setBounds(212, 568, 58, 58);
		btnAc.setBackground(Color.PINK);
		btnAc.setToolTipText("<html>Actinium<br>Atomic Number: 89<br>Electronegativity Value: 1.10</html>");
		contentPane.add(btnAc);
		
		JButton btnCe = new JButton("Ce");
		btnCe.setBounds(270, 510, 58, 58);
		btnCe.setBackground(new Color(173, 255, 47));
		btnCe.setToolTipText("<html>Cerium<br>Atomic Number: 58<br>Electronegativity Value: 1.12</html>");
		contentPane.add(btnCe);
		
		JButton btnTh = new JButton("Th");
		btnTh.setBounds(270, 568, 58, 58);
		btnTh.setBackground(Color.PINK);
		btnTh.setToolTipText("<html>Thorium<br>Atomic Number: 90<br>Electronegativity Value: 1.30</html>");
		contentPane.add(btnTh);
		
		JButton btnPr = new JButton("Pr");
		btnPr.setBounds(328, 510, 58, 58);
		btnPr.setBackground(new Color(173, 255, 47));
		btnPr.setToolTipText("<html>Praseodymium<br>Atomic Number: 59<br>Electronegativity Value: 1.13</html>");
		contentPane.add(btnPr);
		
		JButton btnPa = new JButton("Pa");
		btnPa.setBounds(328, 568, 58, 58);
		btnPa.setBackground(Color.PINK);
		btnPa.setToolTipText("<html>Protactinium<br>Atomic Number: 91<br>Electronegativity Value: 1.50</html>");
		contentPane.add(btnPa);
		
		JButton btnNd = new JButton("Nd");
		btnNd.setBounds(386, 510, 58, 58);
		btnNd.setBackground(new Color(173, 255, 47));
		btnNd.setToolTipText("<html>Neodymium<br>Atomic Number: 60<br>Electronegativity Value: 1.14</html>");
		contentPane.add(btnNd);
		
		JButton btnU = new JButton("U");
		btnU.setBounds(386, 568, 58, 58);
		btnU.setBackground(Color.PINK);
		btnU.setToolTipText("<html>Uranium<br>Atomic Number: 92<br>Electronegativity Value: 1.38</html>");
		contentPane.add(btnU);
		
		JButton btnPm = new JButton("Pm");
		btnPm.setBounds(444, 510, 58, 58);
		btnPm.setBackground(new Color(173, 255, 47));
		btnPm.setToolTipText("<html>Promethium<br>Atomic Number: 61<br>Electronegativity Value: 1.13</html>");
		contentPane.add(btnPm);
		
		JButton btnNp = new JButton("Np");
		btnNp.setBounds(444, 568, 58, 58);
		btnNp.setBackground(Color.PINK);
		btnNp.setToolTipText("<html>Neptunium<br>Atomic Number: 93<br>Electronegativity Value: 1.36</html>");
		contentPane.add(btnNp);
		
		JButton btnSm = new JButton("Sm");
		btnSm.setBounds(502, 510, 58, 58);
		btnSm.setBackground(new Color(173, 255, 47));
		btnSm.setToolTipText("<html>Samarium<br>Atomic Number: 62<br>Electronegativity Value: 1.17</html>");
		contentPane.add(btnSm);
		
		JButton btnPu = new JButton("Pu");
		btnPu.setBounds(502, 568, 58, 58);
		btnPu.setBackground(Color.PINK);
		btnPu.setToolTipText("<html>Plutonium<br>Atomic Number: 94<br>Electronegativity Value: 1.28</html>");
		contentPane.add(btnPu);
		
		JButton btnEu = new JButton("Eu");
		btnEu.setBounds(560, 510, 58, 58);
		btnEu.setBackground(new Color(173, 255, 47));
		btnEu.setToolTipText("<html>Europium<br>Atomic Number: 63<br>Electronegativity Value: 1.20</html>");
		contentPane.add(btnEu);
		
		JButton btnAm = new JButton("Am");
		btnAm.setBounds(560, 568, 58, 58);
		btnAm.setBackground(Color.PINK);
		btnAm.setToolTipText("<html>Americium<br>Atomic Number: 95<br>Electronegativity Value: 1.30</html>");
		contentPane.add(btnAm);
		
		JButton btnGd = new JButton("Gd");
		btnGd.setBounds(618, 510, 58, 58);
		btnGd.setBackground(new Color(173, 255, 47));
		btnGd.setToolTipText("<html>Gadolinium<br>Atomic Number: 64<br>Electronegativity Value: 1.20</html>");
		contentPane.add(btnGd);
		
		JButton btnTb = new JButton("Tb");
		btnTb.setBounds(676, 510, 58, 58);
		btnTb.setBackground(new Color(173, 255, 47));
		btnTb.setToolTipText("<html>Terbium<br>Atomic Number: 65<br>Electronegativity Value: 1.22</html>");
		contentPane.add(btnTb);
		
		JButton btnDy = new JButton("Dy");
		btnDy.setBounds(734, 510, 58, 58);
		btnDy.setBackground(new Color(173, 255, 47));
		btnDy.setToolTipText("<html>Dysprosium<br>Atomic Number: 66<br>Electronegativity Value: 1.23</html>");
		contentPane.add(btnDy);
		
		JButton btnHo = new JButton("Ho");
		btnHo.setBounds(792, 510, 58, 58);
		btnHo.setBackground(new Color(173, 255, 47));
		btnHo.setToolTipText("<html>Holmium<br>Atomic Number: 67<br>Electronegativity Value: 1.24</html>");
		contentPane.add(btnHo);
		
		JButton btnEb = new JButton("Er");
		btnEb.setBounds(850, 510, 58, 58);
		btnEb.setBackground(new Color(173, 255, 47));
		btnEb.setToolTipText("<html>Erbium<br>Atomic Number: 68<br>Electronegativity Value: 1.24</html>");
		contentPane.add(btnEb);
		
		JButton btnTm = new JButton("Tm");
		btnTm.setBounds(908, 510, 58, 58);
		btnTm.setBackground(new Color(173, 255, 47));
		btnTm.setToolTipText("<html>Thulium<br>Atomic Number: 69<br>Electronegativity Value: 1.25</html>");
		contentPane.add(btnTm);
		
		JButton btnYb = new JButton("Yb");
		btnYb.setBounds(966, 510, 58, 58);
		btnYb.setBackground(new Color(173, 255, 47));
		btnYb.setToolTipText("<html>Ytterbium<br>Atomic Number: 71<br>Electronegativity Value: 1.10</html>");
		contentPane.add(btnYb);
		
		JButton btnLu = new JButton("Lu");
		btnLu.setBounds(1024, 510, 58, 58);
		btnLu.setBackground(new Color(173, 255, 47));
		btnLu.setToolTipText("<html>Lutetium<br>Atomic Number: 71<br>Electronegativity Value: 1.27</html>");
		contentPane.add(btnLu);
		
		JButton btnCm = new JButton("Cm");
		btnCm.setBounds(618, 568, 58, 58);
		btnCm.setBackground(Color.PINK);
		btnCm.setToolTipText("<html>Curium<br>Atomic Number: 96<br>Electronegativity Value: 1.30</html>");
		contentPane.add(btnCm);
		
		JButton btnBk = new JButton("Bk");
		btnBk.setBounds(676, 568, 58, 58);
		btnBk.setBackground(Color.PINK);
		btnBk.setToolTipText("<html>Berkelium<br>Atomic Number: 97<br>Electronegativity Value: 1.30</html>");
		contentPane.add(btnBk);
		
		JButton btnCf = new JButton("Cf");
		btnCf.setBounds(734, 568, 58, 58);
		btnCf.setBackground(Color.PINK);
		btnCf.setToolTipText("<html>Califormium<br>Atomic Number: 98<br>Electronegativity Value: 1.30</html>");
		contentPane.add(btnCf);
		
		JButton btnEs = new JButton("Es");
		btnEs.setBounds(792, 568, 58, 58);
		btnEs.setBackground(Color.PINK);
		btnEs.setToolTipText("<html>Einsteinium<br>Atomic Number: 99<br>Electronegativity Value: 1.30</html>");
		contentPane.add(btnEs);
		
		JButton btnFm = new JButton("Fm");
		btnFm.setBounds(850, 568, 58, 58);
		btnFm.setBackground(Color.PINK);
		btnFm.setToolTipText("<html>Fermium<br>Atomic Number: 100<br>Electronegativity Value: 1.30</html>");
		contentPane.add(btnFm);
		
		JButton btnMd = new JButton("Md");
		btnMd.setBounds(908, 568, 58, 58);
		btnMd.setBackground(Color.PINK);
		btnMd.setToolTipText("<html>Mendelvium<br>Atomic Number: 101<br>Electronegativity Value: 1.30</html>");
		contentPane.add(btnMd);
		
		JButton btnNo = new JButton("No");
		btnNo.setBounds(966, 568, 58, 58);
		btnNo.setBackground(Color.PINK);
		btnNo.setToolTipText("<html>Nobelium<br>Atomic Number: 102<br>Electronegativity Value: 1.30</html>");
		contentPane.add(btnNo);
		
		JButton btnLr = new JButton("Lr");
		btnLr.setBounds(1024, 568, 58, 58);
		btnLr.setBackground(Color.PINK);
		btnLr.setToolTipText("<html>Lawrencium<br>Atomic Number: 103<br>Electronegativity Value: Unknown</html>");
		contentPane.add(btnLr);
		
		JLabel label_2 = new JLabel("*");
		label_2.setBounds(164, 524, 48, 30);
		label_2.setToolTipText("Lanthinides");
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("**");
		label_3.setBounds(164, 584, 48, 30);
		label_3.setToolTipText("Actinides");
		contentPane.add(label_3);
		
		JLabel lblMouseOverElements = new JLabel("Mouse over elements and labels for more information");
		lblMouseOverElements.setBounds(154, 78, 310, 30);
		contentPane.add(lblMouseOverElements);
		
		JLabel lblElement = new JLabel("Element 1:");
		lblElement.setBounds(157, 11, 67, 23);
		contentPane.add(lblElement);
		
		JLabel label_4 = new JLabel("_____");
		label_4.setBounds(212, 15, 88, 14);
		contentPane.add(label_4);
		
		JLabel lblElement_1 = new JLabel("Element 2:");
		lblElement_1.setBounds(300, 11, 67, 23);
		contentPane.add(lblElement_1);
		
		JLabel label_5 = new JLabel("_____");
		label_5.setBounds(356, 15, 88, 14);
		contentPane.add(label_5);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(297, 44, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnBond = new JButton("Bond");
		btnBond.setBounds(157, 44, 89, 23);
		contentPane.add(btnBond);
		
		JLabel label_6 = new JLabel("<html><b>1</b></html>", SwingConstants.CENTER);
		label_6.setBounds(38, 52, 58, 26);
		label_6.setToolTipText("<html>Group 1<br>Alkali Metals</html>");
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("<html><b>2</b></html>", SwingConstants.CENTER);
		label_7.setBounds(96, 110, 58, 26);
		label_7.setToolTipText("<html>Group 2<br>Alkaline Earth Metals</html>");
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("<html><b>3</b></html>", SwingConstants.CENTER);
		label_8.setBounds(154, 226, 58, 26);
		label_8.setToolTipText("Group 3");
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("<html><b>4</b></html>", SwingConstants.CENTER);
		label_9.setBounds(212, 226, 58, 26);
		label_9.setToolTipText("Group 4");
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("<html><b>5</b></html>", SwingConstants.CENTER);
		label_10.setBounds(270, 226, 58, 26);
		label_10.setToolTipText("Group 5");
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("<html><b>6</b></html>", SwingConstants.CENTER);
		label_11.setBounds(328, 226, 58, 26);
		label_11.setToolTipText("Group 6");
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("<html><b>7</b></html>", SwingConstants.CENTER);
		label_12.setBounds(386, 226, 58, 26);
		label_12.setToolTipText("Group 7");
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("<html><b>8</b></html>", SwingConstants.CENTER);
		label_13.setBounds(444, 226, 58, 26);
		label_13.setToolTipText("Group 8");
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("<html><b>9</b></html>", SwingConstants.CENTER);
		label_14.setBounds(502, 226, 58, 26);
		label_14.setToolTipText("Group 9");
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("<html><b>10</b><html>", SwingConstants.CENTER);
		label_15.setBounds(560, 226, 58, 26);
		label_15.setToolTipText("Group 10");
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("<html><b>11</b></html>", SwingConstants.CENTER);
		label_16.setBounds(618, 226, 58, 26);
		label_16.setToolTipText("<html>Group 11<br>Coinage Metals</html>");
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("<html><b>12</b></html>", SwingConstants.CENTER);
		label_17.setBounds(676, 226, 58, 26);
		label_17.setToolTipText("<html>Group 12<br>Volatile Metals</html>");
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("<html><b>13</b></html>", SwingConstants.CENTER);
		label_18.setBounds(734, 110, 58, 26);
		label_18.setToolTipText("<html>Group 13<br>Icosagens</html>");
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("<html><b>14</b></html>", SwingConstants.CENTER);
		label_19.setBounds(792, 110, 58, 26);
		label_19.setToolTipText("<html>Group 14<br>Crystallogens</html>");
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("<html><b>15</b></html>", SwingConstants.CENTER);
		label_20.setBounds(850, 110, 58, 26);
		label_20.setToolTipText("<html>Group 15<br>Pnictogens</html>");
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("<html><b>16</b></html>", SwingConstants.CENTER);
		label_21.setBounds(908, 110, 58, 26);
		label_21.setToolTipText("<html>Group 16<br>Chalcogens</html>");
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("<html><b>17</b></html>", SwingConstants.CENTER);
		label_22.setBounds(966, 110, 58, 26);
		label_22.setToolTipText("<html>Group 17<br>Halogens</html>");
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("<html><b>18</b></html>", SwingConstants.CENTER);
		label_23.setBounds(1024, 52, 58, 26);
		label_23.setToolTipText("<html>Group 18<br>Noble Gases</html>");
		contentPane.add(label_23);
		
		JSeparator st = new JSeparator();
		st.setBounds(477, 34, 243, 2);
		contentPane.add(st);
		
		JSeparator sb = new JSeparator();
		sb.setBounds(477, 152, 244, 2);
		contentPane.add(sb);
		
		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setBounds(486, 11, 46, 14);
		contentPane.add(lblOutput);
		
		JLabel lblFormulaOfBonded = new JLabel("Formula of compound:");
		lblFormulaOfBonded.setBounds(487, 43, 146, 14);
		contentPane.add(lblFormulaOfBonded);
		
		JSeparator sl = new JSeparator();
		sl.setBounds(476, 34, 2, 119);
		sl.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(sl);
		
		JSeparator sr = new JSeparator();
		sr.setBounds(720, 34, 2, 119);
		sr.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(sr);
		
		JLabel lblBondingType = new JLabel("Bonding type:");
		lblBondingType.setBounds(488, 99, 72, 14);
		contentPane.add(lblBondingType);
		
		JLabel lblElectronegativityDifference = new JLabel("Electronegativity difference:");
		lblElectronegativityDifference.setBounds(487, 127, 146, 14);
		contentPane.add(lblElectronegativityDifference);
		
		JLabel compound_formula = new JLabel("-------");
		compound_formula.setBounds(604, 44, 106, 14);
		contentPane.add(compound_formula);
		
		JLabel bonding_type = new JLabel("-------");
		bonding_type.setBounds(564, 99, 46, 14);
		contentPane.add(bonding_type);
		
		JLabel e_diff = new JLabel("-------");
		e_diff.setBounds(634, 127, 46, 14);
		contentPane.add(e_diff);
		
		JLabel lblNameOfCompound = new JLabel("Name of compound:");
		lblNameOfCompound.setBounds(488, 71, 105, 14);
		contentPane.add(lblNameOfCompound);
		
		JLabel compound_name = new JLabel("-------");
		compound_name.setBounds(591, 71, 119, 14);
		contentPane.add(compound_name);
		
		JLabel errLbl = new JLabel("");
		errLbl.setBounds(477, 158, 243, 36);
		contentPane.add(errLbl);
		
		JLabel label_24 = new JLabel("<html><b>1</b></html>");
		label_24.setToolTipText("<html>Period 1<br>Maximum electrons in this shell: 2<html>");
		label_24.setBounds(20, 100, 46, 14);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("<html><b>2</b></html>");
		label_25.setToolTipText("<html>Period 2<br>Maximum electrons in this shell: 8<html>");
		label_25.setBounds(20, 158, 46, 14);
		contentPane.add(label_25);
		
		JLabel lblNewLabel = new JLabel("<html><b>3</b></html>");
		lblNewLabel.setToolTipText("<html>Period 3<br>Maximum electrons in this shell: 18<html>");
		lblNewLabel.setBounds(20, 216, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html><b>4</b></html>");
		lblNewLabel_1.setToolTipText("<html>Period 4<br>Maximum electrons in this shell: 32<html>");
		lblNewLabel_1.setBounds(20, 274, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html><b>5</b></html>");
		lblNewLabel_2.setToolTipText("<html>Period 5<br>Maximum electrons in this shell: 32<html>");
		lblNewLabel_2.setBounds(20, 332, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<html><b>6</b></html>");
		lblNewLabel_3.setToolTipText("<html>Period 6<br>Maximum electrons in this shell: 18<html>");
		lblNewLabel_3.setBounds(20, 390, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("<html><b>7</b></html>");
		lblNewLabel_4.setToolTipText("<html>Period 7<br>Maximum electrons in this shell: 8<html>");
		lblNewLabel_4.setBounds(20, 448, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel label_26 = new JLabel("");
		label_26.setIcon(new ImageIcon(ui.class.getResource("/src/red.png")));
		label_26.setBounds(217, 637, 77, 30);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("");
		label_27.setIcon(new ImageIcon(ui.class.getResource("/src/black.png")));
		label_27.setBounds(304, 637, 77, 30);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("");
		label_28.setIcon(new ImageIcon(ui.class.getResource("/src/yellow.png")));
		label_28.setBounds(391, 637, 77, 30);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel("");
		label_29.setIcon(new ImageIcon(ui.class.getResource("/src/green.png")));
		label_29.setBounds(478, 637, 77, 30);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel("");
		label_30.setIcon(new ImageIcon(ui.class.getResource("/src/pink.png")));
		label_30.setBounds(565, 637, 77, 30);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel("");
		label_31.setIcon(new ImageIcon(ui.class.getResource("/src/blue.png")));
		label_31.setBounds(652, 637, 77, 30);
		contentPane.add(label_31);
		
		JLabel label_32 = new JLabel("");
		label_32.setIcon(new ImageIcon(ui.class.getResource("/src/cyan.png")));
		label_32.setBounds(739, 637, 77, 30);
		contentPane.add(label_32);
		
		JLabel label_33 = new JLabel("");
		label_33.setIcon(new ImageIcon(ui.class.getResource("/src/purple.png")));
		label_33.setBounds(826, 637, 77, 30);
		contentPane.add(label_33);
		
		JLabel label_34 = new JLabel("");
		label_34.setIcon(new ImageIcon(ui.class.getResource("/src/lgreen.png")));
		label_34.setBounds(913, 637, 77, 30);
		contentPane.add(label_34);
		
		JLabel label_35 = new JLabel("");
		label_35.setIcon(new ImageIcon(ui.class.getResource("/src/lpink.png")));
		label_35.setBounds(1000, 637, 77, 30);
		contentPane.add(label_35);
		
		JLabel lblNewLabel_5 = new JLabel("<html><b>Alkali Metals</b></html>");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(217, 673, 77, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblalkalineEarth = new JLabel("<html><b>Alkaline</b></html>");
		lblalkalineEarth.setHorizontalAlignment(SwingConstants.CENTER);
		lblalkalineEarth.setBounds(304, 673, 77, 14);
		contentPane.add(lblalkalineEarth);
		
		JLabel lbltransitionMetals = new JLabel("<html><b>Transition</b></html>");
		lbltransitionMetals.setHorizontalAlignment(SwingConstants.CENTER);
		lbltransitionMetals.setBounds(391, 673, 77, 14);
		contentPane.add(lbltransitionMetals);
		
		JLabel lblbasicMetals = new JLabel("<html><b>Basic Metals</b></html>");
		lblbasicMetals.setHorizontalAlignment(SwingConstants.CENTER);
		lblbasicMetals.setBounds(478, 673, 77, 14);
		contentPane.add(lblbasicMetals);
		
		JLabel lblsemimetals = new JLabel("<html><b>Metalloids</b></html>");
		lblsemimetals.setHorizontalAlignment(SwingConstants.CENTER);
		lblsemimetals.setBounds(565, 673, 77, 14);
		contentPane.add(lblsemimetals);
		
		JLabel lblnonmetals = new JLabel("<html><b>Nonmetals</b></html>");
		lblnonmetals.setHorizontalAlignment(SwingConstants.CENTER);
		lblnonmetals.setBounds(652, 673, 77, 14);
		contentPane.add(lblnonmetals);
		
		JLabel lblhalogens = new JLabel("<html><b>Halogens</b></html>");
		lblhalogens.setHorizontalAlignment(SwingConstants.CENTER);
		lblhalogens.setBounds(739, 673, 77, 14);
		contentPane.add(lblhalogens);
		
		JLabel lblnobleGases = new JLabel("<html><b>Noble Gases</b></html>");
		lblnobleGases.setHorizontalAlignment(SwingConstants.CENTER);
		lblnobleGases.setBounds(826, 673, 77, 14);
		contentPane.add(lblnobleGases);
		
		JLabel lbllanthinides = new JLabel("<html><b>Lanthinides</b></html>");
		lbllanthinides.setHorizontalAlignment(SwingConstants.CENTER);
		lbllanthinides.setBounds(913, 673, 77, 14);
		contentPane.add(lbllanthinides);
		
		JLabel lblactinides = new JLabel("<html><b>Actinides</b></html>");
		lblactinides.setHorizontalAlignment(SwingConstants.CENTER);
		lblactinides.setBounds(1000, 673, 77, 14);
		contentPane.add(lblactinides);
		
		JLabel lblNewLabel_6 = new JLabel("<html><b>Earth Metals</b></html>");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(304, 685, 77, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel label_36 = new JLabel("<html><b>Earth Metals</b></html>");
		label_36.setHorizontalAlignment(SwingConstants.CENTER);
		label_36.setBounds(391, 685, 77, 14);
		contentPane.add(label_36);
		
		String[] be = {" ", " "};
		int[] e = {0};
		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				e[0] = 0;
				be[0] = " ";
				be[1] = " ";
				label_4.setText("_____");
				label_5.setText("_____");
				compound_formula.setText("-------");
				bonding_type.setText("-------");
				e_diff.setText("-------");
				compound_name.setText("-------");
				errLbl.setText("");
			}
		});
		btnBond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				if (e[0] != 2){
					errLbl.setText("<html><p style=\"color:#FF0000\";>Please select two elements or polyatomics and hit bond</p>");
				}
				else{
					errLbl.setText("");
					double eneg1, eneg2;
					int tempindex = ArrayUtils.indexOf(elements, be[0]);
					eneg1 = elneg[tempindex];
					tempindex = ArrayUtils.indexOf(elements, be[1]);
					eneg2 = elneg[tempindex];
					if ((ArrayUtils.contains(cations, be[0]) && ArrayUtils.contains(anions, be[1])) || (ArrayUtils.contains(anions, be[0]) && ArrayUtils.contains(cations, be[1]))){
						String[] fin = ionic.main(be);
						String fn = "";
						if (fin[1].equals(fin[3])){
							fin[1] = "1";
							fin[3] = "1";
						}
						if (Integer.parseInt(fin[1]) % 2 == 0 && Integer.parseInt(fin[3]) % 2 == 0){
							fin[1] = Integer.toString(Integer.parseInt(fin[1])/2);
							fin[3] = Integer.toString(Integer.parseInt(fin[3])/2);
						}
						for (int x = 0; x < 4; x++){
							if (x == 0 || x == 2){
								fn += fin[x];
							}
							else{
								if (fin[x].equals("1")){
									fn += "";
								}
								else if (fin[x].equals("2")){
									fn += "\u2082";
								}
								else if (fin[x].equals("3")){
									fn += "\u2083";
								}
								else{
									fn += "\u2084";
								}
							}
						}
						compound_formula.setText(fn);
						bonding_type.setText("Ionic");
						if (eneg1 == 0.00 || eneg2 == 0.00){
							e_diff.setText("N/A");
						}
						else{
							if (eneg1 > eneg2){
								e_diff.setText(Double.toString(Math.round((eneg1 - eneg2) * 100d)/100d));
							}
							else if (eneg2 > eneg1){
								e_diff.setText(Double.toString(Math.round((eneg2 - eneg1) * 100d)/100d));
							}
						}
						if (ArrayUtils.contains(cations, be[0])){
							compound_name.setText(bond_cations.get(be[0]) + bond_anions.get(be[1]));
						}
						else{
							compound_name.setText(bond_cations.get(be[1]) + bond_anions.get(be[0]));
						}
					}
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "H";
					label_5.setText("<html><u>Hydrogen</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "H";
					label_5.setText("<html><u>Hydrogen</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "H";
					label_4.setText("<html><u>Hydrogen</u></html>");
				}
			}
		});
		btnHe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "He";
					label_5.setText("<html><u>Helium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "He";
					label_5.setText("<html><u>Helium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "He";
					label_4.setText("<html><u>Helium</u></html>");
				}
			}
		});
		btnLi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Li";
					label_5.setText("<html><u>Lithium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Li";
					label_5.setText("<html><u>Lithium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Li";
					label_4.setText("<html><u>Lithium</u></html>");
				}
			}
		});
		btnBe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Be";
					label_5.setText("<html><u>Beryllium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Be";
					label_5.setText("<html><u>Beryllium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Be";
					label_4.setText("<html><u>Beryllium</u></html>");
				}
			}
		});
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "B";
					label_5.setText("<html><u>Boron</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "B";
					label_5.setText("<html><u>Boron</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "B";
					label_4.setText("<html><u>Boron</u></html>");
				}
			}
		});
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "C";
					label_5.setText("<html><u>Carbon</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "C";
					label_5.setText("<html><u>Carbon</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "C";
					label_4.setText("<html><u>Carbon</u></html>");
				}
			}
		});
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "N";
					label_5.setText("<html><u>Nitrogen</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "N";
					label_5.setText("<html><u>Nitrogen</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "N";
					label_4.setText("<html><u>Nitrogen</u></html>");
				}
			}
		});
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "O";
					label_5.setText("<html><u>Oxygen</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "O";
					label_5.setText("<html><u>Oxygen</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "O";
					label_4.setText("<html><u>Oxygen</u></html>");
				}
			}
		});
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "F";
					label_5.setText("<html><u>Fluorine</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "F";
					label_5.setText("<html><u>Fluorine</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "F";
					label_4.setText("<html><u>Fluorine</u></html>");
				}
			}
		});
		btnNe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ne";
					label_5.setText("<html><u>Neon</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ne";
					label_5.setText("<html><u>Neon</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ne";
					label_4.setText("<html><u>Neon</u></html>");
				}
			}
		});
		btnNa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Na";
					label_5.setText("<html><u>Sodium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Na";
					label_5.setText("<html><u>Sodium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Na";
					label_4.setText("<html><u>Sodium</u></html>");
				}
			}
		});
		btnMg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Mg";
					label_5.setText("<html><u>Magnesium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Mg";
					label_5.setText("<html><u>Magnesium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Mg";
					label_4.setText("<html><u>Magnesium</u></html>");
				}
			}
		});
		btnAl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Al";
					label_5.setText("<html><u>Aluminum</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Al";
					label_5.setText("<html><u>Aluminum</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Al";
					label_4.setText("<html><u>Aluminum</u></html>");
				}
			}
		});
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Si";
					label_5.setText("<html><u>Silicon</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Si";
					label_5.setText("<html><u>Silicon</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Si";
					label_4.setText("<html><u>Silicon</u></html>");
				}
			}
		});
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "P";
					label_5.setText("<html><u>Phosphorus</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "P";
					label_5.setText("<html><u>Phosphorus</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "P";
					label_4.setText("<html><u>Phosphorus</u></html>");
				}
			}
		});
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "S";
					label_5.setText("<html><u>Sulfur</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "S";
					label_5.setText("<html><u>Sulfur</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "S";
					label_4.setText("<html><u>Sulfur</u></html>");
				}
			}
		});
		btnCl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Cl";
					label_5.setText("<html><u>Chlorine</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Cl";
					label_5.setText("<html><u>Chlorine</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Cl";
					label_4.setText("<html><u>Chlorine</u></html>");
				}
			}
		});
		btnAr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ar";
					label_5.setText("<html><u>Argon</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ar";
					label_5.setText("<html><u>Argon</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ar";
					label_4.setText("<html><u>Argon</u></html>");
				}
			}
		});
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "K";
					label_5.setText("<html><u>Potassium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "K";
					label_5.setText("<html><u>Potassium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "K";
					label_4.setText("<html><u>Potassium</u></html>");
				}
			}
		});
		btnCa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ca";
					label_5.setText("<html><u>Calcium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ca";
					label_5.setText("<html><u>Calcium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ca";
					label_4.setText("<html><u>Calcium</u></html>");
				}
			}
		});
		btnSc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Sc";
					label_5.setText("<html><u>Scandium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Sc";
					label_5.setText("<html><u>Scandium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Sc";
					label_4.setText("<html><u>Scandium</u></html>");
				}
			}
		});
		btnTi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ti";
					label_5.setText("<html><u>Titanium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ti";
					label_5.setText("<html><u>Titanium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ti";
					label_4.setText("<html><u>Titanium</u></html>");
				}
			}
		});
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "V";
					label_5.setText("<html><u>Vanadium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "V";
					label_5.setText("<html><u>Vanadium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "V";
					label_4.setText("<html><u>Vanadium</u></html>");
				}
			}
		});
		btnCr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Cr";
					label_5.setText("<html><u>Chromium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Cr";
					label_5.setText("<html><u>Chromium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Cr";
					label_4.setText("<html><u>Chromium</u></html>");
				}
			}
		});
		btnMn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Mn";
					label_5.setText("<html><u>Manganese</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Mn";
					label_5.setText("<html><u>Manganese</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Mn";
					label_4.setText("<html><u>Manganese</u></html>");
				}
			}
		});
		btnFe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Fe";
					label_5.setText("<html><u>Iron</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Fe";
					label_5.setText("<html><u>Iron</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Fe";
					label_4.setText("<html><u>Iron</u></html>");
				}
			}
		});
		btnCo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Co";
					label_5.setText("<html><u>Cobalt</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Co";
					label_5.setText("<html><u>Cobalt</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Co";
					label_4.setText("<html><u>Cobalt</u></html>");
				}
			}
		});
		btnNi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ni";
					label_5.setText("<html><u>Nickel</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ni";
					label_5.setText("<html><u>Nickel</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ni";
					label_4.setText("<html><u>Nickel</u></html>");
				}
			}
		});
		btnCu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Cu";
					label_5.setText("<html><u>Copper</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Cu";
					label_5.setText("<html><u>Copper</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Cu";
					label_4.setText("<html><u>Copper</u></html>");
				}
			}
		});
		btnZn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Zn";
					label_5.setText("<html><u>Zinc</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Zn";
					label_5.setText("<html><u>Zinc</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Zn";
					label_4.setText("<html><u>Zinc</u></html>");
				}
			}
		});
		btnGa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ga";
					label_5.setText("<html><u>Gallium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ga";
					label_5.setText("<html><u>Gallium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ga";
					label_4.setText("<html><u>Gallium</u></html>");
				}
			}
		});
		btnGe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ge";
					label_5.setText("<html><u>Germanium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ge";
					label_5.setText("<html><u>Germanium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ge";
					label_4.setText("<html><u>Germanium</u></html>");
				}
			}
		});
		btnAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "As";
					label_5.setText("<html><u>Arsenic</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "As";
					label_5.setText("<html><u>Arsenic</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "As";
					label_4.setText("<html><u>Arsenic</u></html>");
				}
			}
		});
		btnSe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Se";
					label_5.setText("<html><u>Selenium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Se";
					label_5.setText("<html><u>Selenium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Se";
					label_4.setText("<html><u>Selenium</u></html>");
				}
			}
		});
		btnBr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Br";
					label_5.setText("<html><u>Bromine</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Br";
					label_5.setText("<html><u>Bromine</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Br";
					label_4.setText("<html><u>Bromine</u></html>");
				}
			}
		});
		btnKr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Kr";
					label_5.setText("<html><u>Krypton</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Kr";
					label_5.setText("<html><u>Krypton</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Kr";
					label_4.setText("<html><u>Krypton</u></html>");
				}
			}
		});
		btnRb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Rb";
					label_5.setText("<html><u>Rubidium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Rb";
					label_5.setText("<html><u>Rubidium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Rb";
					label_4.setText("<html><u>Rubidium</u></html>");
				}
			}
		});
		btnSr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Sr";
					label_5.setText("<html><u>Strontium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Sr";
					label_5.setText("<html><u>Strontium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Sr";
					label_4.setText("<html><u>Strontium</u></html>");
				}
			}
		});
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Y";
					label_5.setText("<html><u>Yttrium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Y";
					label_5.setText("<html><u>Yttrium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Y";
					label_4.setText("<html><u>Yttrium</u></html>");
				}
			}
		});
		btnZr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Zr";
					label_5.setText("<html><u>Zirconium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Zr";
					label_5.setText("<html><u>Zirconium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Zr";
					label_4.setText("<html><u>Zirconium</u></html>");
				}
			}
		});
		btnNb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Nb";
					label_5.setText("<html><u>Niobium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Nb";
					label_5.setText("<html><u>Niobium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Nb";
					label_4.setText("<html><u>Niobium</u></html>");
				}
			}
		});
		btnMo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Mo";
					label_5.setText("<html><u>Molybdinum</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Mo";
					label_5.setText("<html><u>Molybdinum</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Mo";
					label_4.setText("<html><u>Molybdinum</u></html>");
				}
			}
		});
		btnTc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Tc";
					label_5.setText("<html><u>Technetium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Tc";
					label_5.setText("<html><u>Technetium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Tc";
					label_4.setText("<html><u>Technetium</u></html>");
				}
			}
		});
		btnRu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ru";
					label_5.setText("<html><u>Ruthenium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ru";
					label_5.setText("<html><u>Ruthenium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ru";
					label_4.setText("<html><u>Ruthenium</u></html>");
				}
			}
		});
		btnRh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Rh";
					label_5.setText("<html><u>Rhodium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Rh";
					label_5.setText("<html><u>Rhodium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Rh";
					label_4.setText("<html><u>Rhodium</u></html>");
				}
			}
		});
		btnPd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Pd";
					label_5.setText("<html><u>Paladium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Pd";
					label_5.setText("<html><u>Paladium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Pd";
					label_4.setText("<html><u>Paladium/u></html>");
				}
			}
		});
		btnAg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ag";
					label_5.setText("<html><u>Silver</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ag";
					label_5.setText("<html><u>Silver</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ag";
					label_4.setText("<html><u>Silver</u></html>");
				}
			}
		});
		btnCd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Cd";
					label_5.setText("<html><u>Cadmium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Cd";
					label_5.setText("<html><u>Cadmium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Cd";
					label_4.setText("<html><u>Cadmium</u></html>");
				}
			}
		});
		btnIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "In";
					label_5.setText("<html><u>Indium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "In";
					label_5.setText("<html><u>Indium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "In";
					label_4.setText("<html><u>Indium</u></html>");
				}
			}
		});
		btnSn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Sn";
					label_5.setText("<html><u>Tin</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Sn";
					label_5.setText("<html><u>Tin</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Sn";
					label_4.setText("<html><u>Tin</u></html>");
				}
			}
		});
		btnSb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Sb";
					label_5.setText("<html><u>Antimony</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Sb";
					label_5.setText("<html><u>Antimony</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Sb";
					label_4.setText("<html><u>Antimony</u></html>");
				}
			}
		});
		btnTe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Te";
					label_5.setText("<html><u>Telerium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Te";
					label_5.setText("<html><u>Telerium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Te";
					label_4.setText("<html><u>Telerium</u></html>");
				}
			}
		});
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "I";
					label_5.setText("<html><u>Iodine</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "I";
					label_5.setText("<html><u>Iodine</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "I";
					label_4.setText("<html><u>Iodine</u></html>");
				}
			}
		});
		btnXe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Xe";
					label_5.setText("<html><u>Xenon</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Xe";
					label_5.setText("<html><u>Xenon</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Xe";
					label_4.setText("<html><u>Xenon</u></html>");
				}
			}
		});
		btnCs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Cs";
					label_5.setText("<html><u>Cesium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Cs";
					label_5.setText("<html><u>Cesium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Cs";
					label_4.setText("<html><u>Cesium</u></html>");
				}
			}
		});
		btnBa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ba";
					label_5.setText("<html><u>Barium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ba";
					label_5.setText("<html><u>Barium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ba";
					label_4.setText("<html><u>Barium</u></html>");
				}
			}
		});
		btnLa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "La";
					label_5.setText("<html><u>Lanthinum</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "La";
					label_5.setText("<html><u>Lanthinum</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "La";
					label_4.setText("<html><u>Lanthinum</u></html>");
				}
			}
		});
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ce";
					label_5.setText("<html><u>Cerium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ce";
					label_5.setText("<html><u>Cerium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ce";
					label_4.setText("<html><u>Cerium</u></html>");
				}
			}
		});
		btnPr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Pr";
					label_5.setText("<html><u>Praseodymium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Pr";
					label_5.setText("<html><u>Praseodymium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Pr";
					label_4.setText("<html><u>Praseodymium</u></html>");
				}
			}
		});
		btnNd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Nd";
					label_5.setText("<html><u>Neodymium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Nd";
					label_5.setText("<html><u>Neodymium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Nd";
					label_4.setText("<html><u>Neodymium</u></html>");
				}
			}
		});
		btnPm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Pm";
					label_5.setText("<html><u>Promethium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Pm";
					label_5.setText("<html><u>Promethium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Pm";
					label_4.setText("<html><u>Promethium</u></html>");
				}
			}
		});
		btnSm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Sm";
					label_5.setText("<html><u>Samarium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Sm";
					label_5.setText("<html><u>Samarium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Sm";
					label_4.setText("<html><u>Samarium</u></html>");
				}
			}
		});
		btnEu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Eu";
					label_5.setText("<html><u>Europium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Eu";
					label_5.setText("<html><u>Europium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Eu";
					label_4.setText("<html><u>Europium</u></html>");
				}
			}
		});
		btnGd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Gd";
					label_5.setText("<html><u>Gadolinium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Gd";
					label_5.setText("<html><u>Gadolinium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Gd";
					label_4.setText("<html><u>Gadolinium</u></html>");
				}
			}
		});
		btnTb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Tb";
					label_5.setText("<html><u>Terbium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Tb";
					label_5.setText("<html><u>Terbium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Tb";
					label_4.setText("<html><u>Terbium</u></html>");
				}
			}
		});
		btnDy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Dy";
					label_5.setText("<html><u>Dysprosium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Dy";
					label_5.setText("<html><u>Dysprosium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Dy";
					label_4.setText("<html><u>Dysprosium</u></html>");
				}
			}
		});
		btnHo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ho";
					label_5.setText("<html><u>Holmium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ho";
					label_5.setText("<html><u>Holmium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ho";
					label_4.setText("<html><u>Holmium</u></html>");
				}
			}
		});
		btnEb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Eb";
					label_5.setText("<html><u>Erbium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Eb";
					label_5.setText("<html><u>Erbium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Eb";
					label_4.setText("<html><u>Erbium</u></html>");
				}
			}
		});
		btnTm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Tm";
					label_5.setText("<html><u>Thulium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Tm";
					label_5.setText("<html><u>Silver</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Tm";
					label_4.setText("<html><u>Silver</u></html>");
				}
			}
		});
		btnYb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Yb";
					label_5.setText("<html><u>Yttrbium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Yb";
					label_5.setText("<html><u>Yttrbium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Yb";
					label_4.setText("<html><u>Yttrbium</u></html>");
				}
			}
		});
		btnLu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Lu";
					label_5.setText("<html><u>Lutetium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Lu";
					label_5.setText("<html><u>Lutetium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Lu";
					label_4.setText("<html><u>Lutetium</u></html>");
				}
			}
		});
		btnHf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Hf";
					label_5.setText("<html><u>Hafnium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Hf";
					label_5.setText("<html><u>Hafnium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Hf";
					label_4.setText("<html><u>Hafnium</u></html>");
				}
			}
		});
		btnTa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ta";
					label_5.setText("<html><u>Tantalum</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ta";
					label_5.setText("<html><u>Tantalum</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ta";
					label_4.setText("<html><u>Tantalum</u></html>");
				}
			}
		});
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "W";
					label_5.setText("<html><u>Tungsten</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "W";
					label_5.setText("<html><u>Tungsten</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "W";
					label_4.setText("<html><u>Tungsten</u></html>");
				}
			}
		});
		btnRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Re";
					label_5.setText("<html><u>Rhenium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Re";
					label_5.setText("<html><u>Rhenium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Re";
					label_4.setText("<html><u>Rhenium</u></html>");
				}
			}
		});
		btnOs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Os";
					label_5.setText("<html><u>Osmium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Os";
					label_5.setText("<html><u>Osmium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Os";
					label_4.setText("<html><u>Osmium</u></html>");
				}
			}
		});
		btnIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ir";
					label_5.setText("<html><u>Iridium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ir";
					label_5.setText("<html><u>Iridium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ir";
					label_4.setText("<html><u>Iridium</u></html>");
				}
			}
		});
		btnPt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Pt";
					label_5.setText("<html><u>Platinum</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Pt";
					label_5.setText("<html><u>Platinum</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Pt";
					label_4.setText("<html><u>Platinum</u></html>");
				}
			}
		});
		btnAu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Au";
					label_5.setText("<html><u>Gold</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Au";
					label_5.setText("<html><u>Gold</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Au";
					label_4.setText("<html><u>Gold</u></html>");
				}
			}
		});
		btnHg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Hg";
					label_5.setText("<html><u>Mercury</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Hg";
					label_5.setText("<html><u>Mercury</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Hg";
					label_4.setText("<html><u>Mercury</u></html>");
				}
			}
		});
		btnTl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Tl";
					label_5.setText("<html><u>Thallium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Tl";
					label_5.setText("<html><u>Thallium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Tl";
					label_4.setText("<html><u>Thallium</u></html>");
				}
			}
		});
		btnPb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Pb";
					label_5.setText("<html><u>Lead</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Pb";
					label_5.setText("<html><u>Lead</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Pb";
					label_4.setText("<html><u>Lead</u></html>");
				}
			}
		});
		btnBi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Bi";
					label_5.setText("<html><u>Bismuth</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Bi";
					label_5.setText("<html><u>Bismuth</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Bi";
					label_4.setText("<html><u>Bismuth</u></html>");
				}
			}
		});
		btnPo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Po";
					label_5.setText("<html><u>Polonium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Po";
					label_5.setText("<html><u>Polonium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Po";
					label_4.setText("<html><u>Polonium</u></html>");
				}
			}
		});
		btnAt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "At";
					label_5.setText("<html><u>Astatine</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "At";
					label_5.setText("<html><u>Astatine</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "At";
					label_4.setText("<html><u>Astatine</u></html>");
				}
			}
		});
		btnRn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Rn";
					label_5.setText("<html><u>Radon</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Rn";
					label_5.setText("<html><u>Radon</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Rn";
					label_4.setText("<html><u>Radon</u></html>");
				}
			}
		});
		btnFr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Fr";
					label_5.setText("<html><u>Francium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Fr";
					label_5.setText("<html><u>Francium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Fr";
					label_4.setText("<html><u>Francium</u></html>");
				}
			}
		});
		btnRa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ra";
					label_5.setText("<html><u>Radium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ra";
					label_5.setText("<html><u>Radium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ra";
					label_4.setText("<html><u>Radium</u></html>");
				}
			}
		});
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ac";
					label_5.setText("<html><u>Actinium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ac";
					label_5.setText("<html><u>Actinium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ac";
					label_4.setText("<html><u>Actinium</u></html>");
				}
			}
		});
		btnTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Th";
					label_5.setText("<html><u>Thorium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Th";
					label_5.setText("<html><u>Thorium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Th";
					label_4.setText("<html><u>Thorium</u></html>");
				}
			}
		});
		btnPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Pa";
					label_5.setText("<html><u>Protactinium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Pa";
					label_5.setText("<html><u>Protactinium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Pa";
					label_4.setText("<html><u>Protactinium</u></html>");
				}
			}
		});
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "U";
					label_5.setText("<html><u>Uranium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "U";
					label_5.setText("<html><u>Uranium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "U";
					label_4.setText("<html><u>Uranium</u></html>");
				}
			}
		});
		btnNp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Np";
					label_5.setText("<html><u>Neptunium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Np";
					label_5.setText("<html><u>Neptunium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Np";
					label_4.setText("<html><u>Neptunium</u></html>");
				}
			}
		});
		btnPu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Pu";
					label_5.setText("<html><u>Plutonium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Pu";
					label_5.setText("<html><u>Plutonium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Pu";
					label_4.setText("<html><u>Plutonium</u></html>");
				}
			}
		});
		btnAm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Am";
					label_5.setText("<html><u>Americium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Am";
					label_5.setText("<html><u>Americium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Am";
					label_4.setText("<html><u>Americium</u></html>");
				}
			}
		});
		btnCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Cm";
					label_5.setText("<html><u>Curium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Cm";
					label_5.setText("<html><u>Curium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Cm";
					label_4.setText("<html><u>Curium</u></html>");
				}
			}
		});
		btnBk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Bk";
					label_5.setText("<html><u>Berkelium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Bk";
					label_5.setText("<html><u>Berkelium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Bk";
					label_4.setText("<html><u>Berkelium</u></html>");
				}
			}
		});
		btnCf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Cf";
					label_5.setText("<html><u>Californium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Cf";
					label_5.setText("<html><u>Californium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Cf";
					label_4.setText("<html><u>Californium</u></html>");
				}
			}
		});
		btnEs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Es";
					label_5.setText("<html><u>Einsteinium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Es";
					label_5.setText("<html><u>Einsteinium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Es";
					label_4.setText("<html><u>Einsteinium</u></html>");
				}
			}
		});
		btnFm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Fm";
					label_5.setText("<html><u>Fermium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Fm";
					label_5.setText("<html><u>Fermium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Fm";
					label_4.setText("<html><u>Fermium</u></html>");
				}
			}
		});
		btnMd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Md";
					label_5.setText("<html><u>Mendelevium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Md";
					label_5.setText("<html><u>Mendelevium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Md";
					label_4.setText("<html><u>Mendelevium</u></html>");
				}
			}
		});
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "No";
					label_5.setText("<html><u>Nobelium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "No";
					label_5.setText("<html><u>Nobelium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "No";
					label_4.setText("<html><u>Nobelium</u></html>");
				}
			}
		});
		btnLr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Lr";
					label_5.setText("<html><u>Lawrencium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Lr";
					label_5.setText("<html><u>Lawrencium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Lr";
					label_4.setText("<html><u>Lawrencium</u></html>");
				}
			}
		});
		btnRf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Rf";
					label_5.setText("<html><u>Rutherfordium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Rf";
					label_5.setText("<html><u>Rutherfordium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Rf";
					label_4.setText("<html><u>Rutherfordium</u></html>");
				}
			}
		});
		btnDb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Db";
					label_5.setText("<html><u>Dubnium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Db";
					label_5.setText("<html><u>Dubnium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Db";
					label_4.setText("<html><u>Dubnium</u></html>");
				}
			}
		});
		btnSg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Sg";
					label_5.setText("<html><u>Seaborgium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Sg";
					label_5.setText("<html><u>Seaborgium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Sg";
					label_4.setText("<html><u>Seaborgium</u></html>");
				}
			}
		});
		btnBh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Bh";
					label_5.setText("<html><u>Bohrium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Bh";
					label_5.setText("<html><u>Bohrium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Bh";
					label_4.setText("<html><u>Bohrium</u></html>");
				}
			}
		});
		btnHs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Hs";
					label_5.setText("<html><u>Hassium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Hs";
					label_5.setText("<html><u>Hassium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Hs";
					label_4.setText("<html><u>Hassium</u></html>");
				}
			}
		});
		btnMt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Mt";
					label_5.setText("<html><u>Meitnerium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Mt";
					label_5.setText("<html><u>Meitnerium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Mt";
					label_4.setText("<html><u>Meitnerium</u></html>");
				}
			}
		});
		btnDs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ds";
					label_5.setText("<html><u>Darmstadtium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ds";
					label_5.setText("<html><u>Darmstadtium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ds";
					label_4.setText("<html><u>Darmstadtium</u></html>");
				}
			}
		});
		btnRg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Rg";
					label_5.setText("<html><u>Roentgenium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Rg";
					label_5.setText("<html><u>Roentgenium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Rg";
					label_4.setText("<html><u>Roentgenium</u></html>");
				}
			}
		});
		btnCn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Cn";
					label_5.setText("<html><u>Copernicium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Cn";
					label_5.setText("<html><u>Copernicium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Cn";
					label_4.setText("<html><u>Copernicium</u></html>");
				}
			}
		});
		btnNh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Nh";
					label_5.setText("<html><u>Nihonium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Nh";
					label_5.setText("<html><u>Nihonium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Nh";
					label_4.setText("<html><u>Nihonium</u></html>");
				}
			}
		});
		btnFl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Fl";
					label_5.setText("<html><u>Flerovium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Fl";
					label_5.setText("<html><u>Flerovium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Fl";
					label_4.setText("<html><u>Flerovium</u></html>");
				}
			}
		});
		btnMc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Mc";
					label_5.setText("<html><u>Moscovium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Mc";
					label_5.setText("<html><u>Moscovium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Mc";
					label_4.setText("<html><u>Moscovium</u></html>");
				}
			}
		});
		btnLv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Lv";
					label_5.setText("<html><u>Livermorium</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Lv";
					label_5.setText("<html><u>Livermorium</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Lv";
					label_4.setText("<html><u>Livermorium</u></html>");
				}
			}
		});
		btnTs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Ts";
					label_5.setText("<html><u>Tennessine</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Ts";
					label_5.setText("<html><u>Tennessine</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Ts";
					label_4.setText("<html><u>Tennessine</u></html>");
				}
			}
		});
		btnOg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (e[0] == 2){
					be[1] = "Og";
					label_5.setText("<html><u>Oganesson</u></html>");
				}
				else if (e[0] == 1){
					e[0] = 2;
					be[1] = "Og";
					label_5.setText("<html><u>Oganesson</u></html>");
				}
				else{
					e[0] = 1;
					be[0] = "Og";
					label_4.setText("<html><u>Oganesson</u></html>");
				}
			}
		});
	}
}
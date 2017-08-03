package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import org.apache.commons.lang3.ArrayUtils;

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
		String[] anions = {"N", "O", "F", "P", "S", "Cl", "As", "Se", "Br"};
		String[] cations = {"Li", "Be", "Na", "Mg", "Si", "Ge", "K", "Ca", "Rb", "Sr", "Cs", "Ba", "Fr", "Ra"};
		int[] aox = {-3, -2, -1, -3, -2, -1, -3, -2, -1};
		int[] caox = {1, 2, 1, 2, 4, 4, 1, 2, 1, 2, 1, 2, 1, 2};
		setTitle("JBOND v0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		JButton btnNewButton = new JButton("H");
		btnNewButton.setToolTipText("<html>Hydrogen<br>Atomic #: 1</html>");
		btnNewButton.setBounds(10, 78, 58, 58);
		contentPane.add(btnNewButton);
		
		JButton btnLi = new JButton("Li");
		btnLi.setToolTipText("<html>Lithium<br>Atomic #: 3</html>");
		btnLi.setBounds(10, 136, 58, 58);
		contentPane.add(btnLi);
		
		JButton btnNa = new JButton("Na");
		btnNa.setToolTipText("<html>Sodium<br>Atomic #: 11</html>");
		btnNa.setBounds(10, 194, 58, 58);
		contentPane.add(btnNa);
		
		JButton btnK = new JButton("K");
		btnK.setToolTipText("<html>Potassium<br>Atomic #: 19</html>");
		btnK.setBounds(10, 252, 58, 58);
		contentPane.add(btnK);
		
		JButton btnRb = new JButton("Rb");
		btnRb.setToolTipText("<html>Rubidium<br>Atomic #: 37</html>");
		btnRb.setBounds(10, 310, 58, 58);
		contentPane.add(btnRb);
		
		JButton btnCs = new JButton("Cs");
		btnCs.setToolTipText("<html>Cesium<br>Atomic #: 55</html>");
		btnCs.setBounds(10, 368, 58, 58);
		contentPane.add(btnCs);
		
		JButton btnFr = new JButton("Fr");
		btnFr.setToolTipText("<html>Francium<br>Atomic #: 87</html>");
		btnFr.setBounds(10, 426, 58, 58);
		contentPane.add(btnFr);
		
		JButton btnBe = new JButton("Be");
		btnBe.setToolTipText("<html>Beryllium<br>Atomic #: 4</html>");
		btnBe.setBounds(68, 136, 58, 58);
		contentPane.add(btnBe);
		
		JButton btnRa = new JButton("Ra");
		btnRa.setToolTipText("<html>Radium<br>Atomic #: 88</html>");
		btnRa.setBounds(68, 426, 58, 58);
		contentPane.add(btnRa);
		
		JButton btnRf = new JButton("Rf");
		btnRf.setToolTipText("<html>Rutherfordium<br>Atomic #: 104</html>");
		btnRf.setBounds(184, 426, 58, 58);
		contentPane.add(btnRf);
		
		JButton btnDb = new JButton("Db");
		btnDb.setToolTipText("<html>Dubnium<br>Atomic #: 105</html>");
		btnDb.setBounds(242, 426, 58, 58);
		contentPane.add(btnDb);
		
		JButton btnSg = new JButton("Sg");
		btnSg.setToolTipText("<html>Seaborgium<br>Atomic #: 106</html>");
		btnSg.setBounds(300, 426, 58, 58);
		contentPane.add(btnSg);
		
		JButton btnBh = new JButton("Bh");
		btnBh.setToolTipText("<html>Bohrium<br>Atomic #: 107</html>");
		btnBh.setBounds(358, 426, 58, 58);
		contentPane.add(btnBh);
		
		JButton btnHs = new JButton("Hs");
		btnHs.setToolTipText("<html>Hassium<br>Atomic #: 108</html>");
		btnHs.setBounds(416, 426, 58, 58);
		contentPane.add(btnHs);
		
		JButton btnMt = new JButton("Mt");
		btnMt.setToolTipText("<html>Meitnerium<br>Atomic #: 109</html>");
		btnMt.setBounds(474, 426, 58, 58);
		contentPane.add(btnMt);
		
		JButton btnDs = new JButton("Ds");
		btnDs.setToolTipText("<html>Darmstadtium<br>Atomic #: 110</html>");
		btnDs.setBounds(532, 426, 58, 58);
		contentPane.add(btnDs);
		
		JButton btnRg = new JButton("Rg");
		btnRg.setToolTipText("<html>Roentgenium<br>Atomic #: 111</html>");
		btnRg.setBounds(590, 426, 58, 58);
		contentPane.add(btnRg);
		
		JButton btnCn = new JButton("Cn");
		btnCn.setToolTipText("<html>Copernicium<br>Atomic #: 112</html>");
		btnCn.setBounds(648, 426, 58, 58);
		contentPane.add(btnCn);
		
		JButton btnNh = new JButton("Nh");
		btnNh.setToolTipText("<html>Nihonium<br>Atomic #: 113</html>");
		btnNh.setBounds(706, 426, 58, 58);
		contentPane.add(btnNh);
		
		JButton btnFl = new JButton("Fl");
		btnFl.setToolTipText("<html>Flerovium<br>Atomic #: 114</html>");
		btnFl.setBounds(764, 426, 58, 58);
		contentPane.add(btnFl);
		
		JButton btnMc = new JButton("Mc");
		btnMc.setToolTipText("<html>Moscovium<br>Atomic #: 115</html>");
		btnMc.setBounds(822, 426, 58, 58);
		contentPane.add(btnMc);
		
		JButton btnLv = new JButton("Lv");
		btnLv.setToolTipText("<html>Livermorium<br>Atomic #: 116</html>");
		btnLv.setBounds(880, 426, 58, 58);
		contentPane.add(btnLv);
		
		JButton btnTs = new JButton("Ts");
		btnTs.setToolTipText("<html>Tennessine<br>Atomic #: 117</html>");
		btnTs.setBounds(938, 426, 58, 58);
		contentPane.add(btnTs);
		
		JButton btnOg = new JButton("Og");
		btnOg.setToolTipText("<html>Oganesson<br>Atomic #: 118</html>");
		btnOg.setBounds(996, 426, 58, 58);
		contentPane.add(btnOg);
		
		JButton btnBa = new JButton("Ba");
		btnBa.setToolTipText("<html>Barium<br>Atomic #: 56</html>");
		btnBa.setBounds(68, 368, 58, 58);
		contentPane.add(btnBa);
		
		JButton btnMg = new JButton("Mg");
		btnMg.setToolTipText("<html>Magnesium<br>Atomic #: 12</html>");
		btnMg.setBounds(68, 194, 58, 58);
		contentPane.add(btnMg);
		
		JButton btnCa = new JButton("Ca");
		btnCa.setToolTipText("<html>Calcium<br>Atomic #: 20</html>");
		btnCa.setBounds(68, 252, 58, 58);
		contentPane.add(btnCa);
		
		JButton btnSr = new JButton("Sr");
		btnSr.setToolTipText("<html>Strontium<br>Atomic #: 38</html>");
		btnSr.setBounds(68, 310, 58, 58);
		contentPane.add(btnSr);
		
		JButton btnY = new JButton("Y");
		btnY.setToolTipText("<html>Yttrium<br>Atomic #: 39</html>");
		btnY.setBounds(126, 310, 58, 58);
		contentPane.add(btnY);
		
		JButton btnSc = new JButton("Sc");
		btnSc.setToolTipText("<html>Scandium<br>Atomic #: 21</html>");
		btnSc.setBounds(126, 252, 58, 58);
		contentPane.add(btnSc);
		
		JButton btnTi = new JButton("Ti");
		btnTi.setToolTipText("<html>Titanium<br>Atomic #: 22</html>");
		btnTi.setBounds(184, 252, 58, 58);
		contentPane.add(btnTi);
		
		JButton btnZr = new JButton("Zr");
		btnZr.setToolTipText("<html>Zirconium<br>Atomic #: 40</html>");
		btnZr.setBounds(184, 310, 58, 58);
		contentPane.add(btnZr);
		
		JButton btnHf = new JButton("Hf");
		btnHf.setToolTipText("<html>Hafnium<br>Atomic #: 72</html>");
		btnHf.setBounds(184, 368, 58, 58);
		contentPane.add(btnHf);
		
		JButton btnV = new JButton("V");
		btnV.setToolTipText("<html>Vanadium<br>Atomic #: 23</html>");
		btnV.setBounds(242, 252, 58, 58);
		contentPane.add(btnV);
		
		JButton btnNb = new JButton("Nb");
		btnNb.setToolTipText("<html>Niobium<br>Atomic #: 41</html>");
		btnNb.setBounds(242, 310, 58, 58);
		contentPane.add(btnNb);
		
		JButton btnCr = new JButton("Cr");
		btnCr.setToolTipText("<html>Chromium<br>Atomic #: 24</html>");
		btnCr.setBounds(300, 252, 58, 58);
		contentPane.add(btnCr);
		
		JButton btnMn = new JButton("Mn");
		btnMn.setToolTipText("<html>Manganese<br>Atomic #: 25</html>");
		btnMn.setBounds(358, 252, 58, 58);
		contentPane.add(btnMn);
		
		JButton btnFe = new JButton("Fe");
		btnFe.setToolTipText("<html>Iron<br>Atomic #: 26</html>");
		btnFe.setBounds(416, 252, 58, 58);
		contentPane.add(btnFe);
		
		JButton btnRn = new JButton("Rn");
		btnRn.setToolTipText("<html>Radon<br>Atomic #: 86</html>");
		btnRn.setBounds(996, 368, 58, 58);
		contentPane.add(btnRn);
		
		JButton btnXe = new JButton("Xe");
		btnXe.setToolTipText("<html>Xenon<br>Atomic #: 54</html>");
		btnXe.setBounds(996, 310, 58, 58);
		contentPane.add(btnXe);
		
		JButton btnKr = new JButton("Kr");
		btnKr.setToolTipText("<html>Krypton<br>Atomic #: 36</html>");
		btnKr.setBounds(996, 252, 58, 58);
		contentPane.add(btnKr);
		
		JButton btnAr = new JButton("Ar");
		btnAr.setToolTipText("<html>Argon<br>Atomic #: 18</html>");
		btnAr.setBounds(996, 194, 58, 58);
		contentPane.add(btnAr);
		
		JButton btnNe = new JButton("Ne");
		btnNe.setToolTipText("<html>Neon<br>Atomic #: 10</html>");
		btnNe.setBounds(996, 136, 58, 58);
		contentPane.add(btnNe);
		
		JButton btnHe = new JButton("He");
		btnHe.setToolTipText("<html>Helium<br>Atomic #: 2</html>");
		btnHe.setBounds(996, 78, 58, 58);
		contentPane.add(btnHe);
		
		JButton btnCo = new JButton("Co");
		btnCo.setToolTipText("<html>Cobalt<br>Atomic #: 27</html>");
		btnCo.setBounds(474, 252, 58, 58);
		contentPane.add(btnCo);
		
		JButton btnNi = new JButton("Ni");
		btnNi.setToolTipText("<html>Nickel<br>Atomic #: 28</html>");
		btnNi.setBounds(532, 252, 58, 58);
		contentPane.add(btnNi);
		
		JButton btnCu = new JButton("Cu");
		btnCu.setToolTipText("<html>Copper<br>Atomic #: 29</html>");
		btnCu.setBounds(590, 252, 58, 58);
		contentPane.add(btnCu);
		
		JButton btnZn = new JButton("Zn");
		btnZn.setToolTipText("<html>Zinc<br>Atomic #: 30</html>");
		btnZn.setBounds(648, 252, 58, 58);
		contentPane.add(btnZn);
		
		JButton btnGa = new JButton("Ga");
		btnGa.setToolTipText("<html>Gallium<br>Atomic #: 31</html>");
		btnGa.setBounds(706, 252, 58, 58);
		contentPane.add(btnGa);
		
		JButton btnGe = new JButton("Ge");
		btnGe.setToolTipText("<html>Germanium<br>Atomic #: 32</html>");
		btnGe.setBounds(764, 252, 58, 58);
		contentPane.add(btnGe);
		
		JButton btnAs = new JButton("As");
		btnAs.setToolTipText("<html>Arsenic<br>Atomic #: 33</html>");
		btnAs.setBounds(822, 252, 58, 58);
		contentPane.add(btnAs);
		
		JButton btnSe = new JButton("Se");
		btnSe.setToolTipText("<html>Selenium<br>Atomic #: 34</html>");
		btnSe.setBounds(880, 252, 58, 58);
		contentPane.add(btnSe);
		
		JButton btnBr = new JButton("Br");
		btnBr.setToolTipText("<html>Bromine<br>Atomic #: 35</html>");
		btnBr.setBounds(938, 252, 58, 58);
		contentPane.add(btnBr);
		
		JButton btnF = new JButton("F");
		btnF.setToolTipText("<html>Fluorine<br>Atomic #: 9</html>");
		btnF.setBounds(938, 136, 58, 58);
		contentPane.add(btnF);
		
		JButton btnO = new JButton("O");
		btnO.setToolTipText("<html>Oxygen<br>Atomic #: 8</html>");
		btnO.setBounds(880, 136, 58, 58);
		contentPane.add(btnO);
		
		JButton btnN = new JButton("N");
		btnN.setToolTipText("<html>Nitrogen<br>Atomic #: 7</html>");
		btnN.setBounds(822, 136, 58, 58);
		contentPane.add(btnN);
		
		JButton btnC = new JButton("C");
		btnC.setToolTipText("<html>Carbon<br>Atomic #: 6</html>");
		btnC.setBounds(764, 136, 58, 58);
		contentPane.add(btnC);
		
		JButton btnB = new JButton("B");
		btnB.setToolTipText("<html>Boron<br>Atomic #: 5</html>");
		btnB.setBounds(706, 136, 58, 58);
		contentPane.add(btnB);
		
		JButton btnAl = new JButton("Al");
		btnAl.setToolTipText("<html>Aluminum<br>Atomic #: 13</html>");
		btnAl.setBounds(706, 194, 58, 58);
		contentPane.add(btnAl);
		
		JButton btnSi = new JButton("Si");
		btnSi.setToolTipText("<html>Silicon<br>Atomic #: 14</html>");
		btnSi.setBounds(764, 194, 58, 58);
		contentPane.add(btnSi);
		
		JButton btnP = new JButton("P");
		btnP.setToolTipText("<html>Phosphorus<br>Atomic #: 15</html>");
		btnP.setBounds(822, 194, 58, 58);
		contentPane.add(btnP);
		
		JButton btnS = new JButton("S");
		btnS.setToolTipText("<html>Sulfur<br>Atomic #: 16</html>");
		btnS.setBounds(880, 194, 58, 58);
		contentPane.add(btnS);
		
		JButton btnCl = new JButton("Cl");
		btnCl.setToolTipText("<html>Chlorine<br>Atomic #: 17</html>");
		btnCl.setBounds(938, 194, 58, 58);
		contentPane.add(btnCl);
		
		JButton btnTa = new JButton("Ta");
		btnTa.setToolTipText("<html>Tantalum<br>Atomic #: 73</html>");
		btnTa.setBounds(242, 368, 58, 58);
		contentPane.add(btnTa);
		
		JButton btnW = new JButton("W");
		btnW.setToolTipText("<html>Tungsten<br>Atomic #: 74</html>");
		btnW.setBounds(300, 368, 58, 58);
		contentPane.add(btnW);
		
		JButton btnMo = new JButton("Mo");
		btnMo.setToolTipText("<html>Molybdenum<br>Atomic #: 42</html>");
		btnMo.setBounds(300, 310, 58, 58);
		contentPane.add(btnMo);
		
		JButton btnTc = new JButton("Tc");
		btnTc.setToolTipText("<html>Technetium<br>Atomic #: 43</html>");
		btnTc.setBounds(358, 310, 58, 58);
		contentPane.add(btnTc);
		
		JButton btnOs = new JButton("Os");
		btnOs.setToolTipText("<html>Osmium<br>Atomic #: 76</html>");
		btnOs.setBounds(416, 368, 58, 58);
		contentPane.add(btnOs);
		
		JButton btnIr = new JButton("Ir");
		btnIr.setToolTipText("<html>Iridium<br>Atomic #: 77</html>");
		btnIr.setBounds(474, 368, 58, 58);
		contentPane.add(btnIr);
		
		JButton btnRu = new JButton("Ru");
		btnRu.setToolTipText("<html>Ruthenium<br>Atomic #: 44</html>");
		btnRu.setBounds(416, 310, 58, 58);
		contentPane.add(btnRu);
		
		JButton btnRh = new JButton("Rh");
		btnRh.setToolTipText("<html>Rhodium<br>Atomic #: 45</html>");
		btnRh.setBounds(474, 310, 58, 58);
		contentPane.add(btnRh);
		
		JButton btnPt = new JButton("Pt");
		btnPt.setToolTipText("<html>Platinum<br>Atomic #: 78</html>");
		btnPt.setBounds(532, 368, 58, 58);
		contentPane.add(btnPt);
		
		JButton btnAu = new JButton("Au");
		btnAu.setToolTipText("<html>Gold<br>Atomic #: 79</html>");
		btnAu.setBounds(590, 368, 58, 58);
		contentPane.add(btnAu);
		
		JButton btnPd = new JButton("Pd");
		btnPd.setToolTipText("<html>Paladium<br>Atomic #: 46</html>");
		btnPd.setBounds(532, 310, 58, 58);
		contentPane.add(btnPd);
		
		JButton btnHg = new JButton("Hg");
		btnHg.setToolTipText("<html>Mercury<br>Atomic #: 80</html>");
		btnHg.setBounds(648, 368, 58, 58);
		contentPane.add(btnHg);
		
		JButton btnAg = new JButton("Ag");
		btnAg.setToolTipText("<html>Silver<br>Atomic #: 47</html>");
		btnAg.setBounds(590, 310, 58, 58);
		contentPane.add(btnAg);
		
		JButton btnCd = new JButton("Cd");
		btnCd.setToolTipText("<html>Cadmium<br>Atomic #: 48</html>");
		btnCd.setBounds(648, 310, 58, 58);
		contentPane.add(btnCd);
		
		JButton btnTl = new JButton("Tl");
		btnTl.setToolTipText("<html>Thallium<br>Atomic #: 81</html>");
		btnTl.setBounds(706, 368, 58, 58);
		contentPane.add(btnTl);
		
		JButton btnIn = new JButton("In");
		btnIn.setToolTipText("<html>Indium<br>Atomic #: 49</html>");
		btnIn.setBounds(706, 310, 58, 58);
		contentPane.add(btnIn);
		
		JButton btnPb = new JButton("Pb");
		btnPb.setToolTipText("<html>Lead<br>Atomic #: 82</html>");
		btnPb.setBounds(764, 368, 58, 58);
		contentPane.add(btnPb);
		
		JButton btnBi = new JButton("Bi");
		btnBi.setToolTipText("<html>Bismuth<br>Atomic #: 83</html>");
		btnBi.setBounds(822, 368, 58, 58);
		contentPane.add(btnBi);
		
		JButton btnSn = new JButton("Sn");
		btnSn.setToolTipText("<html>Tin<br>Atomic #: 50</html>");
		btnSn.setBounds(764, 310, 58, 58);
		contentPane.add(btnSn);
		
		JButton btnPo = new JButton("Po");
		btnPo.setToolTipText("<html>Polonium<br>Atomic #: 84</html>");
		btnPo.setBounds(880, 368, 58, 58);
		contentPane.add(btnPo);
		
		JButton btnSb = new JButton("Sb");
		btnSb.setToolTipText("<html>Antimony<br>Atomic #: 51</html>");
		btnSb.setBounds(822, 310, 58, 58);
		contentPane.add(btnSb);
		
		JButton btnAt = new JButton("At");
		btnAt.setToolTipText("<html>Astatine<br>Atomic #: 85</html>");
		btnAt.setBounds(938, 368, 58, 58);
		contentPane.add(btnAt);
		
		JButton btnTe = new JButton("Te");
		btnTe.setToolTipText("<html>Telerium<br>Atomic #: 52</html>");
		btnTe.setBounds(880, 310, 58, 58);
		contentPane.add(btnTe);
		
		JButton btnI = new JButton("I");
		btnI.setToolTipText("<html>Iodine<br>Atomic #: 53</html>");
		btnI.setBounds(938, 310, 58, 58);
		contentPane.add(btnI);
		
		JButton btnRe = new JButton("Re");
		btnRe.setToolTipText("<html>Rhenium<br>Atomic #: 75</html>");
		btnRe.setBounds(358, 368, 58, 58);
		contentPane.add(btnRe);
		
		JLabel label = new JLabel("*");
		label.setBounds(136, 390, 28, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("**");
		label_1.setBounds(136, 448, 28, 14);
		contentPane.add(label_1);
		
		JButton btnLa = new JButton("La");
		btnLa.setToolTipText("<html>Lanthinum<br>Atomic #: 57</html>");
		btnLa.setBounds(184, 510, 58, 58);
		contentPane.add(btnLa);
		
		JButton btnAc = new JButton("Ac");
		btnAc.setToolTipText("<html>Actinium<br>Atomic #: 89</html>");
		btnAc.setBounds(184, 568, 58, 58);
		contentPane.add(btnAc);
		
		JButton btnCe = new JButton("Ce");
		btnCe.setToolTipText("<html>Cerium<br>Atomic #: 58</html>");
		btnCe.setBounds(242, 510, 58, 58);
		contentPane.add(btnCe);
		
		JButton btnTh = new JButton("Th");
		btnTh.setToolTipText("<html>Thorium<br>Atomic #: 90</html>");
		btnTh.setBounds(242, 568, 58, 58);
		contentPane.add(btnTh);
		
		JButton btnPr = new JButton("Pr");
		btnPr.setToolTipText("<html>Praseodymium<br>Atomic #: 59</html>");
		btnPr.setBounds(300, 510, 58, 58);
		contentPane.add(btnPr);
		
		JButton btnPa = new JButton("Pa");
		btnPa.setToolTipText("<html>Protactinium<br>Atomic #: 91</html>");
		btnPa.setBounds(300, 568, 58, 58);
		contentPane.add(btnPa);
		
		JButton btnNd = new JButton("Nd");
		btnNd.setToolTipText("<html>Neodymium<br>Atomic #: 60</html>");
		btnNd.setBounds(358, 510, 58, 58);
		contentPane.add(btnNd);
		
		JButton btnU = new JButton("U");
		btnU.setToolTipText("<html>Uranium<br>Atomic #: 92</html>");
		btnU.setBounds(358, 568, 58, 58);
		contentPane.add(btnU);
		
		JButton btnPm = new JButton("Pm");
		btnPm.setToolTipText("<html>Promethium<br>Atomic #: 61</html>");
		btnPm.setBounds(416, 510, 58, 58);
		contentPane.add(btnPm);
		
		JButton btnNp = new JButton("Np");
		btnNp.setToolTipText("<html>Neptunium<br>Atomic #: 93</html>");
		btnNp.setBounds(416, 568, 58, 58);
		contentPane.add(btnNp);
		
		JButton btnSm = new JButton("Sm");
		btnSm.setToolTipText("<html>Samarium<br>Atomic #: 62</html>");
		btnSm.setBounds(474, 510, 58, 58);
		contentPane.add(btnSm);
		
		JButton btnPu = new JButton("Pu");
		btnPu.setToolTipText("<html>Plutonium<br>Atomic #: 84</html>");
		btnPu.setBounds(474, 568, 58, 58);
		contentPane.add(btnPu);
		
		JButton btnEu = new JButton("Eu");
		btnEu.setToolTipText("<html>Europium<br>Atomic #: 63</html>");
		btnEu.setBounds(532, 510, 58, 58);
		contentPane.add(btnEu);
		
		JButton btnAm = new JButton("Am");
		btnAm.setToolTipText("<html>Americium<br>Atomic #: 95</html>");
		btnAm.setBounds(532, 568, 58, 58);
		contentPane.add(btnAm);
		
		JButton btnGd = new JButton("Gd");
		btnGd.setToolTipText("<html>Gadolinium<br>Atomic #: 64</html>");
		btnGd.setBounds(590, 510, 58, 58);
		contentPane.add(btnGd);
		
		JButton btnTb = new JButton("Tb");
		btnTb.setToolTipText("<html>Terbium<br>Atomic #: 65</html>");
		btnTb.setBounds(648, 510, 58, 58);
		contentPane.add(btnTb);
		
		JButton btnDy = new JButton("Dy");
		btnDy.setToolTipText("<html>Dysprosium<br>Atomic #: 66</html>");
		btnDy.setBounds(706, 510, 58, 58);
		contentPane.add(btnDy);
		
		JButton btnHo = new JButton("Ho");
		btnHo.setToolTipText("<html>Holmium<br>Atomic #: 67</html>");
		btnHo.setBounds(764, 510, 58, 58);
		contentPane.add(btnHo);
		
		JButton btnEb = new JButton("Er");
		btnEb.setToolTipText("<html>Erbium<br>Atomic #: 68</html>");
		btnEb.setBounds(822, 510, 58, 58);
		contentPane.add(btnEb);
		
		JButton btnTm = new JButton("Tm");
		btnTm.setToolTipText("<html>Thulium<br>Atomic #: 69</html>");
		btnTm.setBounds(880, 510, 58, 58);
		contentPane.add(btnTm);
		
		JButton btnYb = new JButton("Yb");
		btnYb.setToolTipText("<html>Ytterbium<br>Atomic #: 71</html>");
		btnYb.setBounds(938, 510, 58, 58);
		contentPane.add(btnYb);
		
		JButton btnLu = new JButton("Lu");
		btnLu.setToolTipText("<html>Lutetium<br>Atomic #: 71</html>");
		btnLu.setBounds(996, 510, 58, 58);
		contentPane.add(btnLu);
		
		JButton btnCm = new JButton("Cm");
		btnCm.setToolTipText("<html>Curium<br>Atomic #: 96</html>");
		btnCm.setBounds(590, 568, 58, 58);
		contentPane.add(btnCm);
		
		JButton btnBk = new JButton("Bk");
		btnBk.setToolTipText("<html>Berkelium<br>Atomic #: 97</html>");
		btnBk.setBounds(648, 568, 58, 58);
		contentPane.add(btnBk);
		
		JButton btnCf = new JButton("Cf");
		btnCf.setToolTipText("<html>Califormium<br>Atomic #: 98</html>");
		btnCf.setBounds(706, 568, 58, 58);
		contentPane.add(btnCf);
		
		JButton btnEs = new JButton("Es");
		btnEs.setToolTipText("<html>Einsteinium<br>Atomic #: 99</html>");
		btnEs.setBounds(764, 568, 58, 58);
		contentPane.add(btnEs);
		
		JButton btnFm = new JButton("Fm");
		btnFm.setToolTipText("<html>Fermium<br>Atomic #: 100</html>");
		btnFm.setBounds(822, 568, 58, 58);
		contentPane.add(btnFm);
		
		JButton btnMd = new JButton("Md");
		btnMd.setToolTipText("<html>Mendelvium<br>Atomic #: 101</html>");
		btnMd.setBounds(880, 568, 58, 58);
		contentPane.add(btnMd);
		
		JButton btnNo = new JButton("No");
		btnNo.setToolTipText("<html>Nobelium<br>Atomic #: 102</html>");
		btnNo.setBounds(938, 568, 58, 58);
		contentPane.add(btnNo);
		
		JButton btnLr = new JButton("Lr");
		btnLr.setToolTipText("<html>Lawrencium<br>Atomic #: 103</html>");
		btnLr.setBounds(996, 568, 58, 58);
		contentPane.add(btnLr);
		
		JLabel label_2 = new JLabel("*");
		label_2.setToolTipText("Lanthinides");
		label_2.setBounds(136, 524, 48, 30);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("**");
		label_3.setToolTipText("Actinides");
		label_3.setBounds(136, 584, 48, 30);
		contentPane.add(label_3);
		
		JLabel lblMouseOverElements = new JLabel("Mouse over elements and labels for more information");
		lblMouseOverElements.setBounds(126, 78, 310, 30);
		contentPane.add(lblMouseOverElements);
		
		JLabel lblElement = new JLabel("Element 1:");
		lblElement.setBounds(129, 11, 67, 23);
		contentPane.add(lblElement);
		
		JLabel label_4 = new JLabel("_____");
		label_4.setBounds(184, 15, 88, 14);
		contentPane.add(label_4);
		
		JLabel lblElement_1 = new JLabel("Element 2:");
		lblElement_1.setBounds(272, 11, 67, 23);
		contentPane.add(lblElement_1);
		
		JLabel label_5 = new JLabel("_____");
		label_5.setBounds(328, 15, 88, 14);
		contentPane.add(label_5);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(269, 44, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnBond = new JButton("Bond");
		btnBond.setBounds(129, 44, 89, 23);
		contentPane.add(btnBond);
		
		JLabel label_6 = new JLabel("<html><b>1</b></html>", SwingConstants.CENTER);
		label_6.setToolTipText("<html>Group 1<br>Alkali Metals</html>");
		label_6.setBounds(10, 52, 58, 26);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("<html><b>2</b></html>", SwingConstants.CENTER);
		label_7.setToolTipText("<html>Group 2<br>Alkaline Earth Metals</html>");
		label_7.setBounds(68, 110, 58, 26);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("<html><b>3</b></html>", SwingConstants.CENTER);
		label_8.setToolTipText("Group 3");
		label_8.setBounds(126, 226, 58, 26);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("<html><b>4</b></html>", SwingConstants.CENTER);
		label_9.setToolTipText("Group 4");
		label_9.setBounds(184, 226, 58, 26);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("<html><b>5</b></html>", SwingConstants.CENTER);
		label_10.setToolTipText("Group 5");
		label_10.setBounds(242, 226, 58, 26);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("<html><b>6</b></html>", SwingConstants.CENTER);
		label_11.setToolTipText("Group 6");
		label_11.setBounds(300, 226, 58, 26);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("<html><b>7</b></html>", SwingConstants.CENTER);
		label_12.setToolTipText("Group 7");
		label_12.setBounds(358, 226, 58, 26);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("<html><b>8</b></html>", SwingConstants.CENTER);
		label_13.setToolTipText("Group 8");
		label_13.setBounds(416, 226, 58, 26);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("<html><b>9</b></html>", SwingConstants.CENTER);
		label_14.setToolTipText("Group 9");
		label_14.setBounds(474, 226, 58, 26);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("<html><b>10</b><html>", SwingConstants.CENTER);
		label_15.setToolTipText("Group 10");
		label_15.setBounds(532, 226, 58, 26);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("<html><b>11</b></html>", SwingConstants.CENTER);
		label_16.setToolTipText("<html>Group 11<br>Coinage Metals</html>");
		label_16.setBounds(590, 226, 58, 26);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("<html><b>12</b></html>", SwingConstants.CENTER);
		label_17.setToolTipText("Group 12");
		label_17.setBounds(648, 226, 58, 26);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("<html><b>13</b></html>", SwingConstants.CENTER);
		label_18.setToolTipText("Group 13");
		label_18.setBounds(706, 110, 58, 26);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("<html><b>14</b></html>", SwingConstants.CENTER);
		label_19.setToolTipText("Group 14");
		label_19.setBounds(764, 110, 58, 26);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("<html><b>15</b></html>", SwingConstants.CENTER);
		label_20.setToolTipText("<html>Group 15<br>Pnictogens</html>");
		label_20.setBounds(822, 110, 58, 26);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("<html><b>16</b></html>", SwingConstants.CENTER);
		label_21.setToolTipText("<html>Group 16<br>Chalcogens</html>");
		label_21.setBounds(880, 110, 58, 26);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("<html><b>17</b></html>", SwingConstants.CENTER);
		label_22.setToolTipText("<html>Group 17<br>Halogens</html>");
		label_22.setBounds(938, 110, 58, 26);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("<html><b>18</b></html>", SwingConstants.CENTER);
		label_23.setToolTipText("<html>Group 18<br>Noble Gases</html>");
		label_23.setBounds(996, 52, 58, 26);
		contentPane.add(label_23);
		
		JSeparator st = new JSeparator();
		st.setBounds(449, 34, 243, 2);
		contentPane.add(st);
		
		JSeparator sb = new JSeparator();
		sb.setBounds(449, 152, 244, 2);
		contentPane.add(sb);
		
		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setBounds(458, 11, 46, 14);
		contentPane.add(lblOutput);
		
		JLabel lblFormulaOfBonded = new JLabel("Formula of compound:");
		lblFormulaOfBonded.setBounds(459, 43, 146, 14);
		contentPane.add(lblFormulaOfBonded);
		
		JSeparator sl = new JSeparator();
		sl.setOrientation(SwingConstants.VERTICAL);
		sl.setBounds(448, 34, 2, 119);
		contentPane.add(sl);
		
		JSeparator sr = new JSeparator();
		sr.setOrientation(SwingConstants.VERTICAL);
		sr.setBounds(692, 34, 2, 119);
		contentPane.add(sr);
		
		JLabel lblBondingType = new JLabel("Bonding type:");
		lblBondingType.setBounds(460, 99, 72, 14);
		contentPane.add(lblBondingType);
		
		JLabel lblElectronegativityDifference = new JLabel("Electronegativity difference:");
		lblElectronegativityDifference.setBounds(459, 127, 146, 14);
		contentPane.add(lblElectronegativityDifference);
		
		JLabel compound_formula = new JLabel("-------");
		compound_formula.setBounds(576, 44, 106, 14);
		contentPane.add(compound_formula);
		
		JLabel bonding_type = new JLabel("-------");
		bonding_type.setBounds(536, 99, 46, 14);
		contentPane.add(bonding_type);
		
		JLabel e_diff = new JLabel("-------");
		e_diff.setBounds(606, 127, 46, 14);
		contentPane.add(e_diff);
		
		JLabel lblNameOfCompound = new JLabel("Name of compound:");
		lblNameOfCompound.setBounds(460, 71, 105, 14);
		contentPane.add(lblNameOfCompound);
		
		JLabel compound_name = new JLabel("-------");
		compound_name.setBounds(563, 71, 46, 14);
		contentPane.add(compound_name);
		
		JLabel errLbl = new JLabel("");
		errLbl.setBounds(449, 158, 243, 36);
		contentPane.add(errLbl);
		
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
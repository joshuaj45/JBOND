package src;

import org.apache.commons.lang3.ArrayUtils;
import java.lang.Math;

public class ionic {
	public static String[] main(String[] be, int[] tmc, int tms){
		String[] anions = {"N", "P", "As", "Sb", "O", "S", "Se", "Te", "Po", "F", "Cl", "Br", "I", "At", "Ts"};
		String[] cations = {"Li", "Be", "Na", "Mg", "Si", "Ge", "K", "Ca", "Rb", "Sr", "Cs", "Ba", "Fr", "Ra", "B", "Ag", "Cd", "Zn", "Y", "Sc", "La"};
		String[] tm = {"Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr"};
		int[] aox = {-3, -3, -3, -3, -2, -2, -2, -2, -2, -1, -1, -1, -1, -1, -1};
		int[] caox = {1, 2, 1, 2, 4, 4, 1, 2, 1, 2, 1, 2, 1, 2, 3, 1, 2, 2, 3, 3, 3};
		String[] fin = {"", "", "", ""};
		int en1 = 0;
		int en2 = 0;
		if (tms >= 0) {
			en1 = tmc[tms];
		}
		else {
			if (ArrayUtils.contains(cations, be[0])) {
				en1 = caox[ArrayUtils.indexOf(cations, be[0])];
			}
			else {
				en1 = caox[ArrayUtils.indexOf(cations, be[1])];
			}
		}
		if (ArrayUtils.contains(tm, be[0]) || ArrayUtils.contains(cations, be[0])) {
			en2 = aox[ArrayUtils.indexOf(anions, be[1])];
		}
		else {
			en2 = aox[ArrayUtils.indexOf(anions, be[0])];
		}
		/**if (!(ArrayUtils.contains(tm, be[0])) && !(ArrayUtils.contains(tm, be[1]))) {
			en1 = (ArrayUtils.contains(anions, be[0]))? aox[ArrayUtils.indexOf(anions, be[0])] : caox[ArrayUtils.indexOf(cations, be[0])];
			en2 = (ArrayUtils.contains(anions, be[1]))? aox[ArrayUtils.indexOf(anions, be[1])] : caox[ArrayUtils.indexOf(cations, be[1])];
		}
		else {
			en1 = (ArrayUtils.contains(anions, be[0]))? aox[ArrayUtils.indexOf(anions, be[0])] : tmc[tms];
			en2 = (ArrayUtils.contains(anions, be[1]))? aox[ArrayUtils.indexOf(anions, be[1])] : tmc[tms];
		}**/
		if (ArrayUtils.contains(anions, be[0])){
			fin[0] = be[1];
			fin[1] = Integer.toString(Math.abs(en2));
			fin[2] = be[0];
			fin[3] = Integer.toString(Math.abs(en1));
		}
		else{
			fin[0] = be[0];
			fin[1] = Integer.toString(Math.abs(en2));
			fin[2] = be[1];
			fin[3] = Integer.toString(Math.abs(en1));
		}
		return fin;
	}
}

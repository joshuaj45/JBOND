package src;

import org.apache.commons.lang3.ArrayUtils;
import java.lang.Math;

public class ionic {
	public static String[] main(String[] be){
		String[] anions = {"N", "O", "F", "P", "S", "Cl", "As", "Se", "Br"};
		String[] cations = {"Li", "Be", "Na", "Mg", "Si", "Ge", "K", "Ca", "Rb", "Sr", "Cs", "Ba", "Fr", "Ra"};
		int[] aox = {-3, -2, -1, -3, -2, -1, -3, -2, -1};
		int[] caox = {1, 2, 1, 2, 4, 4, 1, 2, 1, 2, 1, 2, 1, 2};
		int en1 = (ArrayUtils.contains(anions, be[0]))? aox[ArrayUtils.indexOf(anions, be[0])] : caox[ArrayUtils.indexOf(cations, be[0])];
		int en2 = (ArrayUtils.contains(anions, be[1]))? aox[ArrayUtils.indexOf(anions, be[1])] : caox[ArrayUtils.indexOf(cations, be[1])];
		String[] fin = {"", "", "", ""};
		if (ArrayUtils.contains(anions, be[0])){
			fin[0] = be[1];
			fin[1] = Integer.toString(Math.abs(en1));
			fin[2] = be[0];
			fin[3] = Integer.toString(Math.abs(en2));
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

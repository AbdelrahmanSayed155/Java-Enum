/**
 * 
 */
package com.abdelrahman.enumm;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 22, 2018
 */
public class MainClassForEnum {

	 enum Weak2 {
		SUNDAY,MONDAY,TUESDAY,WENSDAY,THURSDAY,FRIDAY,SATURDAY

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Outer Enum");
		for(Weak w:Weak.values()){
			System.out.println(w);
		}
		System.out.println("Inner Enum");
		for(Weak2 w:Weak2.values()){
			System.out.println(w);
		}
		
		Weak2 weak2 = Weak2.THURSDAY;
		System.out.println(weak2);
		System.out.println(" Enum have abstract Methods");
		for(AbstractEnumWEK abstractEnumWEK:AbstractEnumWEK.values()){
			System.out.println(abstractEnumWEK +" DEESC {"+abstractEnumWEK.showDesc()+"}");
		}
	}
	

}

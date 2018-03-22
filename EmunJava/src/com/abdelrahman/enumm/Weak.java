/**
 * 
 */
package com.abdelrahman.enumm;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 22, 2018
 */

public enum Weak {
	SUNDAY(1),MONDAY(2),TUESDAY(3),WENSDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
	private int num;
	private Weak(int num){
		this.num = num;
	}
	
//	public int getNum(){
//		return this.num;
//	}

}

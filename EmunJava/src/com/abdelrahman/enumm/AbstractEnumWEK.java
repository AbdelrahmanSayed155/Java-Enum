/**
 * 
 */
package com.abdelrahman.enumm;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 22, 2018
 */
public enum AbstractEnumWEK {
	
	MOM {
		@Override
		public String showDesc() {
			
			return "MOOM";
		}
	},
	
	NON {
		@Override
		public String showDesc() {
			// TODO Auto-generated method stub
			return "NULL";
		}
	} ,
	FOF {
		@Override
		public String showDesc() {
			// TODO Auto-generated method stub
			return "FOOL";
		}
	}
	, GOG {
		@Override
		public String showDesc() {
			// TODO Auto-generated method stub
			return "GOOL";
		}
	};
	
	
	public abstract String showDesc();

}

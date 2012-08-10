package rel.z;


/**
 * 
 * @author zb
 *
 */
public class YoursTruly 
{
	
	/**
	 * 
	 * @param v
	 * @return contraction of motion while removing the laws of physical entities from time.
	 * 
	 * 		According to Einstein, at the speed of light the passing of time approaches zero.	
	 * 		
	 * 
	 * 	The fourth Lorentz Transformation returns the square root of one minus velocity squared over the speed of light squared.
	 * 		Reducing this to the square root of one minus the square root of velocity squared over the speed of light squared gives us..
	 * 		one minus velocity over the speed of light.
	 * 		
	 * 		Time not only flies when you're having fun, it can go in reverse.
	 */
	public static double simplifiedLorentzContraction(double v)
	{
		return 1 - (v / Basics.speedOfLightInVacuo());
	}
}

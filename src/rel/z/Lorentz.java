package rel.z;

import java.util.HashMap;


public class Lorentz 
{
	static HashMap<String, Double> lorentzTransformation = new HashMap<String, Double>();
	
	/**
	 * 
	 * @param x 'horizontal' axis
	 * @param y 'vertical' axis
	 * @param z 'depth' axis
	 * @param t time
	 * @param v velocity
	 * @return HashMap containing the results of the four transformations.
	 */	
	public static HashMap<String, Double> Transformation(double x, double y, double z, double t, double v)
	{				
		lorentzTransformation.put("First", first(x, v, t));		
		lorentzTransformation.put("Second", second(y));
		lorentzTransformation.put("Third", third(z));
		lorentzTransformation.put("Fourth", fourth(x, v, t));
		
		return lorentzTransformation;		
	}
	
	
	/**
	 * 
	 * @param x 'horizontal' axis
	 * @param v velocity	
	 * @param t 
	 * @return x' of given 'frame' or 'position'
	 */
	static double first(double x, double v, double t)
	{		
		return (x-v*t) / contractionInDirectionOfMotion(v);		
	}
	
	
	/**
	 * 
	 * @param y y'
	 * @return constant y
	 */	
	static double second(double y)
	{		
		return y;		
	}
	
	
	/**
	 * 
	 * @param z z'
	 * @return constant z
	 */
	static double third(double z)
	{		
		return z;
	}
	
	
	/**
	 * 
	 * @param x
	 * @param v
	 * @param t
	 * @return time t' of given 'frame' or 'position'
	 */
	static double fourth(double x, double v, double t)
	{
		return (t - (v / (Basics.speedOfLightInVacuoSquared())) * x) / contractionInDirectionOfMotion(v);
				
	}
	
	
	/**
	 * 
	 * @param v 
	 * @return 
	 */
	public static double contractionInDirectionOfMotion(double v)
	{
		return Math.sqrt(1 - ((v*v) / (Basics.speedOfLightInVacuoSquared())) );
		
	}
	
	
	/**
	 * 
	 * @param v
	 * @return
	 */	
	static double factor(double v)
	{
		return 1 / contractionInDirectionOfMotion(v);
	}
}
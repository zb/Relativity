package rel.z;

import java.util.HashMap;

public class Galilei 
{
	static HashMap<String, Double> galileanTransformation = new HashMap<String, Double>();
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @param t
	 * @param v
	 * @return
	 */
	HashMap<String, Double> Transformation(double x, double y, double z, double t, double v)
<<<<<<< HEAD
	{				
		galileanTransformation.put("First", first(x, v, t));
		galileanTransformation.put("Second", second(y));
		galileanTransformation.put("Third", third(z));
		galileanTransformation.put("Fourth", fourth(t));
=======
	{		
		HashMap<String, Double> galileianTransformation = new HashMap<String, Double>();
		
		galileianTransformation.put("First", first(x, v, t));
		galileianTransformation.put("Second", second(y));
		galileianTransformation.put("Third", third(z));
		galileianTransformation.put("Fourth", fourth(t));
>>>>>>> f087ac7240b4c412ac590de991fb02d882c69b88
		
		return galileianTransformation;		
	}
	
	
	/**
	 * 
	 * @param x
	 * @param v
	 * @param t
	 * @return variable x
	 */
	double first(double x, double v, double t)
	{
		return x - v*t;
	}
	
	
	/**
	 * 
	 * @param y
	 * @return constant y
	 */
	double second(double y)
	{
		return y;
	}
	
	
	/**
	 * 
	 * @param z
	 * @return constant z
	 */
	double third(double z)
	{
		return z;
	}
	
	
	/**
	 * 
	 * @param t
	 * @return constant time
	 */
	double fourth(double t)
	{
		return t;
	}
}
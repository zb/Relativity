package rel.z;

import java.util.HashMap;

public class Galilei 
{
	static HashMap<String, Double> galileianTransformation = new HashMap<String, Double>();

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
	{				

		galileianTransformation.put("First", first(x, v, t));
		galileianTransformation.put("Second", second(y));
		galileianTransformation.put("Third", third(z));
		galileianTransformation.put("Fourth", fourth(t));

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


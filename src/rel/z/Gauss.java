package rel.z;

import java.util.HashMap;

public class Gauss 
{
	static HashMap<String, Double> uCurvePointShift = new HashMap<String, Double>();
	
	/**
	 * 
	 * @param u Gaussian coordinate u
	 * @param v	Gaussian coordinate v
	 * @param d assumed angle. yaw. curve. curl. depth. height. over there.
	 * @return Point P', dependent upon u and v of input P.
	 */
	public static HashMap<String, Double> uShift(double u, double v, double d)
	{		
		double u2 = u + d*u;
		double v2 = v + d*v;
		
		uCurvePointShift.put("u", u2);
		uCurvePointShift.put("v", v2);
		
		return uCurvePointShift;
	}

}

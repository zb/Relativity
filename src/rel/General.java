package rel;

import rel.z.Newton;


public class General 
{
	
	/**
	 * 
	 * @param d
	 * @param s
	 * @param u
	 * @param v
	 * @return
	 */
	double twoDimensionalEuclideanContinuum(double d, double s, double u, double v)
	{
		return (d * Math.pow(u,  2)) + (d * Math.pow(v,  2));
	}
	
	/**
	 * 
	 * @param d
	 * @param x1
	 * @param x2
	 * @param x3
	 * @param x4
	 * @return
	 */
	double fourDimensionalRegionallySmallEuclideanContinua(double d, double x1, double x2, double x3, double x4)
	{
		return ( d* Math.pow(x1,  2)) + (d * Math.pow(x2, 2)) + (d * Math.pow(x3, 2)) + (d * Math.pow(x4, 2));
	}
	
	
	boolean isGravitationalMassEqualToInertialMass(double a, double f, double iof, double im)
	{
		if (Newton.gravitationalMass(f, iof) == Newton.inertialMass(a, f))	
		{
			return true;
		}		
		return false;
	}
	
}

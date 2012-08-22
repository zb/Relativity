package rel.z;

public class Newton 
{
	
	/**
	 * 
	 * @param im Inertial Mass
	 * @param ag Acceleration of Gravity
	 * @return f force
	 */
	double force(double im, double ag)
	{
		return im * ag;
	}
	
	
	/**
	 * 
	 * @param gm Gravitational Mass
	 * @param iof Intensity of Gravitational Field
	 * @return f force
	 */
	double forceWithGravitationAsCauseOfAcceleration(double gm, double iof)
	{
		return gm * iof;
	}
	
	
	/**
	 * 
	 * @param gm Gravitational Mass
	 * @param im Inertial Mass
	 * @return acceleration / Intensity of Gravitational Field
	 */
	double newtonianAcceleration(double gm, double im)
	{
		return gm / im;
	}
	
	
	/**
	 * 
	 * @param f
	 * @param iof
	 * @return
	 */
	public static double gravitationalMass(double f, double iof )
	{
		return f / iof;
	}
	
	/**
	 * 
	 * @param a
	 * @param im
	 * @param iof
	 * @return
	 */
	public static double gravitationalMassWithAccelerationGiven(double a, double im, double iof)
	{
		return a / iof * im;
	}
	
	
	/**
	 * 
	 * @param a
	 * @param F
	 * @return im inferred from Newton's calculations
	 */
	public static double inertialMass(double a, double F )
	{
		return F / a;
	}
	
	
	/**
	 * 
	 * @param a
	 * @param gm
	 * @param iof
	 * @return imfa inferred from Newton's calculations
	 */
	public static double inertialMassFromAcceleration(double a, double gm, double iof)
	{
		return a / iof * gm;
	}
}
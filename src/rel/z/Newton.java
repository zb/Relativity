package rel.z;

public class Newton 
{
	
	/**
	 * 
	 * @param im Inertial Mass
	 * @param ag Acceleration of Gravity
	 * @return
	 */
	double force(double im, double ag)
	{
		return im * ag;
	}
	
	
	/**
	 * 
	 * @param gm Gravitational Mass
	 * @param iof Intensity of Gravitational Field
	 * @return
	 */
	double forceWithGravitationAsCauseOfAcceleration(double gm, double iof)
	{
		return gm * iof;
	}
	
	
	/**
	 * 
	 * @param gm Gravitational Mass
	 * @param im Inertial Mass
	 * @param iof Intensity of Gravitational Field
	 * @return
	 */
	double newtonianAcceleration(double gm, double im, double iof)
	{
		return (gm / im) * iof;
	}
}
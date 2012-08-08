package rel.z;


public class Maxwell 
{		
	/**
	 * Faraday-Maxwell
	 * @param Eo
	 * @param v
	 * @param m
	 * @return
	 */
	double requiredEnergyOfBody(double Eo, double v, double m)
	{
		
		double numerator = ( (m + (Eo / (Basics.speedOfLightInVacuoSquared())) ) * (Basics.speedOfLightInVacuoSquared()) );
		
		return numerator / Lorentz.contractionInDirectionOfMotion(v);
	}
	

}
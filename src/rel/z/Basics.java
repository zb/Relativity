package rel.z;

public class Basics {

	/**
	 * 
	 * @return the speed of light in km/second -- 299,792.458
	 */
	public static double speedOfLightInVacuo()
	{
		return 299792.458;
	}
	
	
	/**
	 * 
	 * @return the speed of light^2 in km/second
	 */
	public static double speedOfLightInVacuoSquared()
	{
		return Math.pow(speedOfLightInVacuo(), 2);
	}
}
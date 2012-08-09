package rel.z;

public class Fizeau 
{
	
	/**
	 * 
	 * @param v
	 * @param w
	 * @param c
	 * @return
	 */
	double fizeausPropagationOfLightWithRespectToLiquid(double v, double w, double c)
	{
		return w + (v * (1 - (1 / (indexOfRefractionOfLiquid(c,w)*indexOfRefractionOfLiquid(c,w)))));
	}
	
	/**
	 * 
	 * @param c
	 * @param w
	 * @return n index of refraction of liquid
	 */
	double indexOfRefractionOfLiquid(double c, double w)
	{
	 return c / w;	
	}
	
}

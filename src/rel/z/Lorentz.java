package rel.z;

import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author zb
 * 
 * Need to add derivatives for non-congruent x-axes.
 *
 */
public class Lorentz 
{
	static List<HashMap<String, Double>> lorentzTransformations;
		
	static HashMap<String, Double> lorentzTransformation;
	

	public static HashMap<String, Double> Transformation(double x, double y, double z, double t, double v)
	{				
		lorentzTransformation.put("First", first(x, v, t));		
		lorentzTransformation.put("Second", second(y));
		lorentzTransformation.put("Third", third(z));
		lorentzTransformation.put("Fourth", fourth(x, v, t));
		
		return lorentzTransformation;		
	}
	
	

	public static List<HashMap<String, Double>> Transformations(double x, double y, double z, double t, double v)
	{				
		lorentzTransformation.put("First", first(x, v, t));		
		lorentzTransformation.put("Second", second(y));
		lorentzTransformation.put("Third", third(z));
		lorentzTransformation.put("Fourth", fourth(x, v, t));
		
		lorentzTransformations.add(lorentzTransformation);
		
		return lorentzTransformations;		
	}
	
	

	public static double first(double x, double v, double t)
	{		
		return (x-v*t) / contractionInDirectionOfMotion(v);		
	}
	
	

	public static double second(double y)
	{		
		return y;		
	}
	
	

	public static double third(double z)
	{		
		return z;
	}
	

	public static double fourth(double x, double v, double t)
	{
		return (t - (v / (Basics.speedOfLightInVacuoSquared())) * x) / contractionInDirectionOfMotion(v);
				
	}
	
	

	public static double contractionInDirectionOfMotion(double v)
	{
	 	if (v < 0) return v - Math.sqrt(1 - ((v*v) / (Basics.speedOfLightInVacuoSquared())) );		
		return Math.sqrt(1 - ((v*v) / (Basics.speedOfLightInVacuoSquared())) );		
	}
	
	public static double contractionAgainstDirectionfOfMotion(double v)
	{		
		return Math.sqrt(1 + ((v*v) / (Basics.speedOfLightInVacuoSquared())) );		
		
	}
	
	
	static double factor(double v)
	{
		return 1 / contractionInDirectionOfMotion(v);
	}
}
package rel.z;

public class Minkowski {
	
	
	double x1(double x)
	{
		return x;
	}
	
	double x2(double y)
	{
		return y;
	}
	
	double x3(double z)
	{
		return z;
	}
	
	public static double x4(double t)
	{
		return Math.sqrt(-1) * Basics.speedOfLightInVacuo() * t;
	}

}

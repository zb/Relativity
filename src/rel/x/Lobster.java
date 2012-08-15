package rel.x;


/**
 * Lobster to serve as both observer moving in space and as object 
 * moving relative to liquid.
 * Still need to create the pot. Water refraction. waves. planet. star. system...
 * @author zach
 *
 */
public class Lobster 
{
	
	private double m;
	private double v;
	private double r;
	
	
	private double x;
	private double y;
	private double z;
	private double t;
	
	private int k;
	
	private double xSlope;
	private double ySlope;
	private double zSlope;
	
	
	
	/**
	 * Simple Lobster
	 * @param m
	 * @param v
	 * @param r rotation
	 * @param x
	 * @param y
	 * @param z
	 * @param t
	 */
	public Lobster(double m, double v, double r, double x, double y, double z, double t)
	{
		this.m = m;
		this.v = v;
		this.r = r;
		
		this.x = x;
		this.y = y;
		this.z = z;
		this.t = t;
	}
	
	
	/**
	 * Sophisticated Lobster
	 * @param m
	 * @param v
	 * @param r rotation.. horizontal for now
	 * @param x
	 * @param y
	 * @param z
	 * @param t
	 * @param xSlope
	 * @param ySlope
	 * @param zSlope
	 */
	public Lobster(double m, double v, double r, double x, double y, double z, double t,
			double xSlope, double ySlope, double zSlope)
	{
		this.m = m;
		this.v = v;
		this.x = x;
		this.y = y;
		this.z = z;
		this.t = t;
		
		this.xSlope = xSlope;
		this.ySlope = ySlope;
		this.zSlope = zSlope;
	}
	
	void squeal() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	
	void clawAttack()
	{
		System.exit(0);
	}
}
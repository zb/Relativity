package rel.y;


import rel.z.Lorentz;

public class Clock 
{
	
	private double t;
	private double distanceTravelled;
	
	/**
	 * 
	 * @param v
	 * @param t some value between 0 and 1
	 */
	public Clock(double v, double t)
	{
				
		this.t = t * Lorentz.contractionInDirectionOfMotion(v);
		this.distanceTravelled = t * v;		
	}	


	
	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}

	public double getDistanceTravelled() {
		return distanceTravelled;
	}

	public void setDistanceTravelled(double distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
}
package rel.y;

import rel.z.Basics;
import rel.z.Lorentz;


/**
 * 
 * @author zb
 * 	
 */
public class LorentzTransformation 
{
	private double v;	
	private double c = Basics.speedOfLightInVacuo();

	private double x;
	private double y;
	private double z;
	private double t;
	
	
	private int whichK;
	private int k;
	
	public LorentzTransformation(double x, double y, double z, double t, double v, int whichK)
	{
		this.x = Lorentz.first(x, v, t);
		this.y = Lorentz.second(y);
		this.z = Lorentz.third(z);
		this.t = Lorentz.fourth(x, v, t);
		
		this.k = whichK;
	}

	public double getV() {
		return v;
	}

	public void setV(double v) {
		this.v = v;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
}
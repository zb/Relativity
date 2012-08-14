package rel.y;

import rel.z.Basics;
import rel.z.Minkowski;

/**
 * 
 * @author zb
 *
 */
public class MinkowskiSpace 
{
	private double v;
	
	private double x;
	private double y;
	private double c = Basics.speedOfLightInVacuo();
	private double t;
	
	private double x1;
	private double x2;
	private double x3;
	private double x4;
	
	private int whichK;
	private int k;
	
	

	public MinkowskiSpace(double x, double y, double c, double t, double v, int whichK)	
	{		
		this.x1 = x;
		this.x2 = y;
		this.x3 = c;
		this.x4 = Minkowski.x4(t);
		
		this.v = v;
		this.c = c;
		this.k = whichK;		
	}



	public double getV() {
		return v;
	}



	public void setV(double v) {
		this.v = v;
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



	public double getC() {
		return c;
	}



	public void setC(double c) {
		this.c = c;
	}



	public double getT() {
		return t;
	}



	public void setT(double t) {
		this.t = t;
	}



	public double getX1() {
		return x1;
	}



	public void setX1(double x1) {
		this.x1 = x1;
	}



	public double getX2() {
		return x2;
	}



	public void setX2(double x2) {
		this.x2 = x2;
	}



	public double getX3() {
		return x3;
	}



	public void setX3(double x3) {
		this.x3 = x3;
	}



	public double getX4() {
		return x4;
	}



	public void setX4(double x4) {
		this.x4 = x4;
	}



	public int getWhichK() {
		return whichK;
	}



	public void setWhichK(int whichK) {
		this.whichK = whichK;
	}



	public int getK() {
		return k;
	}



	public void setK(int k) {
		this.k = k;
	}


}
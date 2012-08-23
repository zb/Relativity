package rel;

import java.util.List;

import rel.x.GodsFishTank;
import rel.x.Lobster;

public class K 
{
	private double x;
	private double y;
	private double z;
	
	private double gftT;
	private double lT;
	
	private double k;
	private double K;
	
	private GodsFishTank gft;
	private Lobster l;
	
	private double gv;
	private double lv;
	
	private double gftX;
	private double gftY;
	private double gftZ;
	
	private double lX;
	private double lY;
	private double lZ;
	
	private double kineticEnergyOfGft;
	private double kineticEnergyOfLobster;
	
	
	
	K(GodsFishTank gft)
	{
		this.gft = gft;
		
		this.l = gft.getL();	
		
		this.gv = gft.getV();
		
		this.lv = l.getV();
		
		this.kineticEnergyOfGft = gft.getKineticEnergy();
		this.kineticEnergyOfLobster = l.getKineticEnergy();
		
	}
	
	private void nextK(K k)
	{
		k.setK(k.getK() + 1);		
		
		gft.setX(gft.getX() + gft.getXSlope() );
		gft.setY(gft.getY() + gft.getYSlope() );
		gft.setZ(gft.getZ() + gft.getZSlope() );
		
		l = gft.getL();
		
		l.setX(l.getX() + l.getXSlope());
		l.setY(l.getY() + l.getYSlope());
		l.setZ(l.getZ() + l.getZSlope());		
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

	public double getK() {
		return K;
	}
	public void setK(double k) {
		K = k;
	}
	public GodsFishTank getGft() {
		return gft;
	}
	public void setGft(GodsFishTank gft) {
		this.gft = gft;
	}
	public Lobster getL() {
		return l;
	}
	public void setL(Lobster l) {
		this.l = l;
	}
	public double getGv() {
		return gv;
	}
	public void setGv(double gv) {
		this.gv = gv;
	}
	public double getLv() {
		return lv;
	}
	public void setLv(double lv) {
		this.lv = lv;
	}
	public double getGftX() {
		return gftX;
	}
	public void setGftX(double gftX) {
		this.gftX = gftX;
	}
	public double getGftY() {
		return gftY;
	}
	public void setGftY(double gftY) {
		this.gftY = gftY;
	}
	public double getGftZ() {
		return gftZ;
	}
	public void setGftZ(double gftZ) {
		this.gftZ = gftZ;
	}
	public double getlX() {
		return lX;
	}
	public void setlX(double lX) {
		this.lX = lX;
	}
	public double getlY() {
		return lY;
	}
	public void setlY(double lY) {
		this.lY = lY;
	}
	public double getlZ() {
		return lZ;
	}
	public void setlZ(double lZ) {
		this.lZ = lZ;
	}
	public double getKineticEnergyOfGft() {
		return kineticEnergyOfGft;
	}
	public void setKineticEnergyOfGft(double kineticEnergyOfGft) {
		this.kineticEnergyOfGft = kineticEnergyOfGft;
	}
	public double getKineticEnergyOfLobster() {
		return kineticEnergyOfLobster;
	}
	public void setKineticEnergyOfLobster(double kineticEnergyOfLobster) {
		this.kineticEnergyOfLobster = kineticEnergyOfLobster;
	}
	
	
	


}

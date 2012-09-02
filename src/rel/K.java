package rel;

import java.util.List;

import rel.x.GodsFishTank;
import rel.x.Lobster;
import rel.z.Lorentz;

public class K 
{
	private double gm;
	private double gx;
	private double gy;
	private double gz;
	private double gt;
	
	private double lm;
	private double lx;
	private double ly;
	private double lz;
	private double lt;

	private int k;
	
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
	
	private static List<K> kList;
	
	private K newK;
	private GodsFishTank newGft;
	private Lobster newL;
	
	
	
	private double kineticEnergyOfGft;
	private double kineticEnergyOfLobster;
	
	
	// I've yet to test this - logic dictates this.l reassigns an instance of l, but I can't be sure.
	K(GodsFishTank gft)
	{
		this.gft = gft;
		
		this.l = gft.getL();	
		
		this.gv = gft.getV();
		
		this.lv = l.getV();
		
		this.gt = gft.getT();
		this.lt = l.getT();
		
		this.kineticEnergyOfGft = gft.getKineticEnergy();
		this.kineticEnergyOfLobster = l.getKineticEnergy();
		
	}
	
	public static List<K> klist()
	{		
		return kList;		
	}
	
	
	/**
	 * 
	 * @param k
	 * @return new K with updated parameters for L, Gft, and K after storing old L, Gft, and K in kList
	 */
	private K nextK(K k, List<K> kList)
	{		
			
		
		this.gft = k.getGft();
		this.gv = gft.getV();
		
		this.gx = gft.getX();
		this.gy = gft.getY();
		this.gz = gft.getZ();
		this.gt = gft.getT();		
		
		
		this.l = gft.getL();
		
		this.lm = l.getM();
		this.lv = l.getV();
		
		this.lx = l.getX();
		this.ly = l.getY();
		this.lz = l.getZ();
		this.lt = l.getT();
		this.lm = l.getM();
		
		
		// Create new L from old L and translate anew.
		Lobster newL = new Lobster(gm, gv, gx, gy, gz, gt);
		
		newL.setX(Lorentz.first(lx,  lv, lt));
		newL.setY(Lorentz.second(ly));
		newL.setZ(Lorentz.third(lz));	
		newL.setT(Lorentz.fourth(lx,  lv, lt));
		
		// Create new Gft from old Gft and new L and translate anew.I went with a spherical gft as this nullifies rotation and greatly reduces(if not effectively eliminates) 'angles' of impact
		GodsFishTank newGft = new GodsFishTank(newL, gft.getRadius(), gft.getV());
		
		newGft.setX(Lorentz.first(gx, gv, gt));
		newGft.setY(Lorentz.second(gy));
		newGft.setZ(Lorentz.third(gz));
		newGft.setT(Lorentz.fourth(gx, gv, gt));		
		
		// Create new K from new GFT
		K newK = new K(newGft);		
		
		newK.setK(k.getK() + 1);	
		
		//Store old, unchanged K in List
		kList.add(k);
		
		return newK;
	}	
	



	public double getGx() {
		return gx;
	}

	public void setGx(double gx) {
		this.gx = gx;
	}

	public double getGy() {
		return gy;
	}

	public void setGy(double gy) {
		this.gy = gy;
	}

	public double getGz() {
		return gz;
	}

	public void setGz(double gz) {
		this.gz = gz;
	}

	public double getGt() {
		return gt;
	}

	public void setGt(double gt) {
		this.gt = gt;
	}

	public double getLx() {
		return lx;
	}

	public void setLx(double lx) {
		this.lx = lx;
	}

	public double getLy() {
		return ly;
	}

	public void setLy(double ly) {
		this.ly = ly;
	}

	public double getLz() {
		return lz;
	}

	public void setLz(double lz) {
		this.lz = lz;
	}

	public double getLt() {
		return lt;
	}

	public void setLt(double lt) {
		this.lt = lt;
	}

	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
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

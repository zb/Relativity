package rel;

import java.util.List;

import rel.x.GodsFishTank;
import rel.x.Lobster;

public class K 
{
	private double x;
	private double y;
	private double z;
	private double t;
	
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
	
	private void nextK(GodsFishTank gft)
	{
		this.k = k++;
		
		this.l = gft.getL();
		
		this.gftX += gft.getXSlope();
		this.gftY += gft.getYSlope();
		this.gftZ += gft.getZSlope();
		
		this.lX += l.getXSlope();
		this.lY += l.getYSlope();
		this.lZ += l.getZSlope();
		
		
	}

}

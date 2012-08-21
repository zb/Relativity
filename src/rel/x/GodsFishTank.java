package rel.x;

import rel.Special;

public class GodsFishTank 
{		
		private Lobster L;

		private double volume;
		private double height;
		private double length;
		private double width;	
		private double v;
		private double hr;
		private double vr;
		
		private double m;
		private double kineticEnergy;
		
		private double relativeVelocity; // lobster to fishtank.
		private double relativeKineticEnergy; //ditto.
		
		

		/**
		 * Rectangular GFT
		 * @param L
		 * @param height
		 * @param length
		 * @param width
		 * @param v
		 * @param r
		 * @param hr
		 * @param vr
		 */
		public GodsFishTank(Lobster L, double height, double length, double width, double v, double hr, double vr)
		{
			this.L = L;			
			
			this.v = v;
			this.hr = hr;
			this.vr = vr;	
			
			this.volume = height * length * width;			
			this.m = this.volume * cubicKiloMeterOfWater();
			
			// ok. here. does a lobster going backward relative to god's fish tank contribute to the gft's kinetic energy?
			// i think not, my friends.	although he may after the gft hits something. yes, this lobster is a he.
			this.kineticEnergy = Special.kineticEnergyOfMassM(m, v);			
		}
		
		
		/**
		 * Spherical GFT
		 * @param L
		 * @param width
		 * @param depth
		 * @param v
		 * @return 
		 */
		public GodsFishTank(Lobster L, double radius, double v)
		{
			this.L = L;
			this.v = v;	
			
			this.volume = (4/3) *  Math.PI * Math.pow(radius, 3);	
			this.m = this.volume * cubicKiloMeterOfWater();
			this.kineticEnergy = Special.kineticEnergyOfMassM(m, v);	
		}
		
		
		/**
		 * Cubical GFT
		 * @param L
		 * @param side
		 * @param v
		 * @param r
		 * @param hr
		 * @param vr
		 */
		public GodsFishTank(Lobster L, double length, double v, double hr, double vr)
		{
			this.L = L;
			
			this.hr = hr;
			this.vr = vr;			

			this.volume = Math.pow(length, 3);
			this.m = this.volume * cubicKiloMeterOfWater();
			this.kineticEnergy = Special.kineticEnergyOfMassM(m, v);		
		}
		
		
		
		double positiveLobsterCollision(Lobster L, GodsFishTank gft)
		{
			relativeVelocity = gft.getV() - L.getV();
			relativeKineticEnergy = Special.kineticEnergyOfMassM(L.getM(), relativeVelocity);
						
			return Special.newAmountOfEnergy(relativeKineticEnergy, relativeVelocity, gft.getM());
		}
		
		
		// HMM.
		double negativeLobsterCollision()
		{
			return 0;
		}
		
		/**
		 *
		 * @return weight in metric tons
		 */
		double cubicKiloMeterOfWater()
		{
			return 10000;
		}
		

		
		

		public Lobster getL() {
			return L;
		}


		public void setL(Lobster l) {
			L = l;
		}


		public double getVolume() {
			return volume;
		}


		public void setVolume(double volume) {
			this.volume = volume;
		}


		public double getHeight() {
			return height;
		}


		public void setHeight(double height) {
			this.height = height;
		}


		public double getLength() {
			return length;
		}


		public void setLength(double length) {
			this.length = length;
		}


		public double getWidth() {
			return width;
		}


		public void setWidth(double width) {
			this.width = width;
		}


		public double getV() {
			return v;
		}


		public void setV(double v) {
			this.v = v;
		}


		public double getHr() {
			return hr;
		}


		public void setHr(double hr) {
			this.hr = hr;
		}


		public double getVr() {
			return vr;
		}


		public void setVr(double vr) {
			this.vr = vr;
		}


		public double getM() {
			return m;
		}


		public void setM(double m) {
			this.m = m;
		}


		public double getKineticEnergy() {
			return kineticEnergy;
		}


		public void setKineticEnergy(double kineticEnergy) {
			this.kineticEnergy = kineticEnergy;
		}


		public double getRelativeVelocity() {
			return relativeVelocity;
		}


		public void setRelativeVelocity(double relativeVelocity) {
			this.relativeVelocity = relativeVelocity;
		}
		
		
			
		
		
		


}

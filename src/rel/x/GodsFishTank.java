package rel.x;

import rel.Special;

public class GodsFishTank 
{		
		private Lobster l;

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
		public GodsFishTank(Lobster l, double height, double length, double width, double v, double hr, double vr)
		{
			this.l = l;			
			
			this.v = v;
			this.hr = hr;
			this.vr = vr;	
			
			this.volume = height * length * width;			
			this.m = this.volume * cubicKilometerOfWater();
			
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
		public GodsFishTank(Lobster l, double radius, double v)
		{
			this.l = l;
			this.v = v;	
			
			this.volume = (4/3) *  Math.PI * Math.pow(radius, 3);	
			this.m = this.volume * cubicKilometerOfWater();
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
		public GodsFishTank(Lobster l, double length, double v, double hr, double vr)
		{
			this.l = l;
			
			this.hr = hr;
			this.vr = vr;			

			this.volume = Math.pow(length, 3);
			this.m = this.volume * cubicKilometerOfWater();
			this.kineticEnergy = Special.kineticEnergyOfMassM(m, v);		
		}
		
		
		
		double lobsterCollision(Lobster l, GodsFishTank gft)
		{
			relativeVelocity = l.getV() - gft.getV();
			relativeKineticEnergy = Special.kineticEnergyOfMassM(l.getM(), relativeVelocity);
						
			return Special.newAmountOfEnergy(relativeKineticEnergy, relativeVelocity, gft.getM());
		}
		
		
		
		/**
		 *
		 * @return weight in metric tons
		 */
		double cubicKilometerOfWater()
		{
			return 10000;
		}
		

		
		

		public Lobster getL() {
			return l;
		}


		public void setL(Lobster l) {
			this.l = l;
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

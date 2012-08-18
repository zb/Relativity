package rel.x;

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
			this.volume = height * length * width;			
		
			this.v = v;
			this.hr = hr;
			this.vr = vr;			
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
			this.volume = (4/3) *  Math.PI * Math.pow(radius, 3);
			
			this.v = v;
			
			
			
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
			this.volume = Math.pow(length, 3);
			
			this.hr = hr;
			this.vr = vr;
		}
		
		
		/**
		 *
		 * @return weight in kg
		 */
		double cubicMeterOfWater()
		{
			return 1000;
		}
		
		
		


}

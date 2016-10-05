package eulersMethod;

public class EulersMethod {

	double l = .001;
	static double x0 = 1;
	static double y0 = 0;
	int amtOfPoints = 10000;
	int howOftenToPrint = 1000;
	
	double[] xvals;
	double[] yvals;
	
	private double dxdy(double x, double y){
		//return x/y;
		//return 2*x;
		//return Math.pow(Math.E, x);
		return 1-y;
	}//dxdy
	
	public static void main(String[] args){
		EulersMethod GO = new EulersMethod(x0, y0);
		GO.go();
	}//main
	
	public EulersMethod(double x, double y){
		xvals = new double[amtOfPoints];
		yvals = new double[amtOfPoints];
		xvals[0] = x;
		yvals[0] = y;
	}//EulersMethod
	
	private void go(){
		printPoint(0);
		for(int i = 1; i < amtOfPoints; i ++){
			xvals[i] = xvals[i-1] + l;
			yvals[i] = yvals[i-1] + dxdy(xvals[i-1],yvals[i-1])*l;
			if(i % howOftenToPrint == 0){
				printPoint(i);
			}
		}
	}//go
	
	private void printPoint(int index){
		System.out.println(xvals[index] + "\t" + yvals[index]);
	}//printPoint
}//EulersMethod

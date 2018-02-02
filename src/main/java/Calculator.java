public class Calculator {

    public int add(int i, int j){
        return i + j;
    }

    public int subtract(int b, int l){
        return b - l;
    }

    public int multiply(int n, int o){
        return n * o;
    }

    public int divide(int a, int p){
        return a / p;
    }

    public int square(int s){
        return s * s;
    }

    public double squareRoot(double g){
        return Math.sqrt(g);
    }

    public double  exponents(double p, double u){
        return Math.pow(p, u);
    }

    public double sine(double f){
        f = Math.toRadians(f);
        return Math.sin(f);
    }

    public double cosine(double w) {
       w = Math.toRadians(w);
        return Math.cos(w);
    }

    public double tan(double t) {
      t =  Math.toRadians(t);
        return Math.tan(t);
    }
}

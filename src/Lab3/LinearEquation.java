package Lab3;

public class LinearEquation {
    // Data field
    int a,b,c,d,e,f;

    // Constructor
    LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Get list
    public int getA() {return a;}
    public int getB() {return b;}
    public int getC() {return c;}
    public int getD() {return d;}
    public int getE() {return e;}
    public int getF() {return f;}

    // isSolvable method
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    // getX and getY method
    public int getX() {return (e*d - b*f)/(a*d - b*c);}
    public int getY() {return (a*f - e*c)/(a*d - b*c);}
}

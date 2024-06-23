public class prac2_1{
    int k,i,j,m,n;
    float f,g;
    char c;
    public prac2_1(){//constructor
        i = j = k = 2;
        m = n = 5;
        f = 12.0f;
        g = 4.0f;
        c = 'X';
    }
    public void practicals(){
        System.out.println(k + 12 * m);
        System.out.println(m / j);
        System.out.println(n % j);
        System.out.println(m / j * j);
        System.out.println(f + 10*5 +g);
        // ++i; // used
        i += 1;  // used 
        System.out.println(i * n);

    }
    public static void main(String[] args){
        prac2_1 obj = new prac2_1();
        obj.practicals();
    }
}
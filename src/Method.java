public class Method {
    double a,b,c;

    public Method(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    boolean isRightTriangle(){
        if((a>b&&a>c&&b*b+c*c==a*a)||(b>a&&b>c&&a*a+c*c==b*b)||(c>a&&c>b&&b*b+a*a==c*c)){
            return true;
        }
        else{
            return false;
        }
    }
}

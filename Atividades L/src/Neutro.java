public class Neutro {
    private double a;

        public Neutro(double a){
            this.a = a;
        }

            public void setA(double newA){
                this.a = newA;
                 if( newA > 0){
                        System.out.println("P");
                    } else {
                        System.out.println("N");
                    }
            }

            public double getA(){
                return a;
            }
}

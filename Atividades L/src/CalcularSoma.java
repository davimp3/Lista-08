public class CalcularSoma{
    private int somar, n1, n2, n3;

        public CalcularSoma(int n1, int n2, int n3){
            this.n1 = n1;
            this.n2 = n2;
            this.n3 = n3;
        }

            public void setN1(int n1n){
                this.n1 = n1n;                
            }

            public void setN2(int n2n){
                this.n2 = n2n;
            }

            public void setN3(int n3n){
                this.n3 = n3n;                
            }

            public int getSomar(){
                return n1 + n2 + n3;
            }
}
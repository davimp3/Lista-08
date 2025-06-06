public class Produto {
    private double imposto, custo;

        public Produto(double imposto, double custo){
            this.custo = custo;
            this.imposto = imposto;
        }

            public double getImposto(){
                return this.imposto;
            }

            public void setImposto(double novoImposto){
                this.imposto = novoImposto;
            }

            public double getCusto(){
                return this.custo;
            }

            public void setCusto(double novoCusto){
                this.custo = novoCusto;
            }

            public double getSomaImposto(){
                return (custo*imposto)+custo;
            }

}

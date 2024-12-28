public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2024;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.5;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamentos populares!");
        }else{
            System.out.println("Outros lançamentos!");
        }

        if(incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Permitido");
        }else{
            System.out.println("Necessário pagamento");
        }
    }
}

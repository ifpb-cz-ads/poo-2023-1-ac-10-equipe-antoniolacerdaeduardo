public class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;


    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public int getIdade(){
        return idade;
    }
    public double getNotaMatematica(){
        return notaMatematica;
    }
    public double getNotaPortugues(){
        return notaPortugues;
    }
    public double getNotaGeografia(){
        return notaGeografia;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setNotaMatematica(double notaMatematica){
        this.notaMatematica = notaMatematica;
    }
    public void setNotaPortugues(double notaPortugues){
        this.notaPortugues = notaPortugues;
    }
    public void setNotaGeografia(double notaGeografia){
        this.notaGeografia = notaGeografia;
    }


    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);
    }

    public void imprimir(double mNota, double pNota, double gNota){
        System.out.println("Nome: " + nome);
        System.out.println("Nota Matemática: " + mNota);
        System.out.println("Nota Portugues: " + pNota);
        System.out.println("Nota Geografia: " + gNota);
    }


}

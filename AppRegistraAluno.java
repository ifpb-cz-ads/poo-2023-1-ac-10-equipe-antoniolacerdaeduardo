public class AppRegistraAluno {
    public static void main(String[] args){
        RegistraAluno aluno = new RegistraAluno();
        aluno.setNome("Antonio");
        aluno.setIdade(24);
        aluno.setEndereco("Jardim Oasis");
        aluno.setNotaMatematica(10);
        aluno.setNotaGeografia(10);
        aluno.setNotaPortugues(10);

        aluno.imprimir();
    }
}

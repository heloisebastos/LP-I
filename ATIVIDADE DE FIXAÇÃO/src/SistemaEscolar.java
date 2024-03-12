
public class SistemaEscolar {
 private String aluno;
 private String matricula;
 
 SistemaEscolar(String aluno,String matricula){
	 this.aluno = aluno;
	 this.matricula=matricula;
 }

public String getAluno() {
	return aluno;
}

public void setAluno(String aluno) {
	this.aluno = aluno;
}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

@Override
public String toString() {
	return "SistemaEscolar [Aluno=" + aluno + ": matricula=" + matricula + "]";
}
 
 
 
}

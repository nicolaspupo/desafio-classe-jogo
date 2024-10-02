package classes;

public class heroGenerator {
    private String nome;
    private int idade;
    private String tipo;

public heroGenerator(String nome, int idade, String tipo) {
    this.nome = nome;
    this.idade = idade;
    this.tipo = tipo;
    }

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public String atacar() {
    String ataque;
    if (this.getTipo().equals("mago")) {
        ataque = "usando magia";
    } else if(this.getTipo().equals("guerreiro")) {
        ataque = "usando espada";
    } else if(this.getTipo().equals("monge")) {
        ataque = "usando artes marciais";
    } else if(this.getTipo().equals("ninja")) {
        ataque = "usando shuriken";
    } else {
        ataque = "sem ataque";
    }
    return "O " + this.getTipo() + " atacou " + ataque;
}
}


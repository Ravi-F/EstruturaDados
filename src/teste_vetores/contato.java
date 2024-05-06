package teste_vetores;

import java.util.Objects;

public class contato {

    private String nome;
    private String telefone;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof contato contato)) return false;
        return Objects.equals(nome, contato.nome) && Objects.equals(telefone, contato.telefone) && Objects.equals(email, contato.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone, email);
    }

    @Override
    public String toString() {
        return "contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public contato() {
    }

    public contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

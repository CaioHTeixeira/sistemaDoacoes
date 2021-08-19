package Model;

/**
 *
 * @author caiot
 */
public class Usuario {
    
    private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    private String tipoPessoa;

    public Usuario() {
    }
    
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario(String nome, String senha, String email, String tipoPessoa) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipoPessoa = tipoPessoa;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}

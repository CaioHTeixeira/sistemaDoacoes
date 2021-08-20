package Model;

<<<<<<< HEAD
import java.util.ArrayList;

=======
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
/**
 *
 * @author caiot
 */
public class Usuario {
    
<<<<<<< HEAD
    private int id;
=======
    private int idUsuario;
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
    private String nome;
    private String email;
    private String senha;
    private String tipoPessoa;
<<<<<<< HEAD
    private ArrayList<Item> listaItensUsuario;
=======
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a

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

<<<<<<< HEAD
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

=======
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
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
<<<<<<< HEAD
    
    public ArrayList<Item> getListaItensUsuario() {
        return listaItensUsuario;
    }

    public void setListaItensUsuario(ArrayList<Item> listaItensUsuario) {
        this.listaItensUsuario = listaItensUsuario;
    }
=======
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
}

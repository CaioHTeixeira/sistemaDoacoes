package Model;

/**
 *
 * @author caiot
 */
public class Item {
    
<<<<<<< HEAD
=======
    private int idItem;
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
    private int quantidade;
    private String tipoItem;
    private String descricao;
    private String cidade;
<<<<<<< HEAD
    private String fotoItem;
=======
    private String caminhoFotoItem;
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a

    public Item() {
    }

<<<<<<< HEAD
    public Item(int quantidade, String tipoItem, String descricao, String cidade, String fotoItem) {
=======
    public Item(int idItem, int quantidade, String tipoItem, String descricao, String cidade, String caminhoFotoItem) {
        this.idItem = idItem;
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
        this.quantidade = quantidade;
        this.tipoItem = tipoItem;
        this.descricao = descricao;
        this.cidade = cidade;
<<<<<<< HEAD
        this.fotoItem = fotoItem;
=======
        this.caminhoFotoItem = caminhoFotoItem;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

<<<<<<< HEAD
    public String getFotoItem() {
        return fotoItem;
    }

    public void setFotoItem(String fotoItem) {
        this.fotoItem = fotoItem;
=======
    public String getCaminhoFotoItem() {
        return caminhoFotoItem;
    }

    public void setCaminhoFotoItem(String caminhoFotoItem) {
        this.caminhoFotoItem = caminhoFotoItem;
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
    }
}

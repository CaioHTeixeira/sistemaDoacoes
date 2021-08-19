package Model;

/**
 *
 * @author caiot
 */
public class Item {
    
    private int idItem;
    private int quantidade;
    private String tipoItem;
    private String descricao;
    private String cidade;
    private String caminhoFotoItem;

    public Item() {
    }

    public Item(int idItem, int quantidade, String tipoItem, String descricao, String cidade, String caminhoFotoItem) {
        this.idItem = idItem;
        this.quantidade = quantidade;
        this.tipoItem = tipoItem;
        this.descricao = descricao;
        this.cidade = cidade;
        this.caminhoFotoItem = caminhoFotoItem;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
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

    public String getCaminhoFotoItem() {
        return caminhoFotoItem;
    }

    public void setCaminhoFotoItem(String caminhoFotoItem) {
        this.caminhoFotoItem = caminhoFotoItem;
    }
}

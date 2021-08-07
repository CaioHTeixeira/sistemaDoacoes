/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;

/**
 *
 * @author caiot
 */
public class Item {
    
    private int quantidade;
    private String tipoItem;
    private String descricao;
    private String cidade;
    private Image fotoItem;

    public Item() {
    }

    public Item(int quantidade, String tipoItem, String descricao, String cidade, Image fotoItem) {
        this.quantidade = quantidade;
        this.tipoItem = tipoItem;
        this.descricao = descricao;
        this.cidade = cidade;
        this.fotoItem = fotoItem;
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

    public Image getFotoItem() {
        return fotoItem;
    }

    public void setFotoItem(Image fotoItem) {
        this.fotoItem = fotoItem;
    }
    
    
}

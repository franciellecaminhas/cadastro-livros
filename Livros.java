package com.senac.trabalhocolaborativo;

public class Livros {
    private int codigo;
    private String nomeLivro;
    private String isbn;
    private String editora;
    private String autor;
    private String categoria;
    private String anuPub;
    private String quant;
    private String resumo;
    
    // Métodos
    public void voltar(){
        
    }
    public void limpar(){
    
    }
    public void salva(){
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEditora() {
        return editora;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getAnuPub() {
        return anuPub;
    }

    public String getQuant() {
        return quant;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setAnuPub(String anuPub) {
        this.anuPub = anuPub;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }
    
}

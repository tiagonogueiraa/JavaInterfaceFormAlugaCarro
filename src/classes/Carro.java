/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author alunoces
 */
public class Carro {
    
    private String código;
    private String nome;
    private String marca;
    private String modelo;
    private float preco;
    private float valorLocacao;
    private int diasParaLocacao;

    public Carro() {
        this.código = código;
        this.nome = nome;
        this.marca = "Fiat";
        this.modelo = "Sedan";
        this.preco = preco;
        this.valorLocacao = valorLocacao;
        this.diasParaLocacao = diasParaLocacao;
    }
    
    public double calcularValorMulta(int qtdDiasLocados)
    {
        double multa = 0;
        
        if(qtdDiasLocados > diasParaLocacao)
        {
            double difDias = qtdDiasLocados - diasParaLocacao; 
            
           multa = (difDias * valorLocacao) * 1.15;
                    
        }
                 
         return multa;
               
    }
    
    
    public double calcularValorAluguel(int qtdDiasLocacao, double valorLocacao, double multa)
    {
       double valorAluguel = (qtdDiasLocacao * valorLocacao) + multa;
       
       return valorAluguel;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public int getDiasParaLocacao() {
        return diasParaLocacao;
    }

    public void setDiasParaLocacao(int diasParaLocacao) {
        this.diasParaLocacao = diasParaLocacao;
    }
    

    
    
    
    
    
}

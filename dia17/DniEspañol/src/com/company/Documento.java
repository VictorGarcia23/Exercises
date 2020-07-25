package com.company;

public class Documento {
    private String numeroDni = "";
    private String nombreApellidos = "";
    private String sexo = "";
    private int peso = 0;
    private int altura = 0;


    public Documento(String numeroDni, String nombreApellidos, String sexo, int peso, int altura) {
        this.numeroDni = numeroDni;
        this.nombreApellidos = nombreApellidos;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNumeroDni() {
        return numeroDni;
    }

    public void setNumeroDni(String numeroDni) {
        this.numeroDni = numeroDni;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo= sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    public  int getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public float getimc(int imc){
        imc = ;
        return imc;
    }

}

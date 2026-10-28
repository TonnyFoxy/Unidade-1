package br.ufpb.titureco;

public class AtrativoTuristico {

    private String nome;
    private double latitude;
    private double longitude;

    private String comoChegar;
    private String cidade;
    private String estado;

    public AtrativoTuristico() {
        this.nome = "";
        this.latitude = 0.0;
        this.longitude  = 0.0;
        this.comoChegar = "";
        this.cidade = "";
        this.estado = "";
    }

    public AtrativoTuristico(String nome, double latitude, double longitude, String comoChegar, String cidade,
            String estado) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude  = longitude;
        this.comoChegar = comoChegar;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        long temp;
        temp = Double.doubleToLongBits(latitude);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((comoChegar == null) ? 0 : comoChegar.hashCode());
        result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AtrativoTuristico other = (AtrativoTuristico) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(other.latitude))
            return false;
        if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude))
            return false;
        if (comoChegar == null) {
            if (other.comoChegar != null)
                return false;
        } else if (!comoChegar.equals(other.comoChegar))
            return false;
        if (cidade == null) {
            if (other.cidade != null)
                return false;
        } else if (!cidade.equals(other.cidade))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        return true;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return double return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return double return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return String return the comoChegar
     */
    public String getComoChegar() {
        return comoChegar;
    }

    /**
     * @param comoChegar the comoChegar to set
     */
    public void setComoChegar(String comoChegar) {
        this.comoChegar = comoChegar;
    }

    /**
     * @return String return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return String return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

}

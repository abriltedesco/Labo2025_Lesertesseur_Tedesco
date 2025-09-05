public class Cliente {
    private String cuit;
    private String razonSocial;
    private String telefono;
    private String tipoEmpresa;

    public Cliente(String cuit, String razonSocial, String telefono, String tipoEmpresa) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }
}

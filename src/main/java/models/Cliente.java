package models;

public class Cliente {
  private String nombre;
  private String idCliente;
  private String email;
  private String telefono;
  private Pago medioPago;
  public Cliente(String nombre, String email, String telefono){
      this.nombre = nombre;
      this.email = email;
      this.telefono = telefono;
  }

    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefono() {
        return telefono;
    }
}

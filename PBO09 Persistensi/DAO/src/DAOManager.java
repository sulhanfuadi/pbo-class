/*
 * Nama File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 * Pembuat : Sulhan Fuadi (24060123130115)
 * Tanggal : 15 Mei 2025
*/

public class DAOManager {
  private PersonDAO personDAO;

  public void setPersonDAO(PersonDAO person) {
    personDAO = person;
  }

  public PersonDAO getPersonDAO() {
    return personDAO;
  }
}

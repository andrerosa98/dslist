package projections;


public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition(); // Adicionado para corresponder à consulta SQL
}

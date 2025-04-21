package com.devsuperior.dslist.projections;


public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition(); // Adicionado para corresponder à consulta SQL
}

package com.oussema.pieces.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Pieces {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPiece;
    private String nomPiece;
    private String model;
    private Double prixPiece;
    private Date dateCreation;
    private String imageUrl; // New field for image URL

    @ManyToOne
    private Nature nature;

    // Default constructor
    public Pieces() {
        super();
    }

    // Constructor
    public Pieces(String nomPiece, Double prixPiece, Date dateCreation, String model, String imageUrl) {
        super();
        this.nomPiece = nomPiece;
        this.prixPiece = prixPiece;
        this.dateCreation = dateCreation;
        this.model = model;
        this.imageUrl = imageUrl;
    }

    // Getters and setters
    public Long getIdPiece() {
        return idPiece;
    }

    public void setIdPiece(Long idPiece) {
        this.idPiece = idPiece;
    }

    public String getNomPiece() {
        return nomPiece;
    }

    public void setNomPiece(String nomPiece) {
        this.nomPiece = nomPiece;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrixPiece() {
        return prixPiece;
    }

    public void setPrixPiece(Double prixPiece) {
        this.prixPiece = prixPiece;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Nature getNature() {
        return nature;
    }

    public void setNature(Nature nature) {
        this.nature = nature;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Pieces [idPiece=" + idPiece + ", nomPiece=" + nomPiece + ", model=" + model + ", prixPiece=" + prixPiece + ", dateCreation=" + dateCreation + ", imageUrl=" + imageUrl + "]";
    }
}

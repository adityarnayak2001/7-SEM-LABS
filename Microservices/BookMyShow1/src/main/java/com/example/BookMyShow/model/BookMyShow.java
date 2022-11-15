package com.example.BookMyShow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.ArrayList;

@Entity
@Table
public class BookMyShow{
    @Column
    private String movieName;
    @Column
    private int noOfSeats;
    @Column
    private String movieId;
    @Id
    private String custId;
    @Column
    private String hallNo;
    @Column
    private Double price;

    public BookMyShow(String movieName, int noOfSeats, String movieId, String custId, String hallNo, Double price) {
        this.movieName = movieName;
        this.noOfSeats = noOfSeats;
        this.movieId = movieId;
        this.custId = custId;
        this.hallNo = hallNo;
        this.price = price;
    }
    public BookMyShow(){

    }
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void updateNoOfSeats(int noOfSeats) {
        this.noOfSeats=noOfSeats;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getHallNo() {
        return hallNo;
    }

    public void setHallNo(String hallNo) {
        this.hallNo = hallNo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}


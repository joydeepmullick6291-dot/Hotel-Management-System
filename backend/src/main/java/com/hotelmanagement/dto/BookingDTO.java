package com.hotelmanagement.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class BookingDTO {
    @NotNull private Long roomId;
    @NotNull @FutureOrPresent private LocalDate checkInDate;
    @NotNull @FutureOrPresent private LocalDate checkOutDate;
    private BigDecimal totalPrice;
    private String bookingStatus;
    private String confirmationCode;
    public BookingDTO() {}
    public BookingDTO(Long roomId, LocalDate checkInDate, LocalDate checkOutDate, BigDecimal totalPrice, String bookingStatus, String confirmationCode) {
        this.roomId=roomId; this.checkInDate=checkInDate; this.checkOutDate=checkOutDate; this.totalPrice=totalPrice; this.bookingStatus=bookingStatus; this.confirmationCode=confirmationCode;
    }
    public Long getRoomId(){return roomId;} public void setRoomId(Long roomId){this.roomId=roomId;}
    public LocalDate getCheckInDate(){return checkInDate;} public void setCheckInDate(LocalDate d){this.checkInDate=d;}
    public LocalDate getCheckOutDate(){return checkOutDate;} public void setCheckOutDate(LocalDate d){this.checkOutDate=d;}
    public BigDecimal getTotalPrice(){return totalPrice;} public void setTotalPrice(BigDecimal v){this.totalPrice=v;}
    public String getBookingStatus(){return bookingStatus;} public void setBookingStatus(String v){this.bookingStatus=v;}
    public String getConfirmationCode(){return confirmationCode;} public void setConfirmationCode(String v){this.confirmationCode=v;}
}
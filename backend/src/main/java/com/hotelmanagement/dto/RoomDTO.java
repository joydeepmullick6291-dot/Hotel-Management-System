package com.hotelmanagement.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public class RoomDTO {
    private Long id;
    @NotNull private Long hotelId;
    @NotBlank private String roomNumber;
    @NotBlank private String roomType;
    @NotNull private BigDecimal pricePerNight;
    private Integer capacity;
    private String description;
    private Boolean isAvailable;
    public RoomDTO() {}
    public RoomDTO(Long id, Long hotelId, String roomNumber, String roomType, BigDecimal pricePerNight, Integer capacity, String description, Boolean isAvailable) {
        this.id=id; this.hotelId=hotelId; this.roomNumber=roomNumber; this.roomType=roomType; this.pricePerNight=pricePerNight; this.capacity=capacity; this.description=description; this.isAvailable=isAvailable;
    }
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public Long getHotelId(){return hotelId;} public void setHotelId(Long hotelId){this.hotelId=hotelId;}
    public String getRoomNumber(){return roomNumber;} public void setRoomNumber(String roomNumber){this.roomNumber=roomNumber;}
    public String getRoomType(){return roomType;} public void setRoomType(String roomType){this.roomType=roomType;}
    public BigDecimal getPricePerNight(){return pricePerNight;} public void setPricePerNight(BigDecimal pricePerNight){this.pricePerNight=pricePerNight;}
    public Integer getCapacity(){return capacity;} public void setCapacity(Integer capacity){this.capacity=capacity;}
    public String getDescription(){return description;} public void setDescription(String description){this.description=description;}
    public Boolean getIsAvailable(){return isAvailable;} public void setIsAvailable(Boolean isAvailable){this.isAvailable=isAvailable;}
}
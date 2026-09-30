package com.hotelmanagement.service;
import com.hotelmanagement.dto.RoomDTO; import com.hotelmanagement.entity.Hotel; import com.hotelmanagement.entity.Room; import com.hotelmanagement.repository.HotelRepository; import com.hotelmanagement.repository.RoomRepository; import org.springframework.beans.factory.annotation.Autowired; import org.springframework.stereotype.Service; import org.springframework.transaction.annotation.Transactional; import java.util.List;
@Service public class RoomService {
 @Autowired private RoomRepository roomRepository; @Autowired private HotelRepository hotelRepository;
 public List<Room> getAllRooms(){return roomRepository.findAll();}
 public Room getRoomById(Long id){return roomRepository.findById(id).orElseThrow(()->new RuntimeException("Room not found"));}
 public List<Room> getAvailableRooms(){return roomRepository.findByIsAvailableTrue();}
 public List<Room> getRoomsByHotel(Long hotelId){return roomRepository.findByHotelId(hotelId);}
 @Transactional public Room createRoom(RoomDTO d){Hotel h=hotelRepository.findById(d.getHotelId()).orElseThrow(()->new RuntimeException("Hotel not found")); Room r=new Room();r.setHotel(h);r.setRoomNumber(d.getRoomNumber());r.setRoomType(d.getRoomType());r.setPricePerNight(d.getPricePerNight());r.setCapacity(d.getCapacity());r.setDescription(d.getDescription());r.setIsAvailable(true);return roomRepository.save(r);}
 @Transactional public Room updateRoom(Long id,RoomDTO d){Room r=getRoomById(id);if(d.getRoomNumber()!=null)r.setRoomNumber(d.getRoomNumber());if(d.getRoomType()!=null)r.setRoomType(d.getRoomType());if(d.getPricePerNight()!=null)r.setPricePerNight(d.getPricePerNight());if(d.getCapacity()!=null)r.setCapacity(d.getCapacity());if(d.getDescription()!=null)r.setDescription(d.getDescription());if(d.getIsAvailable()!=null)r.setIsAvailable(d.getIsAvailable());return roomRepository.save(r);}
 @Transactional public void deleteRoom(Long id){roomRepository.deleteById(id);}
}
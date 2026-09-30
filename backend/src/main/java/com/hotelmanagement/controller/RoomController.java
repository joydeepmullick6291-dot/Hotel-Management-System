package com.hotelmanagement.controller;
import com.hotelmanagement.dto.RoomDTO; import com.hotelmanagement.entity.Room; import com.hotelmanagement.service.RoomService; import jakarta.validation.Valid; import org.springframework.http.*; import org.springframework.security.access.prepost.PreAuthorize; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/rooms") @CrossOrigin(origins="*") public class RoomController {
 private final RoomService roomService; public RoomController(RoomService roomService){this.roomService=roomService;}
 @GetMapping public ResponseEntity<List<Room>> getAllRooms(){return ResponseEntity.ok(roomService.getAllRooms());}
 @GetMapping("/{id}") public ResponseEntity<Room> getRoomById(@PathVariable Long id){try{return ResponseEntity.ok(roomService.getRoomById(id));}catch(RuntimeException e){return ResponseEntity.notFound().build();}}
 @GetMapping("/available") public ResponseEntity<List<Room>> getAvailableRooms(){return ResponseEntity.ok(roomService.getAvailableRooms());}
 @GetMapping("/hotel/{hotelId}") public ResponseEntity<List<Room>> getRoomsByHotel(@PathVariable Long hotelId){return ResponseEntity.ok(roomService.getRoomsByHotel(hotelId));}
 @PostMapping @PreAuthorize("hasRole('ADMIN')") public ResponseEntity<?> createRoom(@Valid @RequestBody RoomDTO d){try{return ResponseEntity.status(201).body(roomService.createRoom(d));}catch(RuntimeException e){return ResponseEntity.badRequest().body(e.getMessage());}}
 @PutMapping("/{id}") @PreAuthorize("hasRole('ADMIN')") public ResponseEntity<?> updateRoom(@PathVariable Long id,@Valid @RequestBody RoomDTO d){try{return ResponseEntity.ok(roomService.updateRoom(id,d));}catch(RuntimeException e){return ResponseEntity.status(404).body(e.getMessage());}}
 @DeleteMapping("/{id}") @PreAuthorize("hasRole('ADMIN')") public ResponseEntity<?> deleteRoom(@PathVariable Long id){try{roomService.deleteRoom(id);return ResponseEntity.ok("Room deleted successfully");}catch(RuntimeException e){return ResponseEntity.status(404).body(e.getMessage());}}
}
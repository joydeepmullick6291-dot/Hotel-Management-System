package com.hotelmanagement.controller;
import com.hotelmanagement.dto.RoomDTO; import com.hotelmanagement.entity.*; import com.hotelmanagement.service.*; import org.springframework.beans.factory.annotation.Autowired; import org.springframework.http.ResponseEntity; import org.springframework.security.access.prepost.PreAuthorize; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/admin") @CrossOrigin(origins="*") public class AdminController {
 @Autowired private UserService userService; @Autowired private BookingService bookingService; @Autowired private RoomService roomService;
 @GetMapping("/users") @PreAuthorize("hasRole('ADMIN')") public ResponseEntity<List<User>> getAllUsers(){return ResponseEntity.ok(userService.getAllUsers());}
 @GetMapping("/bookings") @PreAuthorize("hasRole('ADMIN')") public ResponseEntity<List<Booking>> getAllBookings(){return ResponseEntity.ok(bookingService.getAllBookings());}
 @PostMapping("/rooms") @PreAuthorize("hasRole('ADMIN')") public ResponseEntity<Room> createRoom(@RequestBody RoomDTO d){return ResponseEntity.ok(roomService.createRoom(d));}
 @PutMapping("/rooms/{id}") @PreAuthorize("hasRole('ADMIN')") public ResponseEntity<Room> updateRoom(@PathVariable Long id,@RequestBody RoomDTO d){return ResponseEntity.ok(roomService.updateRoom(id,d));}
 @DeleteMapping("/rooms/{id}") @PreAuthorize("hasRole('ADMIN')") public ResponseEntity<Void> deleteRoom(@PathVariable Long id){roomService.deleteRoom(id);return ResponseEntity.noContent().build();}
}
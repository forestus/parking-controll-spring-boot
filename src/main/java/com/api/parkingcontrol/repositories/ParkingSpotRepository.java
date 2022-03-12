package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;
// pode ou não anotar com @Repository o JpaRepository ja vem com a anotação default
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByApartmentAndBlock(String apartment, String block);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);

    Page<ParkingSpotModel> findAll(Pageable pageable);
}

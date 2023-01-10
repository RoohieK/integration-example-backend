package org.launchcode.inventorytrackerspringboot.repository;

import org.launchcode.inventorytrackerspringboot.model.ExampleInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleInventoryRepository extends JpaRepository<ExampleInventory,Integer> {
}
